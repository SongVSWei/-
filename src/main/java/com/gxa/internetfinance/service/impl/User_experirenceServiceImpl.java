package com.gxa.internetfinance.service.impl;

import com.gxa.internetfinance.mapper.ExperirenceMapper;
import com.gxa.internetfinance.mapper.UserMapper;
import com.gxa.internetfinance.mapper.User_experienceMapper;
import com.gxa.internetfinance.pojo.po.Experience;
import com.gxa.internetfinance.pojo.vo.User_experience;
import com.gxa.internetfinance.service.ExperirenceService;
import com.gxa.internetfinance.service.User_experirenceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional(rollbackFor = Throwable.class)
@Service("user_experirenceService")
public class User_experirenceServiceImpl implements User_experirenceService {
    @Resource
    User_experienceMapper user_experienceMapper=null;

    @Override
    public List<User_experience> pageCondition(Integer current, Integer limit, String condition) {
        List<User_experience> user_experiences = user_experienceMapper.selectByPhoneOrName(condition, null, null,null,(current-1)*limit, limit);
        List<User_experience> user_experiences1 = user_experienceMapper.selectByPhoneOrName(null, condition,null,null, (current-1)*limit, limit);
        List<User_experience> user_experiences2 = user_experienceMapper.selectByPhoneOrName(null, null,condition,null, (current-1)*limit, limit);
        List<User_experience> user_experiences3 = user_experienceMapper.selectByPhoneOrName(null, null,null,condition, (current-1)*limit, limit);
        if (user_experiences.size()>0){
            return user_experiences;
        }else if (user_experiences1.size()>0){
            return user_experiences1;
        }else if (user_experiences2.size()>0){
            return user_experiences2;
        }else if (user_experiences3.size()>0){
            return user_experiences3;
        }
        return null;
    }
}
