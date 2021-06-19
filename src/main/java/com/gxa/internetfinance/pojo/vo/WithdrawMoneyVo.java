package com.gxa.internetfinance.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 *提现审核详情的用户资产
 */
@ApiModel(value = "用户资产")
public class WithdrawMoneyVo {
    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id")
    private Integer tbUserId;

    /**
     * 总资产
     */
    @ApiModelProperty(value = "总资产")
    private Double tbMoneyTotal;



    /**
     * 可用余额（钱包余额减去冻结的）
     */
    @ApiModelProperty(value = "可用余额（可提现金额）")
    private Double tbUserMoneyUsable;
    /**
     * 可收利息
     */
    @ApiModelProperty(value = "待收利息")
    private Double tbUserMoneyColinterest;

    /**
     * 冻结金额
     */
    @ApiModelProperty(value = "冻结余额")
    private Double tbUserMoneyFrozen;

}
