package com.gxa.internetfinance.service.impl;

import com.gxa.internetfinance.mapper.RepayRecordMapper;
import com.gxa.internetfinance.pojo.vo.RepayRecordQueryVO;
import com.gxa.internetfinance.pojo.vo.RepayRecordVO;
import com.gxa.internetfinance.service.RepayRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Zhang F
 * @version 1.0
 * @date 2021/6/8 19:48
 */

@Service
public class RepayRecordServiceImpl implements RepayRecordService {

    @Resource
    private RepayRecordMapper repayRecordMapper;
//    @Resource
//    private BorrowBaseInfoMapper borrowBaseInfoMapper;


//    @Override
//    public List<RepayManageVO> list(Integer page, Integer size, RepayManageQueryVO repayManageQueryVO) {
//        List<RepayManageVO> repayManageVOS = new ArrayList<>();
//        List<RepayManageVO> repayManage = repayManageMapper.selectBypage(null, null, null, null, null);
//        for (RepayManageVO repay : repayManage) {
//            RepayManageVO repayManageVO = new RepayManageVO();
//            BeanUtils.copyProperties(repay,repayManageVO);
//            repayManageVOS.add(repayManageVO);
//        }
//        return repayManageVOS;
//
//    }

    @Override
    public List<RepayRecordVO> selectBypage(Integer page, Integer size, RepayRecordQueryVO repayRecordQueryVO) {
        String loanMan = repayRecordQueryVO == null ? null : repayRecordQueryVO.getLoanMan();
        String phone = repayRecordQueryVO == null ? null : repayRecordQueryVO.getLoanPhone();
        String status = repayRecordQueryVO == null ? null : repayRecordQueryVO.getRepayStatus();
        if(status == null || status.contains("全部"))
            status = null;
        List<RepayRecordVO> list = repayRecordMapper.selectBypage ((page - 1) * size, size,
                loanMan, phone, status);

        return list;
    }

    @Override
    public List<RepayRecordVO> selectAll() {
        List<RepayRecordVO> repayRecordVOS = repayRecordMapper.selectAll();

        return repayRecordVOS;
    }




}
