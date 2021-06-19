package com.gxa.internetfinance.pojo.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author Zhang F
 * @version 1.0
 * @date 2021/6/8 18:33
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RepayManage {

    private Integer id;
    private Integer baseId;
    private String loanMan;
    private String phone;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date term;
    private String stage;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date expireTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date actualTime;
    private Double expectAmount;
    private Double actualAmount;
    private Double principal;
    private String status;
    private String over;
    private BorrowBaseInfo borrowBaseInfo;
}
