package com.gxa.internetfinance.service;

import com.gxa.internetfinance.pojo.po.Experience;
import com.gxa.internetfinance.pojo.vo.User_experience;

import java.util.List;

public interface User_experirenceService {


    /**
     * 条件分页查询
     * @param current 当前页
     * @param limit 每页显示的数量
     * @return result of operation
     */
    List<User_experience> pageCondition(Integer current, Integer limit, String condition);
}
