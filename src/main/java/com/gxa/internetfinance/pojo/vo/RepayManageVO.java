package com.gxa.internetfinance.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gxa.internetfinance.pojo.po.BorrowBaseInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Zhang F
 * @version 1.0
 * @date 2021/6/8 11:10
 *
 * 还款管理页面显示数据实体类封装
 */
@Data
@ApiModel(value = "RepayManageVO", description = "RepayManageVO还款管理页面显示数据的所有信息封装实体类")
public class RepayManageVO {

    @ApiModelProperty(value = "还款编号", name = "id", required = true, example = "1")
    private Integer id;

    @ApiModelProperty(value = "借款方", name = "loanMan", required = true, example = "企业1号")
    private String loanMan;

    @ApiModelProperty(value = "借款人手机号", name = "phone", required = true, example = "13800009999")
    private String phone;

    //
    @ApiModelProperty(value = "借款标名", name = "name", required = true, example = "新手1号")
    private String name;

    //
    @ApiModelProperty(value = "借款金额", name = "total", required = true, example = "20000")
    private Double total;

    @ApiModelProperty(value = "还款期限", name = "term", required = true, example = "30")
    private Date term;

    //
    @ApiModelProperty(value = "还款方式", name = "interestWay", required = true, example = "成立计息")
    private String interestWay;

    @ApiModelProperty(value = "期数", name = "stage", required = true, example = "3")
    private String stage;

    @ApiModelProperty(value = "应还款时间", name = "expireTime", required = true, example = "2021-06-10 12:23:33")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date expireTime;

    @ApiModelProperty(value = "实际还款日期", name = "actualTime", required = true, example = "2021-06-10 12:23:33")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date actualTime;

    @ApiModelProperty(value = "预还金额", name = "expectAmount", required = true, example = "20000")
    private Double expectAmount;

    @ApiModelProperty(value = "实还金额", name = "actualAmount", required = true, example = "20000")
    private Double actualAmount;

    @ApiModelProperty(value = "本金", name = "principal", required = true, example = "20000")
    private Double principal;

    //
    @ApiModelProperty(value = "利息", name = "loanMgrInterestRate", required = true, example = "0.02")
    private Double loanMgrInterestRate;
    //
    @ApiModelProperty(value = "逾期罚息", name = "overdue", required = true, example = "0.05")
    private Double overdue;

    @ApiModelProperty(value = "状态", name = "status", required = true, example = "待还款")
    private String status;

    @ApiModelProperty(value = "是否逾期", name = "over", required = true, example = "是")
    private String over;

    private BorrowBaseInfo borrowBaseInfo;





}
