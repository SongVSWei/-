package com.gxa.internetfinance.pojo.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class BorrowBaseInfo {
    private Integer id;

    private String name;

    private String userPhone;

    private Double apr;

    private String termType;

    private String interestWay;

    private Double overdue;

    private String useOfFunds;

    private String riskLevel;

    private Double total;

    private String repayment;

    private Integer loanPeriod;

    private Double loanMgrInterestRate;

    private String loanType;

    private String asd;

    private String loanInformation;

    private String status;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gmtCreated;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gmtModified;

}