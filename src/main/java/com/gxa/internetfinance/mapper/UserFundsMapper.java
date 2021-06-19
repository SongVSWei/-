package com.gxa.internetfinance.mapper;


import com.gxa.internetfinance.pojo.po.UserFunds;
import com.gxa.internetfinance.pojo.po.UserFundsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserFundsMapper {
    long countByExample(UserFundsExample example);

    int deleteByExample(UserFundsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserFunds record);

    int insertSelective(UserFunds record);

    List<UserFunds> selectByExample(UserFundsExample example);

    UserFunds selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserFunds record, @Param("example") UserFundsExample example);

    int updateByExample(@Param("record") UserFunds record, @Param("example") UserFundsExample example);

    int updateByPrimaryKeySelective(UserFunds record);

    int updateByPrimaryKey(UserFunds record);
}