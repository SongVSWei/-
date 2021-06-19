package com.gxa.internetfinance.service;

import com.gxa.internetfinance.pojo.vo.BorrowInfoQueryVO;
import com.gxa.internetfinance.pojo.vo.BorrowInfoVO;

import java.util.List;

/**
 * @Author：Win
 * @Date: 2021/6/5 16:32
 * @Description: 借贷基本信息
 */
public interface BorrowBaseInfoService {
    /**
     * 保存新增的借款信息到数据库中（对应的状态时新标草稿）
     *
     * @param baseInfoVO 基本信息VO对象
     * @return 返回成功保存后的自增主键值
     */
    Integer save(BorrowInfoVO baseInfoVO);

    /**
     * 新增借款信息提交审核方法
     *
     * @param baseInfo 基本信息VO对象
     */
    void check(BorrowInfoVO baseInfo);

    /**
     * 查询所有的新标信息
     * @return result of operation
     */
    List<BorrowInfoVO> list();


    /**
     * 条件分页查询
     * @param current 当前页
     * @param limit 每页显示的数量
     * @param borrowInfoQueryVO 条件查询封装对象
     * @return result of operation
     */
    List<BorrowInfoVO> pageCondition(Integer current, Integer limit, BorrowInfoQueryVO borrowInfoQueryVO,String condition);

    /**
     * 查询符合条件分页结果的总条数
     * @return 总记录数
     * @param borrowInfoQueryVO 查询条件
     */
    int countCondition(BorrowInfoQueryVO borrowInfoQueryVO,String condition);

    /**
     * 更新新增借款信息的方法
     * @param baseInfoVO 要更新信息封装的对象
     * @return result of operation
     */
    Integer update(BorrowInfoVO baseInfoVO);

    /**
     * 根据自增主键id查询信息
     * @param baseInfoId 自增主键id值
     * @return result of operation
     */
    BorrowInfoVO get(Integer baseInfoId);

}
