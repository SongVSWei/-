package com.gxa.internetfinance.service.impl;

import com.gxa.internetfinance.mapper.ChechkInStrategyMapper;
import com.gxa.internetfinance.mapper.NewPeopleActivityMapper;
import com.gxa.internetfinance.pojo.po.ChechkInStrategy;
import com.gxa.internetfinance.pojo.po.NewPeopleActivityStrategy;
import com.gxa.internetfinance.service.ChechkInStrategyService;
import com.gxa.internetfinance.service.NewPeopleActivityService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Transactional(rollbackFor = Throwable.class)
@Service("chechkInStrategyService")
public class ChechkInStrategyServiceImpl implements ChechkInStrategyService {

    @Resource
    ChechkInStrategyMapper chechkInStrategyMapper=null;
    @Override
    public Integer update(ChechkInStrategy chechkInStrategy) {
        int update = chechkInStrategyMapper.update(chechkInStrategy);
        if (update>0){
            Date date=new Date();
            chechkInStrategy.setUpdateTime(date);
            chechkInStrategyMapper.update(chechkInStrategy);
        }
        return update;
    }

    @Override
    public List<ChechkInStrategy> page(Integer page, Integer size) {
        List<ChechkInStrategy> chechkInStrategies = chechkInStrategyMapper.selectBypage((page - 1) * size, size);
        return chechkInStrategies;
    }

}
