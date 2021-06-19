package com.gxa.internetfinance.service;

import com.gxa.internetfinance.pojo.po.NewPeopleActivityStrategy;
import com.gxa.internetfinance.pojo.vo.ExperienceVO;

import java.util.List;

public interface NewPeopleActivityService {

    /**
     * 新人活动策划修改
     * @param
     * @param
     * @return
     */
    Integer update(NewPeopleActivityStrategy newPeopleActivityStrategy);
    /**
     *分页查询
     */
    List<NewPeopleActivityStrategy> page(Integer page, Integer size);
}
