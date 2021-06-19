package com.gxa.internetfinance.pojo.po;

import java.util.Date;

public class FundsWithdrawalRecords {
    private Integer id;

    private Double withdrawalAmount;

    private Double withdrawalFee;

    private Double amountToAccount;

    private String bankSerialNumber;

    private String status;

    private Date gmtCreated;

    private Date gmtModified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public void setWithdrawalAmount(Double withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    public Double getWithdrawalFee() {
        return withdrawalFee;
    }

    public void setWithdrawalFee(Double withdrawalFee) {
        this.withdrawalFee = withdrawalFee;
    }

    public Double getAmountToAccount() {
        return amountToAccount;
    }

    public void setAmountToAccount(Double amountToAccount) {
        this.amountToAccount = amountToAccount;
    }

    public String getBankSerialNumber() {
        return bankSerialNumber;
    }

    public void setBankSerialNumber(String bankSerialNumber) {
        this.bankSerialNumber = bankSerialNumber;
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

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}