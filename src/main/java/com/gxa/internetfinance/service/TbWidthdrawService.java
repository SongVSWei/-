package com.gxa.internetfinance.service;

import com.gxa.internetfinance.pojo.po.TbWidthdraw;
import com.gxa.internetfinance.util.JsonResult;
import com.gxa.internetfinance.util.WithdrawParam;

import java.util.List;

/**
 * 提现表(TbWidthdraw)表服务接口
 *
 * @author makejava
 * @since 2021-06-07 16:53:27
 */
public interface TbWidthdrawService {
    /**
     * 提现
     * @param tbWidthdraw
     * @return
     */
    JsonResult withdraw(TbWidthdraw tbWidthdraw);

    /**
     * 审核
     * @param tbWidthdraw
     * @return
     */
    JsonResult audit(TbWidthdraw tbWidthdraw);

    /**
     * 最近提现记录（十五天之内）
     *
     * @param phone:用户手机号（唯一索引）
     * @return 实例对象
     */
    JsonResult LastTimeWithdraw(String phone);

    /**
     * 提现信息
     *
     * @param id:提现记录id
     * @return 实例对象
     */
    JsonResult withInfo(Integer id);

    /**
     * 通过参数条件分页查询
     * @param param
     * @return
     */
    JsonResult listByParam(WithdrawParam param);




    /**
     * 通过ID查询单条数据
     *
     * @param tbWidthdrawId 主键
     * @return 实例对象
     */
    TbWidthdraw queryById(Integer tbWidthdrawId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbWidthdraw> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbWidthdraw 实例对象
     * @return 实例对象
     */
    TbWidthdraw insert(TbWidthdraw tbWidthdraw);

    /**
     * 修改数据
     *
     * @param tbWidthdraw 实例对象
     * @return 实例对象
     */
    TbWidthdraw update(TbWidthdraw tbWidthdraw);

    /**
     * 通过主键删除数据
     *
     * @param tbWidthdrawId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer tbWidthdrawId);





}
