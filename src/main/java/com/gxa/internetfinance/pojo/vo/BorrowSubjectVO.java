package com.gxa.internetfinance.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @Author：Win
 * @Date: 2021/6/5 19:15
 * @Description: 进行中标管理的页面显示数据的所有信息封装实体类
 */
@Data
@ApiModel(value = "BorrowSubjectVO", description = "BorrowSubjectVO进行中标管理的页面显示数据的所有信息封装实体类")
public class BorrowSubjectVO {

    @ApiModelProperty(value = "借款信息ID", name = "id", required = true, example = "0")
    private Integer id;

    @ApiModelProperty(value = "借款信息的标名", name = "name", required = true, example = "新标1号")
    private String name;

    @ApiModelProperty(value = "借款信息的借款人名称", name = "userName", required = true, example = "张三丰")
    private String userName;

    @ApiModelProperty(value = "借款信息的借款人手机号", name = "userPhone", required = true, example = "13888888888")
    private String userPhone;

    @ApiModelProperty(value = "借款年利率", name = "apr", required = true, example = "0.12")
    private Double apr;

    @ApiModelProperty(value = "借款总金额", name = "total", required = true, example = "20000")
    private Integer total;

    @ApiModelProperty(value = "还款方式", name = "repayment", required = true, example = "一次性还款")
    private String repayment;

    @ApiModelProperty(value = "借款期限", name = "loanPeriod", required = true, example = "5")
    private Integer loanPeriod;

    @ApiModelProperty(value = "新标状态", name = "status", example = "作废")
    private String status;

    @ApiModelProperty(value = "创建时间", name = "gmtCreated", required = true, example = "2021-06-05 20:30:30")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gmtCreated;

    @ApiModelProperty(value = "最近一次更新时间", name = "gmtModified", required = true, example = "2021-06-05 20:30:30")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gmtModified;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "标的开售时间", name = "saleTime", required = true, example = "2021-06-07 12:12:12")
    private Date saleTime;

    @ApiModelProperty(value = "标的已募集金额", name = "raisedAmount", required = true, example = "0")
    private Date raisedAmount;
}
