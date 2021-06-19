package com.gxa.internetfinance.service.impl;

import com.gxa.internetfinance.mapper.ArticleMapper;
import com.gxa.internetfinance.pojo.po.Article;
import com.gxa.internetfinance.service.ArticleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;

@Service
@Transactional(rollbackFor = Throwable.class)
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleMapper articleMapper;
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer Delete(Integer id) {
        int i = articleMapper.deleteById(id);
        return i;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer insert(Article article) {

        int i = articleMapper.insertByArticle(article);
        return i;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer Update(Article article) {

            int i = articleMapper.updateByEditAll(article);
        return i;
    }

    @Override
    public HashMap<String, Object> select(Article article, Integer page, Integer size,Integer inUse) {
        HashMap<String, Object> HashMap = new HashMap<>();
        HashMap.put("name",article.getName());
        HashMap.put("desc",article.getDesc());
        HashMap.put("inUse",inUse);
        HashMap.put("page",(page-1)*size);
        HashMap.put("size",size);

        List<Article> articles = articleMapper.selectComprehensive(HashMap);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("count",articleMapper.selectCount(HashMap));
        hashMap.put("agreement",articles);
        return  hashMap;

    }
}
