package com.gxa.internetfinance.pojo.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Experience implements Serializable {
    private Integer id;
    private Integer amount;
    private Integer effectiveDays;
    private Integer dailyDistributionLimit;
    private String goldReleaseSwitch;
    private String entitle;
    private Double AnnualInterestRate;
    private Integer ProjectDuration;
    private String ProjectIntroduction;

    private Integer phone;
    private String source;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date collectTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date useExpire;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date useTime;

}
