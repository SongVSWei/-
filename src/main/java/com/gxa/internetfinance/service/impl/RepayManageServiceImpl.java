package com.gxa.internetfinance.service.impl;

import com.gxa.internetfinance.mapper.BorrowBaseInfoMapper;
import com.gxa.internetfinance.mapper.RepayManageMapper;
import com.gxa.internetfinance.pojo.po.RepayManage;
import com.gxa.internetfinance.pojo.vo.BorrowInfoVO;
import com.gxa.internetfinance.pojo.vo.RepayManageQueryVO;
import com.gxa.internetfinance.pojo.vo.RepayManageVO;
import com.gxa.internetfinance.service.RepayManageService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhang F
 * @version 1.0
 * @date 2021/6/8 19:48
 */

@Service
public class RepayManageServiceImpl implements RepayManageService {

    @Resource
    private RepayManageMapper repayManageMapper;
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
    public List<RepayManageVO> selectBypage(Integer page, Integer size, RepayManageQueryVO repayManageQueryVO) {
        String loanMan = repayManageQueryVO == null ? null : repayManageQueryVO.getLoanMan();
        String phone = repayManageQueryVO == null ? null : repayManageQueryVO.getLoanPhone();
        String status = repayManageQueryVO == null ? null : repayManageQueryVO.getStatus();
        if(status == null || status.contains("全部"))
            status = null;
        List<RepayManageVO> list =repayManageMapper.selectBypage ((page - 1) * size, size,
                loanMan, phone, status);

        return list;
    }

    @Override
    public List<RepayManageVO> selectAll() {
        List<RepayManageVO> repayManageVOS = repayManageMapper.selectAll();
        return repayManageVOS;
    }

    @Override
    public Integer countByRepayMgr(RepayManage repayManage) {
        return repayManageMapper.countByRepayMgr(repayManage);
    }


}
