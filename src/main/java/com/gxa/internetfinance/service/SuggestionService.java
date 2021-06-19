package com.gxa.internetfinance.service;

import com.gxa.internetfinance.pojo.po.Agreement;
import com.gxa.internetfinance.pojo.po.Suggestion;

import java.util.HashMap;
import java.util.List;

/**
 * @author Administrator
 */
public interface SuggestionService {

    Integer insert(Suggestion suggestion) ;
    Integer UpdateByInUse(Suggestion suggestion);
    HashMap<String,Object> select(Integer page, Integer size, Suggestion suggestion,Integer inUse);

}
