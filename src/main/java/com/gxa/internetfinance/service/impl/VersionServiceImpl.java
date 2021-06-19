package com.gxa.internetfinance.service.impl;

import com.gxa.internetfinance.mapper.VersionMapper;
import com.gxa.internetfinance.pojo.po.Version;
import com.gxa.internetfinance.service.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Service
@Transactional(rollbackFor = Throwable.class)
public class VersionServiceImpl implements VersionService {

    @Autowired
    private VersionMapper versionMapper;
    @Override
    public Integer insert(Version version) {
        int insert = versionMapper.insert(version);
        return insert;
    }

    @Override
    public Integer UpdateByInUse(Integer id) {
        int i = versionMapper.updateByInEffictive(id);
        return i;
    }

    @Override
    public   HashMap<String, Object> select(Integer page, Integer size, Integer inEffective) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("page",(page-1)*size);
        hashMap.put("size",size);
        hashMap.put("inEffective",inEffective);
        List<Version> versions = versionMapper.selectByPrimaryKey(hashMap);
        HashMap<String, Object> hashMap1 = new HashMap<>();
        hashMap1.put("count",versionMapper.selectCount(hashMap));
        hashMap1.put("agreement",versions);
        return  hashMap1;
    }
}
