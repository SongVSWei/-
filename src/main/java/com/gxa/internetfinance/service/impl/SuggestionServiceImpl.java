package com.gxa.internetfinance.service.impl;

import com.gxa.internetfinance.mapper.SuggestionMapper;
import com.gxa.internetfinance.pojo.po.Agreement;
import com.gxa.internetfinance.pojo.po.Suggestion;
import com.gxa.internetfinance.service.SuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
@Service
@Transactional(rollbackFor = Throwable.class)
public class SuggestionServiceImpl implements SuggestionService {
    @Autowired
    private SuggestionMapper suggestionMapper;
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer insert(Suggestion suggestion) {
        int insert = suggestionMapper.insert(suggestion);
        return insert;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer UpdateByInUse(Suggestion suggestion) {
//    public Integer UpdateByInUse(Integer id,String response) {
        Integer id = suggestion.getId();
        String response = suggestion.getResponse();
        int i = suggestionMapper.updateByInHandle(id,response);
        return i;
    }

    @Override
    public HashMap<String, Object> select(Integer page, Integer size, Suggestion suggestion,Integer inUse) {
        HashMap<String, Object>hashMap = new HashMap<>();
        hashMap.put("suggestion",suggestion);
        hashMap.put("desc",suggestion.getDesc());
        hashMap.put("inHandle",inUse);
        hashMap.put("page",(page-1)*size);
        hashMap.put("size",size);
        List<Suggestion> suggestions = suggestionMapper.selectByPrimaryKey(hashMap);
        HashMap<String, Object> hashMap1 = new HashMap<>();
        hashMap1.put("count",suggestionMapper.selectCount(hashMap));
        hashMap1.put("agreement",suggestions);
        return  hashMap1;

    }
}
