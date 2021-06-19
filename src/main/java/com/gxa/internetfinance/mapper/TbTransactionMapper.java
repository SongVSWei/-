package com.gxa.internetfinance.mapper;

import com.gxa.internetfinance.pojo.po.TbTransaction;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 交易表(TbTransaction)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-07 16:54:14
 */
public interface TbTransactionMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param tbTransactionId 主键
     * @return 实例对象
     */
    TbTransaction queryById(Integer tbTransactionId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbTransaction> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbTransaction 实例对象
     * @return 对象列表
     */
    List<TbTransaction> queryAll(TbTransaction tbTransaction);

    /**
     * 新增数据
     *
     * @param tbTransaction 实例对象
     * @return 影响行数
     */
    int insert(TbTransaction tbTransaction);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbTransaction> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbTransaction> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbTransaction> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TbTransaction> entities);

    /**
     * 修改数据
     *
     * @param tbTransaction 实例对象
     * @return 影响行数
     */
    int update(TbTransaction tbTransaction);

    /**
     * 通过主键删除数据
     *
     * @param tbTransactionId 主键
     * @return 影响行数
     */
    int deleteById(Integer tbTransactionId);



}

