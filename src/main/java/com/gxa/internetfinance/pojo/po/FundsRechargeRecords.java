package com.gxa.internetfinance.pojo.po;

import java.util.Date;

public class FundsRechargeRecords {
    private Integer id;

    private Integer userId;

    private String userSource;

    private String appSource;

    private Double rechargeAmount;

    private Double amountToAccount;

    private Double handFee;

    private String rechargeWay;

    private String tradeSerialNumber;

    private String status;

    private Date gmtCreated;

    private Date gmtMofified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserSource() {
        return userSource;
    }

    public void setUserSource(String userSource) {
        this.userSource = userSource;
    }

    public String getAppSource() {
        return appSource;
    }

    public void setAppSource(String appSource) {
        this.appSource = appSource;
    }

    public Double getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(Double rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    public Double getAmountToAccount() {
        return amountToAccount;
    }

    public void setAmountToAccount(Double amountToAccount) {
        this.amountToAccount = amountToAccount;
    }

    public Double getHandFee() {
        return handFee;
    }

    public void setHandFee(Double handFee) {
        this.handFee = handFee;
    }

    public String getRechargeWay() {
        return rechargeWay;
    }

    public void setRechargeWay(String rechargeWay) {
        this.rechargeWay = rechargeWay;
    }

    public String getTradeSerialNumber() {
        return tradeSerialNumber;
    }

    public void setTradeSerialNumber(String tradeSerialNumber) {
        this.tradeSerialNumber = tradeSerialNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public Date getGmtMofified() {
        return gmtMofified;
    }

    public void setGmtMofified(Date gmtMofified) {
        this.gmtMofified = gmtMofified;
    }
}