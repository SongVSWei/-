package com.gxa.internetfinance.pojo.po;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * tb_user_money
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbUserMoney implements Serializable {
    private Integer tbUserMoneyId;

    /**
     * 用户电话
     */
    private String tbUserMoneyPhone;

    /**
     * 总资产
     */
    private Double tbMoneyTotal;

    /**
     * 钱包余额
     */
    private Double tbUserMoneyAccount;

    /**
     * 可用余额（钱包余额减去冻结的）
     */
    private Double tbUserMoneyUsable;

    /**
     * 冻结金额
     */
    private Double tbUserMoneyFrozen;

    /**
     * 可收利息
     */
    private Double tbUserMoneyColinterest;

    /**
     * 待收金额
     */
    private Double tbUserMoneyAmountCollect;

    /**
     * 累计投资
     */
    private Double tbUserMoneyTotalInvest;

    /**
     * 累计投资收益
     */
    private Double tbUserMoneyTotalIncome;

    /**
     * 累计借款
     */
    private Double tbUserMoneyTotalBorrow;

    /**
     * 累计还款
     */
    private Double tbUserMoneyTotalRepay;

    /**
     * 借还款差额
     */
    private Double borrowBalanceRepay;

}