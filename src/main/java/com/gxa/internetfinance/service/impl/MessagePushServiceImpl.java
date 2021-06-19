package com.gxa.internetfinance.service.impl;

import com.gxa.internetfinance.mapper.HongbaoMapper;
import com.gxa.internetfinance.mapper.MessagePushMapper;
import com.gxa.internetfinance.pojo.po.Hongbao;
import com.gxa.internetfinance.pojo.po.MessagePush;
import com.gxa.internetfinance.service.HongbaoService;
import com.gxa.internetfinance.service.MessagePushService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional(rollbackFor = Throwable.class)
@Service("messagePushService")
public class MessagePushServiceImpl implements MessagePushService {
    @Resource
    MessagePushMapper messagePushMapper=null;

    @Override
    public Integer register(MessagePush messagePush) {
        Integer insert = messagePushMapper.insert(messagePush);
        return insert;
    }

    @Override
    public List<MessagePush> pageCondition(Integer page, Integer size, String title, String status) {
        List<MessagePush> messagePushes = messagePushMapper.pageCondition((page - 1), size, title, status);
        return messagePushes;
    }
    /**
     *
     * @param current 当前页
     * @param limit   每页显示的数量
     * @param experienceVO 条件查询封装的对象
     * @param condition 状态
     * @return
     */
   /* @Override
    public List<ExperienceVO> pageCondition(Integer current, Integer limit, ExperienceVO experienceVO, String condition) {
        String name = experienceVO == null ? null : experienceVO.getName();
        String userName = experienceVO == null ? null : experienceVO.getUserName();
        String userPhone = experienceVO == null ? null : experienceVO.getUserPhone();
        String status = experienceVO == null ? null : experienceVO.getStatus();
        if (status == null || status.contains("全部"))
            status = null;
        List<ExperienceVO> list = experirenceMapper.pageCondition((current - 1) * limit, limit,
                name, userName, userPhone, status,condition);
//        list中没有担保信息，所以还需要查询对应的担保信息
       *//* List<BorrowGuarantee> borrowGuarantees = borrowGuaranteeMapper.selectByExample(null);
        for (ExperienceVO borrowInfoVO : list) {
            for (BorrowGuarantee borrowGuarantee : borrowGuarantees) {
                if (borrowInfoVO.getId().equals(borrowGuarantee.getBaseInfoId())) {
                    borrowInfoVO.setGuarantee(borrowGuarantee);
                }
            }
        }*//*
        return list;
    }*/
}
