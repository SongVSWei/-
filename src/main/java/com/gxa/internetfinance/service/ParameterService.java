package com.gxa.internetfinance.service;

import com.gxa.internetfinance.pojo.po.Parameter;
import com.gxa.internetfinance.pojo.vo.BorrowInfoQueryVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Zhang F
 * @version 1.0
 * @date 2021/6/7 15:48
 */
public interface ParameterService {

    /**
     * 查询符合条件分页结果的总条数
     * @return 总记录数
     * @param parameter 查询条件
     */
    Integer countCondition(Parameter parameter);

    List<Parameter> selectParamConfig(Integer page, Integer size, String parameterName);
//    List<Parameter> selectByLikeParamName(String paramName);
    Integer update(Parameter parameter);
    Integer addParam(Parameter parameter);
    Integer deleteParam(Integer id);
}
