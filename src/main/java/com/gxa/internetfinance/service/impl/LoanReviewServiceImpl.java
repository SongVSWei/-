package com.gxa.internetfinance.service.impl;

import com.gxa.internetfinance.mapper.BorrowCheckMapper;
import com.gxa.internetfinance.pojo.po.BorrowCheck;
import com.gxa.internetfinance.service.LoanReviewService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @Author：Win
 * @Date: 2021/6/6 19:03
 * @Description:
 */
@Service
@Transactional(readOnly = true)
public class LoanReviewServiceImpl implements LoanReviewService {
    @Resource
    private BorrowCheckMapper borrowCheckMapper;

    /**
     * 添加审核信息的方法
     *
     * @param borrowCheck 审核信息
     * @return result of operation
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
    public Integer insert(BorrowCheck borrowCheck) {
//        添加创建时间和更新时间
        borrowCheck.setGmtCreated(new Date(System.currentTimeMillis()));
        borrowCheck.setGmtModified(new Date(System.currentTimeMillis()));
        return borrowCheckMapper.insert(borrowCheck);
    }
}
