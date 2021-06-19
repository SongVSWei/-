package com.gxa.internetfinance.pojo.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ExperienceVO {
    @ApiModelProperty(value = "投资人名称，模糊查询")
    private String name;

    @ApiModelProperty(value = "投资人名称")
    private String userName;

    @ApiModelProperty(value = "投资人手机")
    private String userPhone;

    @ApiModelProperty(value = "用户来源",name = "status",example = "渠道一")
    private String source;

    @ApiModelProperty(value = "状态",name = "status", example = "未使用")
    private String status;

}
