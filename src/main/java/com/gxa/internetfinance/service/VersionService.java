package com.gxa.internetfinance.service;

import com.gxa.internetfinance.pojo.po.Suggestion;
import com.gxa.internetfinance.pojo.po.Version;

import java.util.HashMap;
import java.util.List;

/**
 * @author Administrator
 */
public interface VersionService {

    Integer insert(Version version) ;
    Integer UpdateByInUse(Integer id);
    HashMap<String,Object> select(Integer page, Integer size, Integer inEffective);

}
