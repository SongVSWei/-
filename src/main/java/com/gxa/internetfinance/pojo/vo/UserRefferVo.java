package com.gxa.internetfinance.pojo.vo;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(value = "UserRefferVO", description = "UserRefferVO进行活动发放记录显示数据的所有信息封装实体类")
public class UserRefferVo {

    @ApiModelProperty(value = "邀请人手机")
    private String userPhone;

    @ApiModelProperty(value = "被邀请人手机")
    private String refferPhone;

    @ApiModelProperty(value = "被邀请人姓名")
    private String refferName;

    @ApiModelProperty(value = "奖励事件")
    private String triggerEvent;

    @ApiModelProperty(value = "奖励")
    private String bonus;

    @ApiModelProperty(value = "基数")
    private Integer amount;

    @ApiModelProperty(value = "比例")
    private Integer AnnualInterestRate;

    @ApiModelProperty(value = "获得奖励者")
    private String bonusObject;

    @ApiModelProperty(value = "发放时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date getTime;

    @ApiModelProperty(value = "发放状态")
    private String status;
    @ApiModelProperty(value = "当前页")
    private Integer current;
    @ApiModelProperty(value = "每页显示多少条")
    private Integer size;

    @ApiModelProperty(value = "条件查询起始时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;
    @ApiModelProperty(value = "条件查询终止时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;




}
