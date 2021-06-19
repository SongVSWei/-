package com.gxa.internetfinance.service;

import com.gxa.internetfinance.pojo.po.BorrowSubjectInfo;
import com.gxa.internetfinance.pojo.po.BorrowSubjectType;

import java.util.List;

/**
 * @Author：Win
 * @Date: 2021/6/7 14:34
 * @Description:
 */
public interface SubjectService {
    /**
     * 添加标的类型信息
     *
     * @param borrowSubjectType 封装了标的类型信息的对象
     * @return result of operation
     */
    Integer insert(BorrowSubjectType borrowSubjectType);

    /**
     * 添加标的信息
     *
     * @param borrowSubjectInfo 封装了标的信息的对象
     * @return result of operation
     */
    Integer insert(BorrowSubjectInfo borrowSubjectInfo);

    /**
     * 查询所有的借款标类型
     *
     * @return 结果集
     */
    List<BorrowSubjectType> findAllType();

    /**
     * 修改标的类型信息
     *
     * @param borrowSubjectType 要修改的标的类型信息
     * @return result of operation
     */
    Integer update(BorrowSubjectType borrowSubjectType);
}


