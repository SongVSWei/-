package com.gxa.internetfinance.pojo.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Zhang F
 * @version 1.0
 * @date 2021/6/10 18:15
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RepayRecord {

    private Integer id;
    private String repayStatus;
    private String repayWay;
    private String repayMan;
//    private RepayManage repayManage;
//    private BorrowBaseInfo borrowBaseInfo;
}
