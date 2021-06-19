package com.gxa.internetfinance.mapper;


import com.gxa.internetfinance.pojo.po.ChechkInStrategy;
import com.gxa.internetfinance.pojo.po.NewPeopleActivityStrategy;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChechkInStrategyMapper {

    int update(ChechkInStrategy chechkInStrategy);

    List<ChechkInStrategy> selectBypage(
            @Param("current") Integer current,
            @Param("limit") Integer limit);
}
