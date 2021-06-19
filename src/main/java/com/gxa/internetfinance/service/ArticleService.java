package com.gxa.internetfinance.service;

import com.gxa.internetfinance.pojo.po.Article;
import com.gxa.internetfinance.pojo.po.Rotation;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;

/**
 * @author Administrator
 */
public interface ArticleService {
    Integer Delete(Integer id);
    Integer insert(Article article) ;
    Integer Update(Article article);
    HashMap<String,Object> select(Article article, Integer page, Integer size, Integer inUse);

}
