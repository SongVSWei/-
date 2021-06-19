package com.gxa.internetfinance.mapper;

import com.gxa.internetfinance.pojo.vo.UserRefferVo;
import com.gxa.internetfinance.pojo.vo.User_experience;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface UserRefferVoMapper {


    List<UserRefferVo> selectByPhoneOrName(
            @Param("bonus") String bonus,
            @Param("status") String status,
            @Param("userPhone") String userPhone,
            @Param("refferName") String refferName,
            @Param("startTime") Date startTime,
            @Param("endTime") Date endTime,
            @Param("current") Integer current,
            @Param("limit") Integer limit);

}
