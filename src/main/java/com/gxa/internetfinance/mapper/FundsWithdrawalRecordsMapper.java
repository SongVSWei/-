package com.gxa.internetfinance.mapper;


import com.gxa.internetfinance.pojo.po.FundsWithdrawalRecords;
import com.gxa.internetfinance.pojo.po.FundsWithdrawalRecordsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FundsWithdrawalRecordsMapper {
    long countByExample(FundsWithdrawalRecordsExample example);

    int deleteByExample(FundsWithdrawalRecordsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FundsWithdrawalRecords record);

    int insertSelective(FundsWithdrawalRecords record);

    List<FundsWithdrawalRecords> selectByExample(FundsWithdrawalRecordsExample example);

    FundsWithdrawalRecords selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FundsWithdrawalRecords record, @Param("example") FundsWithdrawalRecordsExample example);

    int updateByExample(@Param("record") FundsWithdrawalRecords record, @Param("example") FundsWithdrawalRecordsExample example);

    int updateByPrimaryKeySelective(FundsWithdrawalRecords record);

    int updateByPrimaryKey(FundsWithdrawalRecords record);
}