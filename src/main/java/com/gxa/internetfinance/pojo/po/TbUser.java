package com.gxa.internetfinance.pojo.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * (TbUser)实体类
 *
 * @author makejava
 * @since 2021-06-08 20:31:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbUser implements Serializable {
    private static final long serialVersionUID = 494345396071693380L;

    private Integer userId;

    private String userName;

    private String userPhone;

    private String userPwd;

    private String userIdstatus;

    private String userIdnum;

    private String userGender;

    private String userEmail;

    private String userLegalpersonname;

    private String userTagregname;

    private String userReferrer;

    private String userLockstatus;

    private Timestamp userRegtime;

    private Timestamp userLogintime;

    private String userResource;

    private String userRole;

    private String userUsertype;



   

}
