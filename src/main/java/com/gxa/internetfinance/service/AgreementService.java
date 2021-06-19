package com.gxa.internetfinance.service;

import com.gxa.internetfinance.pojo.po.Agreement;
import com.gxa.internetfinance.pojo.po.Article;

import java.util.HashMap;
import java.util.List;

/**
 * @author Administrator
 */
public interface AgreementService {

    Integer insert(Agreement agreement) ;
    Integer UpdateByEdit(Agreement agreement);
//    Integer UpdateByInUse(Agreement agreement);
    Integer UpdateByInUse(Integer id ,Integer inUse);
    HashMap<String,Object> select(Integer page, Integer size);

}
