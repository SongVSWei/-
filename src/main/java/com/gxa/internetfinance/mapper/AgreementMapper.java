package com.gxa.internetfinance.mapper;


import com.gxa.internetfinance.pojo.po.Agreement;

import java.util.List;

public interface AgreementMapper {

    Integer UpdateByEdit(Agreement agreement);

    //  int  UpdateByInUse(Agreement agreement);
    Integer UpdateByInUse(Integer id, Integer inUse);

    Integer insertByAgreement(Agreement agreement);

    List<Agreement> selectAll(Integer page, Integer size);


    Integer selectCount(Integer page, Integer size);

}