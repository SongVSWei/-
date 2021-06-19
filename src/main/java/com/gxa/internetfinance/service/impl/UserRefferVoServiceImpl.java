package com.gxa.internetfinance.service.impl;

import com.gxa.internetfinance.mapper.UserRefferVoMapper;
import com.gxa.internetfinance.mapper.User_experienceMapper;
import com.gxa.internetfinance.mapper.User_hongbao_experienceMapper;
import com.gxa.internetfinance.pojo.vo.UserRefferVo;
import com.gxa.internetfinance.pojo.vo.User_hongbao_experience;
import com.gxa.internetfinance.service.UserRefferVoService;
import com.gxa.internetfinance.service.User_hongbao_experirenceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Transactional(rollbackFor = Throwable.class)
@Service("userRefferVoService")
public class UserRefferVoServiceImpl implements UserRefferVoService {
    @Resource
    UserRefferVoMapper userRefferVoMapper=null;
    @Override
    public List<UserRefferVo> pageCondition(UserRefferVo userRefferVo) {
        Integer current = userRefferVo.getCurrent();
        Integer size = userRefferVo.getSize();
        Date startTime = userRefferVo.getStartTime();
        Date endTime = userRefferVo.getEndTime();
        String bonus = userRefferVo.getBonus();
        String status = userRefferVo.getStatus();
        String userPhone = userRefferVo.getUserPhone();
        String refferName = userRefferVo.getRefferName();
        if (refferName!=null){
            List<UserRefferVo> userRefferVos = userRefferVoMapper.selectByPhoneOrName(null, null, null, refferName,null,null, (current - 1) * size, size);
            return userRefferVos;
        }else if (userPhone!=null){
            List<UserRefferVo> userRefferVos1 = userRefferVoMapper.selectByPhoneOrName(null, null, userPhone, null,null,null ,(current - 1) * size, size);
            return  userRefferVos1;
        }else if (status!=null){
            List<UserRefferVo> userRefferVos2 = userRefferVoMapper.selectByPhoneOrName(null, status, null, null,null,null ,(current - 1) * size, size);
            return  userRefferVos2;
        }else if (bonus!=null){
            List<UserRefferVo> userRefferVos3 = userRefferVoMapper.selectByPhoneOrName(bonus, null, null, null,null,null,(current - 1) * size, size);
            return  userRefferVos3;
        }else if (startTime!=null&&endTime!=null){
            List<UserRefferVo> userRefferVos4 = userRefferVoMapper.selectByPhoneOrName(null, null, null, null, startTime, endTime, (current - 1) * size, size);
            return userRefferVos4;
        }
        return null;
    }
}
