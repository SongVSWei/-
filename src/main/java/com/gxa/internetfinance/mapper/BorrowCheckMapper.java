package com.gxa.internetfinance.mapper;


import com.gxa.internetfinance.pojo.po.BorrowCheck;
import com.gxa.internetfinance.pojo.po.BorrowCheckExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BorrowCheckMapper {
    long countByExample(BorrowCheckExample example);

    int deleteByExample(BorrowCheckExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BorrowCheck record);

    int insertSelective(BorrowCheck record);

    List<BorrowCheck> selectByExample(BorrowCheckExample example);

    BorrowCheck selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BorrowCheck record, @Param("example") BorrowCheckExample example);

    int updateByExample(@Param("record") BorrowCheck record, @Param("example") BorrowCheckExample example);

    int updateByPrimaryKeySelective(BorrowCheck record);

    int updateByPrimaryKey(BorrowCheck record);

}