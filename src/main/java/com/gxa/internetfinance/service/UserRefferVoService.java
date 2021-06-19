package com.gxa.internetfinance.service;

import com.gxa.internetfinance.pojo.vo.UserRefferVo;
import com.gxa.internetfinance.pojo.vo.User_hongbao_experience;

import java.util.List;

public interface UserRefferVoService {


    List<UserRefferVo> pageCondition(UserRefferVo userRefferVo);
}
