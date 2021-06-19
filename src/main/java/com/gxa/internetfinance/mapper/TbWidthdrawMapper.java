package com.gxa.internetfinance.mapper;

import com.gxa.internetfinance.pojo.po.TbWidthdraw;
import com.gxa.internetfinance.pojo.vo.WithdrawInfoVo;
import com.gxa.internetfinance.pojo.vo.WithdrawRecordVo;
import com.gxa.internetfinance.pojo.vo.WithdrawVo;
import com.gxa.internetfinance.util.WithdrawParam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 提现表(TbWidthdraw)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-08 10:41:19
 */
@Mapper
public interface TbWidthdrawMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param tbWidthdrawId 主键
     * @return 实例对象
     */
    TbWidthdraw queryById(Integer tbWidthdrawId);
    /**
     * 通过ID查询单条提现信息（多表）
     *
     * @param tbWidthdrawId 主键
     * @return 实例对象
     */
    WithdrawInfoVo findById(@Param("tbWidthdrawId") Integer tbWidthdrawId);


    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbWidthdraw> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 根据条件分页查询
     *
     * @param withdrawParam 参数对象
     * @return 对象列表
     */
    List<WithdrawVo> queryByParam(@Param("withdrawParam")WithdrawParam withdrawParam);

    /**
     *
     *
     * @param phone 用户手机
     * @return 对象列表
     */
    List<WithdrawRecordVo> queryByPhone(@Param("phone") String phone, @Param("startTime") String startTime, @Param("endTime") String endTime);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbWidthdraw 实例对象
     * @return 对象列表
     */
    List<TbWidthdraw> queryAll(TbWidthdraw tbWidthdraw);

    /**
     * 新增数据
     *
     * @param tbWidthdraw 实例对象
     * @return 影响行数
     */
    int insert(TbWidthdraw tbWidthdraw);

    /**
     * 审核
     *
     * @param tbWidthdraw 实例对象
     * @return 影响行数
     */
    int updateAudit(@Param("tbWidthdraw") TbWidthdraw tbWidthdraw);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbWidthdraw> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbWidthdraw> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbWidthdraw> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TbWidthdraw> entities);

    /**
     * 修改数据
     *
     * @param tbWidthdraw 实例对象
     * @return 影响行数
     */
    int update(TbWidthdraw tbWidthdraw);

    /**
     * 通过主键删除数据
     *
     * @param tbWidthdrawId 主键
     * @return 影响行数
     */
    int deleteById(Integer tbWidthdrawId);



}

