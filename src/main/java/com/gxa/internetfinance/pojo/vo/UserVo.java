package com.gxa.internetfinance.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gxa.internetfinance.pojo.po.Userdetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVo implements Serializable {

    private Integer id;
    private String name;
    private String phone;
    private String pwd;
    private String idStatus;
    private String idNum;
    private String gender;
    private String email;
    private String legalPersonName;
    private String tagRegName;
    private String referrer;
    private String remarks;
    private String  lockStatus;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/Shanghai")
    private java.util.Date regTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/Shanghai")
    private java.util.Date loginTime;
    private String resource;
    private String role;
    private String userType;

    private List<Userdetail> userdetailList;

    public UserVo(String name){
        this.name = name;
    }

    public UserVo(String name, String phone){
        this.name = name;
        this.phone = phone;
    }


    public UserVo(java.sql.Date regTime){
        this.regTime = regTime;
    }

}