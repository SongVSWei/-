package com.gxa.internetfinance.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户资金包装类
 */
@ApiModel(value = "用户资金")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserMoneyVo {
    private Integer tbUserMoneyId;

    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id")
    private Integer tbUserId;

    /**
     * 姓名
     */
    @ApiModelProperty(value = "姓名")
    private String userName;

    /**
     * 手机
     */
    @ApiModelProperty(value = "手机")
    private String tbUserMoneyPhone;


    /**
     * 总资产
     */
    @ApiModelProperty(value = "总资产")
    private Double tbMoneyTotal;

    /**
     * 可用余额（钱包余额减去冻结的）
     */
    @ApiModelProperty(value = "可用余额")
    private Double tbUserMoneyUsable;

    /**
     * 冻结金额
     */
    @ApiModelProperty(value = "冻结余额")
    private Double tbUserMoneyFrozen=0.00;

    /**
     * 待收金额
     */
    @ApiModelProperty(value = "待收金额")
    private Double tbUserMoneyAmountCollect=0.00;

    /**
     * 累计投资
     */
    @ApiModelProperty(value = "累计投资")
    private Double tbUserMoneyTotalInvest=0.00;

    /**
     * 累计投资收益
     */
    @ApiModelProperty(value = "累计投资收益")
    private Double tbUserMoneyTotalIncome=0.00;

    /**
     * 累计借款
     */
    @ApiModelProperty(value = "累计借款")
    private Double tbUserMoneyTotalBorrow=0.00;

    /**
     * 累计还款
     */
    @ApiModelProperty(value = "累计还款")
    private Double tbUserMoneyTotalRepay=0.00;

    /**
     * 借还款差额
     */
    @ApiModelProperty(value = "借还款差额")
    private Double borrowBalanceRepay=0.00;

}
