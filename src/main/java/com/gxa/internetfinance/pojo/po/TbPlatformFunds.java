package com.gxa.internetfinance.pojo.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * tb_platform_funds
 * @author 蔚枫
 */
@ApiModel(value="平台资金")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbPlatformFunds implements Serializable {
    private Integer tbPlatformFundsId;

    /**
     * 交易流水号
     */
    @ApiModelProperty(value="交易流水号")
    private String tbPlatformFundsSerialNumber;

    /**
     * 交易类型，1平台充值，2平台提现,3个人充值,4个人提现
     */
    @ApiModelProperty(value="交易类型，1平台充值，2平台提现,3个人充值,4个人提现")
    private String tbPlatformFundsTransactionType;

    /**
     * 出入账：0入账，1出账
     */
    @ApiModelProperty(value="出入账：0入账，1出账")
    private String tbPlatformFundsAccounts;

    /**
     * 操作金额
     */
    @ApiModelProperty(value="操作金额")
    private Double tbPlatformFundsMoney;

    /**
     * 手续费
     */
    @ApiModelProperty(value="手续费")
    private Double tbPlatformFundsPoundage;

    /**
     * 操作前余额
     */
    @ApiModelProperty(value="操作前余额")
    private Double tbPlatformFundsBeforeMoneyAccount;

    /**
     * 操作后余额
     */
    @ApiModelProperty(value="操作后余额")
    private Double tbPlatformFundsAfterMoneyAccount;

    /**
     * 状态，0失败，1成功
     */
    @ApiModelProperty(value="状态，0失败，1成功")
    private Integer tbPlatformFundsStatus;

    /**
     * 备注
     */
    @ApiModelProperty(value="备注")
    private String tbPlatformFundsDesc;

    /**
     * 操作时间
     */
    @ApiModelProperty(value="操作时间")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    private Timestamp tbPlatformFundsTime;

    /**
     * 平台资金
     */
    @JsonIgnore
    private Double tbPlatformFundsMoneyAccount;

    private static final long serialVersionUID = 1L;


}