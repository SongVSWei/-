package com.gxa.internetfinance.service;

import com.gxa.internetfinance.pojo.po.BorrowCheck;

/**
 * @Author：Win
 * @Date: 2021/6/6 19:03
 * @Description:
 */
public interface LoanReviewService {
    /**
     * 添加审核信息的方法
     *
     * @param borrowCheck 审核信息
     * @return result of operation
     */
    Integer insert(BorrowCheck borrowCheck);
}
