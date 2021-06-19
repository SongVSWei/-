package com.gxa.internetfinance.service;

import com.gxa.internetfinance.pojo.po.Hongbao;
import com.gxa.internetfinance.pojo.vo.ExperienceVO;

import java.util.List;

public interface HongbaoService {
    /**
     * 新增
     * @return
     */
    Integer register(Hongbao hongbao);
    /**
     * 红包管理模块下条件分页查询
     * @param page 当前页
     * @param size 每页显示的数量
     * @return result of operation
     */
    List<Hongbao> pageCondition(Integer page, Integer size, String name, String type);
}
