package com.gxa.internetfinance.service;

import com.gxa.internetfinance.pojo.po.ChechkInStrategy;
import com.gxa.internetfinance.pojo.po.InvitationEventStrategy;

import java.util.List;

public interface InvitationEventStrategyService {

    /**
     * 邀请活动策划修改
     * @param
     * @param
     * @return
     */
    Integer update(InvitationEventStrategy invitationEventStrategy);
    /**
     *分页查询
     */
    List<InvitationEventStrategy> page(Integer page, Integer size);
}
