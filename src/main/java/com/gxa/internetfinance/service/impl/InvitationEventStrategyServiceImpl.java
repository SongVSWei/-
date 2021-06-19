package com.gxa.internetfinance.service.impl;

import com.gxa.internetfinance.mapper.ChechkInStrategyMapper;
import com.gxa.internetfinance.mapper.InvitationEventStrategyMapper;
import com.gxa.internetfinance.pojo.po.ChechkInStrategy;
import com.gxa.internetfinance.pojo.po.InvitationEventStrategy;
import com.gxa.internetfinance.service.ChechkInStrategyService;
import com.gxa.internetfinance.service.InvitationEventStrategyService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Transactional(rollbackFor = Throwable.class)
@Service("invitationEventStrategyService")
public class InvitationEventStrategyServiceImpl implements InvitationEventStrategyService {

    @Resource
    InvitationEventStrategyMapper invitationEventStrategyMapper=null;
    @Override
    public Integer update(InvitationEventStrategy invitationEventStrategy) {
        int update = invitationEventStrategyMapper.update(invitationEventStrategy);
        if (update>0){
            Date date=new Date();
            invitationEventStrategy.setUpdateTime(date);
            invitationEventStrategyMapper.update(invitationEventStrategy);
        }
        return update;
    }

    @Override
    public List<InvitationEventStrategy> page(Integer page, Integer size) {
        List<InvitationEventStrategy> invitationEventStrategies = invitationEventStrategyMapper.selectBypage((page - 1) * size, size);
        return invitationEventStrategies;
    }

}
