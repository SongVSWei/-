package com.gxa.internetfinance.service;

import com.gxa.internetfinance.pojo.po.ChechkInStrategy;
import com.gxa.internetfinance.pojo.po.NewPeopleActivityStrategy;

import java.util.List;

public interface ChechkInStrategyService {

    /**
     * 签到活动策划修改
     * @param
     * @param
     * @return
     */
    Integer update(ChechkInStrategy chechkInStrategy);
    /**
     *分页查询
     */
    List<ChechkInStrategy> page(Integer page, Integer size);
}
