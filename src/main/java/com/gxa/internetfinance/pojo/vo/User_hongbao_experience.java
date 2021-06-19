package com.gxa.internetfinance.pojo.vo;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(value = "User_hongbao_experirenceVO", description = "User_hongbao_experirenceVO进行红包记录页面显示数据的所有信息封装实体类")
public class User_hongbao_experience {
    @ApiModelProperty(value = "红包名字")
    private String hongbaoName;
    @ApiModelProperty(value = "借款方名称")
    private String userName;
    @ApiModelProperty(value = "借款方手机")
    private String userPhone;
    @ApiModelProperty(value = "注册方式")
    private String userType;
    @ApiModelProperty(value = "用户来源")
    private String resource;

    @ApiModelProperty(value = "投资标名")
    private String entitle;

    @ApiModelProperty(value = "体验金金额")
    private String amount;

    @ApiModelProperty(value = "年化收益率")
    private String AnnualInterestRate;

    @ApiModelProperty(value = "新标状态")
    private String status;

    @ApiModelProperty(value = "获得时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date getTime;

    @ApiModelProperty(value = "到期时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date expireTime;

    @ApiModelProperty(value = "使用时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date useTime;
    @ApiModelProperty(value = "奖励金额")
    private String money;
}
