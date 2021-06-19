package com.gxa.internetfinance.service.impl;

import com.gxa.internetfinance.mapper.NewPeopleActivityMapper;
import com.gxa.internetfinance.pojo.po.NewPeopleActivityStrategy;
import com.gxa.internetfinance.service.NewPeopleActivityService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Transactional(rollbackFor = Throwable.class)
@Service("newPeopleActivityService")
public class NewPeopleActivityServiceImpl implements NewPeopleActivityService {

    @Resource
    NewPeopleActivityMapper newPeopleActivityMapper=null;
    @Override
    public Integer update(NewPeopleActivityStrategy newPeopleActivityStrategy) {
        int update = newPeopleActivityMapper.update(newPeopleActivityStrategy);
        if (update>0){
            Date date=new Date();
            newPeopleActivityStrategy.setUpdateTime(date);
            newPeopleActivityMapper.update(newPeopleActivityStrategy);
        }
        return update;
    }

    @Override
    public List<NewPeopleActivityStrategy> page(Integer page, Integer size) {
        List<NewPeopleActivityStrategy> newPeopleActivityStrategies = newPeopleActivityMapper.selectBypage((page - 1) * size, size);
        return newPeopleActivityStrategies;
    }

}
