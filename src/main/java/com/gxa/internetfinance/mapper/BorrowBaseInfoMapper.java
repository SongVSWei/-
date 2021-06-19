package com.gxa.internetfinance.mapper;


import com.gxa.internetfinance.pojo.po.BorrowBaseInfo;
import com.gxa.internetfinance.pojo.po.BorrowBaseInfoExample;
import com.gxa.internetfinance.pojo.vo.BorrowInfoVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BorrowBaseInfoMapper {
    long countByExample(BorrowBaseInfoExample example);

    int deleteByExample(BorrowBaseInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BorrowBaseInfo record);

    int insertSelective(BorrowBaseInfo record);

    List<BorrowBaseInfo> selectByExample(BorrowBaseInfoExample example);

    BorrowBaseInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BorrowBaseInfo record, @Param("example") BorrowBaseInfoExample example);

    int updateByExample(@Param("record") BorrowBaseInfo record, @Param("example") BorrowBaseInfoExample example);

    int updateByPrimaryKeySelective(BorrowBaseInfo record);

    int updateByPrimaryKey(BorrowBaseInfo record);

    List<BorrowInfoVO> pageCondition(
            @Param("current") Integer current,
            @Param("limit") Integer limit,
            @Param("name") String name,
            @Param("userName") String userName,
            @Param("userPhone") String userPhone,
            @Param("status") String status,
            @Param("loanType") String loanType,
            @Param("condition") String condition);

    int countCondition(
            @Param("name") String name,
            @Param("userName") String userName,
            @Param("userPhone") String userPhone,
            @Param("status") String status,
            @Param("loanType") String loanType,
            @Param("condition") String condition);
}