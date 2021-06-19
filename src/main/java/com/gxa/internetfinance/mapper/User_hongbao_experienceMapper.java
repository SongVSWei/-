package com.gxa.internetfinance.mapper;

import com.gxa.internetfinance.pojo.vo.User_experience;
import com.gxa.internetfinance.pojo.vo.User_hongbao_experience;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface User_hongbao_experienceMapper {

    List<User_hongbao_experience> selectByPhoneOrName(
            @Param("status") String status,
            @Param("userType") String userType,
            @Param("resource") String resource,
            @Param("hongbaoName")String hongbaoName,
            @Param("userPhone") String userPhone,
            @Param("username") String username,
            @Param("current") Integer current,
            @Param("limit") Integer limit);
}
