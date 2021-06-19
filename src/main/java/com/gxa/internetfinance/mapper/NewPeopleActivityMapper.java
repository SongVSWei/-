package com.gxa.internetfinance.mapper;


import com.gxa.internetfinance.pojo.po.Hongbao;
import com.gxa.internetfinance.pojo.po.Manager;
import com.gxa.internetfinance.pojo.po.ManagerExample;
import com.gxa.internetfinance.pojo.po.NewPeopleActivityStrategy;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewPeopleActivityMapper {

    int update(NewPeopleActivityStrategy newPeopleActivityStrategy);

    List<NewPeopleActivityStrategy> selectBypage(
            @Param("current") Integer current,
            @Param("limit") Integer limit);
}
