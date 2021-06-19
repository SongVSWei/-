package com.gxa.internetfinance.mapper;

import com.gxa.internetfinance.pojo.po.User;

public interface UserDetailMapper {

    User selectByPhone(String phone);
}
