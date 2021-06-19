package com.gxa.internetfinance.config;

import com.gxa.internetfinance.mapper.BorrowBaseInfoMapper;
import com.gxa.internetfinance.mapper.BorrowSubjectInfoMapper;
import com.gxa.internetfinance.pojo.po.BorrowBaseInfo;
import com.gxa.internetfinance.pojo.po.BorrowBaseInfoExample;
import com.gxa.internetfinance.pojo.po.BorrowSubjectInfo;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/**
 * @Author：Win
 * @Date: 2021/6/9 14:13
 * @Description: 定时任务
 */
@Component
public class TimerTaskConfig {
    @Resource
    private BorrowSubjectInfoMapper borrowSubjectInfoMapper;
    @Resource
    private BorrowBaseInfoMapper borrowBaseInfoMapper;

    /**
     * 扫描·tb_borrow_base_info·数据表中的募集时间和募集金额是否满足要求，然后将状态置为满标待审
     */
    @Scheduled(cron = "0 */1 * * * ?")
    public void scheduledTask() {
//       查询标的信息中募集金额是否>=总借款金额或者开售时间+募集时长<=当前时间
//        查询状态为---募集中---总金额
        BorrowBaseInfoExample example = new BorrowBaseInfoExample();
        BorrowBaseInfoExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo("募集中");
        List<BorrowBaseInfo> borrowBaseInfos = borrowBaseInfoMapper.selectByExample(example);
//       根据---ID---查询开售时间和募集时长
        for (BorrowBaseInfo borrowBaseInfo : borrowBaseInfos) {
            Calendar calendar = Calendar.getInstance(Locale.CHINA);
            BorrowSubjectInfo borrowSubjectInfo = borrowSubjectInfoMapper.selectByPrimaryKey(borrowBaseInfo.getId());
//            需要先判断是满标为止还是指定募集时间
            if (borrowSubjectInfo.getRecruitmentTime() != 0) {
                calendar.setTime(borrowSubjectInfo.getSaleTime());
                calendar.add(Calendar.DAY_OF_MONTH, borrowSubjectInfo.getRecruitmentTime());
                if (calendar.getTime().before(Calendar.getInstance().getTime()) || borrowSubjectInfo.getRaisedAmount() >= borrowBaseInfo.getTotal()) {
                    borrowBaseInfo.setStatus("满标待审");
                    borrowBaseInfoMapper.updateByPrimaryKey(borrowBaseInfo);
                }
            } else {
                if (borrowSubjectInfo.getRaisedAmount() >= borrowBaseInfo.getTotal()) {
                    borrowBaseInfo.setStatus("满标待审");
                    borrowBaseInfoMapper.updateByPrimaryKey(borrowBaseInfo);
                }
            }
        }
    }
}
