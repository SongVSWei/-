package com.gxa.internetfinance.mapper;


import com.gxa.internetfinance.pojo.po.BorrowSubjectType;
import com.gxa.internetfinance.pojo.po.BorrowSubjectTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BorrowSubjectTypeMapper {
    long countByExample(BorrowSubjectTypeExample example);

    int deleteByExample(BorrowSubjectTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BorrowSubjectType record);

    int insertSelective(BorrowSubjectType record);

    List<BorrowSubjectType> selectByExample(BorrowSubjectTypeExample example);

    BorrowSubjectType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BorrowSubjectType record, @Param("example") BorrowSubjectTypeExample example);

    int updateByExample(@Param("record") BorrowSubjectType record, @Param("example") BorrowSubjectTypeExample example);

    int updateByPrimaryKeySelective(BorrowSubjectType record);

    int updateByPrimaryKey(BorrowSubjectType record);
}