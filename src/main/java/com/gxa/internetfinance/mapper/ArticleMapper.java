package com.gxa.internetfinance.mapper;

import com.gxa.internetfinance.pojo.po.Article;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;


public interface ArticleMapper {

    Integer insertByArticle(Article article);

    List<Article> selectComprehensive(HashMap<String,Object> hashMap);

    Integer selectCount(HashMap<String,Object> hashMap);

    Integer updateByEditAll(Article article);
    Integer deleteById(Integer id);
}