package com.gxa.internetfinance.mapper;

import com.gxa.internetfinance.pojo.po.TbPlatformFunds;
import com.gxa.internetfinance.pojo.pram.TbPlatformFundsPram;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbPlatformFundsMapper {
    int deleteByPrimaryKey(Integer tbPlatformFundsId);

    int insert(TbPlatformFunds record);

    int insertSelective(TbPlatformFunds record);

    TbPlatformFunds selectByPrimaryKey(Integer tbPlatformFundsId);

    int updateByPrimaryKeySelective(TbPlatformFunds record);

    int updateByPrimaryKey(TbPlatformFunds record);

    List<TbPlatformFunds> selectByAll(@Param("tbPlatformFundsPram") TbPlatformFundsPram tbPlatformFundsPram);

    /**
     * 返回平台资金
     * @return
     */
    TbPlatformFunds selectByAccount();
}