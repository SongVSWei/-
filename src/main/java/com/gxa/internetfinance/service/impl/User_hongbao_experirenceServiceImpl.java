package com.gxa.internetfinance.service.impl;

import com.gxa.internetfinance.mapper.User_experienceMapper;
import com.gxa.internetfinance.mapper.User_hongbao_experienceMapper;
import com.gxa.internetfinance.pojo.vo.User_experience;
import com.gxa.internetfinance.pojo.vo.User_hongbao_experience;
import com.gxa.internetfinance.service.User_experirenceService;
import com.gxa.internetfinance.service.User_hongbao_experirenceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional(rollbackFor = Throwable.class)
@Service("user_hongbao_experirenceService")
public class User_hongbao_experirenceServiceImpl implements User_hongbao_experirenceService {
    @Resource
    User_hongbao_experienceMapper user_hongbao_experienceMapper=null;
    @Resource
    User_experienceMapper user_experienceMapper=null;

    @Override
    public List<User_hongbao_experience> pageCondition(Integer current, Integer limit, String condition) {
        List<User_hongbao_experience> user_hongbao_experiences = user_hongbao_experienceMapper.selectByPhoneOrName(condition, null, null, null,null,null,(current - 1) * limit, limit);
        List<User_hongbao_experience> user_hongbao_experiences1 = user_hongbao_experienceMapper.selectByPhoneOrName(null, condition, null, null,null,null,(current - 1) * limit, limit);
        List<User_hongbao_experience> user_hongbao_experiences2 = user_hongbao_experienceMapper.selectByPhoneOrName(null, null, condition, null,null,null,(current - 1) * limit, limit);
        List<User_hongbao_experience> user_hongbao_experiences3 = user_hongbao_experienceMapper.selectByPhoneOrName(null, null, null, condition, null, null, (current - 1) * limit, limit);
        List<User_hongbao_experience> user_hongbao_experiences4 = user_hongbao_experienceMapper.selectByPhoneOrName(null, null, null, null, condition, null, (current - 1) * limit, limit);
        List<User_hongbao_experience> user_hongbao_experiences5 = user_hongbao_experienceMapper.selectByPhoneOrName(null, null, null, null, null, condition, (current - 1) * limit, limit);
        if (user_hongbao_experiences.size()>0){
            return user_hongbao_experiences;
        }else if (user_hongbao_experiences1.size()>0){
            return user_hongbao_experiences1;
        }else if (user_hongbao_experiences2.size()>0){
            return user_hongbao_experiences2;
        }else if (user_hongbao_experiences3.size()>0){
            return user_hongbao_experiences3;
        }else if (user_hongbao_experiences4.size()>0){
            return user_hongbao_experiences4;
        }else if (user_hongbao_experiences5.size()>0){
            return user_hongbao_experiences5;
        }
        return null;
    }
}
