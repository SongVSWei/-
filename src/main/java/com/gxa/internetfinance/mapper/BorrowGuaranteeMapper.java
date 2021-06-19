package com.gxa.internetfinance.mapper;


import com.gxa.internetfinance.pojo.po.BorrowGuarantee;
import com.gxa.internetfinance.pojo.po.BorrowGuaranteeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BorrowGuaranteeMapper {
    long countByExample(BorrowGuaranteeExample example);

    int deleteByExample(BorrowGuaranteeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BorrowGuarantee record);

    int insertSelective(BorrowGuarantee record);

    List<BorrowGuarantee> selectByExample(BorrowGuaranteeExample example);

    BorrowGuarantee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BorrowGuarantee record, @Param("example") BorrowGuaranteeExample example);

    int updateByExample(@Param("record") BorrowGuarantee record, @Param("example") BorrowGuaranteeExample example);

    int updateByPrimaryKeySelective(BorrowGuarantee record);

    int updateByPrimaryKey(BorrowGuarantee record);

}