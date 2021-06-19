package com.gxa.internetfinance.mapper;


import com.gxa.internetfinance.pojo.po.FundsRechargeRecords;
import com.gxa.internetfinance.pojo.po.FundsRechargeRecordsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FundsRechargeRecordsMapper {
    long countByExample(FundsRechargeRecordsExample example);

    int deleteByExample(FundsRechargeRecordsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FundsRechargeRecords record);

    int insertSelective(FundsRechargeRecords record);

    List<FundsRechargeRecords> selectByExample(FundsRechargeRecordsExample example);

    FundsRechargeRecords selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FundsRechargeRecords record, @Param("example") FundsRechargeRecordsExample example);

    int updateByExample(@Param("record") FundsRechargeRecords record, @Param("example") FundsRechargeRecordsExample example);

    int updateByPrimaryKeySelective(FundsRechargeRecords record);

    int updateByPrimaryKey(FundsRechargeRecords record);
}