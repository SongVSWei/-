package com.gxa.internetfinance.service;

import com.gxa.internetfinance.pojo.po.TbTransaction;

import java.util.List;

/**
 * 交易表(TbTransaction)表服务接口
 *
 * @author makejava
 * @since 2021-06-07 16:54:15
 */
public interface TbTransactionService {

    /**
     * 通过ID查询单条数据
     *
     * @param tbTransactionId 主键
     * @return 实例对象
     */
    TbTransaction queryById(Integer tbTransactionId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbTransaction> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbTransaction 实例对象
     * @return 实例对象
     */
    TbTransaction insert(TbTransaction tbTransaction);

    /**
     * 修改数据
     *
     * @param tbTransaction 实例对象
     * @return 实例对象
     */
    TbTransaction update(TbTransaction tbTransaction);

    /**
     * 通过主键删除数据
     *
     * @param tbTransactionId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer tbTransactionId);

}
