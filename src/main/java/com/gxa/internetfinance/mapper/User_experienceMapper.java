package com.gxa.internetfinance.mapper;


import com.gxa.internetfinance.pojo.vo.User_experience;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface User_experienceMapper {
    /**
     * 通过手机号或者名字查询投资标
     * @param userPhone
     * @param username
     * @return
     */
    List<User_experience> selectByPhoneOrName(
            @Param("resource") String resource,
            @Param("status") String status,
            @Param("userPhone") String userPhone,
            @Param("username") String username,
            @Param("current") Integer current,
            @Param("limit") Integer limit);
}
