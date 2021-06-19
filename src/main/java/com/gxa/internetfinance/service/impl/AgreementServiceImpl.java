package com.gxa.internetfinance.service.impl;

import com.gxa.internetfinance.mapper.AgreementMapper;
import com.gxa.internetfinance.mapper.ArticleMapper;
import com.gxa.internetfinance.pojo.po.Agreement;
import com.gxa.internetfinance.pojo.po.Article;
import com.gxa.internetfinance.service.AgreementService;
import com.gxa.internetfinance.service.ArticleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service
@Transactional(rollbackFor = Throwable.class)
public class AgreementServiceImpl implements AgreementService {
    @Resource
    private AgreementMapper agreementMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer insert(Agreement agreement) {
        int i = agreementMapper.insertByAgreement(agreement);
        return i;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer UpdateByEdit(Agreement agreement) {
        int i = agreementMapper.UpdateByEdit(agreement);
        return i;
    }

//    @Override
//    @Transactional(propagation = Propagation.REQUIRED)
//    public Integer UpdateByInUse(Agreement agreement) {
//        int i = agreementMapper.UpdateByInUse(agreement);
//        return i;
//    }
@Override
@Transactional(propagation = Propagation.REQUIRED)
public Integer UpdateByInUse(Integer id, Integer inUse) {
    int i = agreementMapper.UpdateByInUse(id,inUse);
    return i;
}

    @Override
    public  HashMap<String,Object> select(Integer page, Integer size) {
        List<Agreement> agreements = agreementMapper.selectAll((page-1)*size, size);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("count",agreementMapper.selectCount((page-1)*size, size));
        hashMap.put("agreements",agreements);
        return  hashMap;
    }






}
