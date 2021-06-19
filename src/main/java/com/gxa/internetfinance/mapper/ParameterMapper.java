package com.gxa.internetfinance.mapper;

import com.gxa.internetfinance.pojo.po.Parameter;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Zhang F
 * @version 1.0
 * @date 2021/6/7 14:30
 */
public interface ParameterMapper {

    Integer countCondition(@Param("name") String name);

    List<Parameter> selectParamConfig(@Param("page") Integer page,
                              @Param("size") Integer size,
                              @Param("name") String name);
//    List<Parameter> selectByLikeParamName(String paramName);
    Integer update(Parameter parameter);
    Integer addParam(Parameter parameter);
    Integer deleteParam(@Param("id") Integer id);
}
