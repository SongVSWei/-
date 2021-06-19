package com.gxa.internetfinance.mapper;


import com.gxa.internetfinance.pojo.po.ChechkInStrategy;
import com.gxa.internetfinance.pojo.po.InvitationEventStrategy;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InvitationEventStrategyMapper {

    int update(InvitationEventStrategy invitationEventStrategy);

    List<InvitationEventStrategy> selectBypage(
            @Param("current") Integer current,
            @Param("limit") Integer limit);

}
