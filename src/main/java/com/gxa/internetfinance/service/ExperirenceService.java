package com.gxa.internetfinance.service;

import com.gxa.internetfinance.pojo.po.Experience;
import com.gxa.internetfinance.pojo.vo.User_experience;

import java.util.List;

public interface ExperirenceService {
    /**
     * 体验标配置保存(新增)
     * @return
     */
    Integer register(Experience experience);

    List<User_experience> pageCondition(Integer current, Integer limit,String condition);

    /**
     *
     * @param page
     * @param size
     * @return
     */
    List<Experience> page(Integer page, Integer size);

}
