package com.gxa.internetfinance.service;

import com.gxa.internetfinance.pojo.po.TbCharge;
import com.gxa.internetfinance.pojo.pram.TbChargePram;
import com.gxa.internetfinance.util.JsonResult;

import java.util.List;

/**
 * 充值表(TbCharge)表服务接口
 *
 * @author makejava
 * @since 2021-06-07 16:52:40
 */
public interface TbChargeService {

    /**
     * 通过ID查询单条数据
     *
     * @param tbChargeId 主键
     * @return 实例对象
     */
    JsonResult queryById(Integer tbChargeId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbCharge> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbCharge 实例对象
     * @return 实例对象
     */
    JsonResult insert(TbCharge tbCharge);

    /**
     * 修改数据
     *
     * @param tbCharge 实例对象
     * @return 实例对象
     */
    JsonResult update(TbCharge tbCharge);

    /**
     * 通过主键删除数据
     *
     * @param tbChargeId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer tbChargeId);

    /**
     * 带条件的查询所有分页
     * @param tbChargePram
     * @return
     */
    JsonResult selectByAll(TbChargePram tbChargePram);

}
