package com.gxa.internetfinance.mapper;


import com.gxa.internetfinance.pojo.po.BorrowSubjectInfo;
import com.gxa.internetfinance.pojo.po.BorrowSubjectInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BorrowSubjectInfoMapper {
    long countByExample(BorrowSubjectInfoExample example);

    int deleteByExample(BorrowSubjectInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BorrowSubjectInfo record);

    int insertSelective(BorrowSubjectInfo record);

    List<BorrowSubjectInfo> selectByExample(BorrowSubjectInfoExample example);

    BorrowSubjectInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BorrowSubjectInfo record, @Param("example") BorrowSubjectInfoExample example);

    int updateByExample(@Param("record") BorrowSubjectInfo record, @Param("example") BorrowSubjectInfoExample example);

    int updateByPrimaryKeySelective(BorrowSubjectInfo record);

    int updateByPrimaryKey(BorrowSubjectInfo record);
}