package com.gxa.internetfinance.mapper;


import com.gxa.internetfinance.pojo.po.TbCharge;
import com.gxa.internetfinance.pojo.pram.TbChargePram;
import com.gxa.internetfinance.pojo.vo.TbChargeVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 充值表(TbCharge)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-08 10:20:05
 */
public interface TbChargeMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param tbChargeId 主键
     * @return 实例对象
     */
    TbCharge queryById(Integer tbChargeId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbCharge> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbCharge 实例对象
     * @return 对象列表
     */
    List<TbCharge> queryAll(TbCharge tbCharge);

    /**
     * 新增数据
     *
     * @param tbCharge 实例对象
     * @return 影响行数
     */
    int insert(TbCharge tbCharge);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbCharge> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbCharge> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbCharge> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TbCharge> entities);

    /**
     * 修改数据
     *
     * @param tbCharge 实例对象
     * @return 影响行数
     */
    int update(TbCharge tbCharge);

    /**
     * 通过主键删除数据
     *
     * @param tbChargeId 主键
     * @return 影响行数
     */
    int deleteById(Integer tbChargeId);

    /**
     * 带条件的查询所有分页
     * @param tbChargePram
     * @return
     */
    List<TbChargeVo> selectByAll(@Param("tbChargePram") TbChargePram tbChargePram);
}

