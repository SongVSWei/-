package com.gxa.internetfinance.service.impl;

import com.gxa.internetfinance.mapper.ParameterMapper;
import com.gxa.internetfinance.pojo.po.Parameter;
import com.gxa.internetfinance.service.ParameterService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Zhang F
 * @version 1.0
 * @date 2021/6/7 15:50
 */

@Service

public class ParameterServiceImpl implements ParameterService {

    @Resource
    private ParameterMapper parameterMapper;


    @Override
    public Integer countCondition(Parameter parameter) {
        String name = parameter == null ? null : parameter.getName();
        return parameterMapper.countCondition(name);
    }

    @Override
    public List<Parameter> selectParamConfig(Integer page, Integer size, String parameterName){

        return parameterMapper.selectParamConfig((page-1)*size,size,parameterName);


    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
    public Integer update(Parameter parameter) {
        Integer update = parameterMapper.update(parameter);
        if (update > 0){
            return update;
        }
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
    public Integer addParam(Parameter parameter) {
        Integer addParam = parameterMapper.addParam(parameter);
        if (addParam > 0){
            return addParam;
        }
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
    public Integer deleteParam(Integer id) {
        Integer delete = parameterMapper.deleteParam(id);
        if (delete > 0){
            return delete;
        }
        return null;
    }


}
