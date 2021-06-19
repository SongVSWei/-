package com.gxa.internetfinance.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author：Win
 * @Date: 2021/5/26 16:10
 * @Description: 封装新标查询条件的类
 */
@ApiModel(value = "BorrowBaseInfo查询对象", description = "新标信息查询对象封装")
@Data
public class BorrowInfoQueryVO {

    @ApiModelProperty(value = "新标名称，模糊查询")
    private String name;

    @ApiModelProperty(value = "借款方名称")
    private String userName;

    @ApiModelProperty(value = "借款方手机")
    private String userPhone;

    @ApiModelProperty(value = "新标状态")
    private String status;

    @ApiModelProperty(value = "借款类型")
    private String loanType;

}
