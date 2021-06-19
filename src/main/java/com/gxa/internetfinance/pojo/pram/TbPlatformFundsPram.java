package com.gxa.internetfinance.pojo.pram;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @author 蔚枫
 * @version 1.0
 * Talk is cheap. Show me the code
 * @description 带条件的分页查询
 * @date 2021/6/9 18:03
 */
@Data
@ApiOperation(value = "平台资金带条件的分页查询")
public class TbPlatformFundsPram {


    /**
     * 交易流水号
     */
    @ApiModelProperty(value = "交易流水号")
    private String tbTransactionSerialNumber;
    /**
     * 交易类型，1平台充值，2平台提现,3个人充值,4个人提现
     */
    @ApiModelProperty(value="交易类型，1平台充值，2平台提现,3个人充值,4个人提现")
    private String tbPlatformFundsTransactionType;


    @ApiModelProperty(value = "当前页码，不填默认1", name = "page", example = "1")
    private Integer page = 1;
    @ApiModelProperty(value = "每页条数，不填默认10", name = "limit", example = "10")
    private Integer limit = 10;
    /**
     * 交易完成时间
     */
    @ApiModelProperty(value = "开始时间，格式为：yyyy-MM-dd hh:mm:ss", name = "开始日期", example = "2021-06-08 09:05:53")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    private Timestamp tbStartTime;

    @ApiModelProperty(value = "截止时间，格式为：yyyy-MM-dd hh:mm:ss", name = "开始日期", example = "2021-06-08 09:05:53")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    private Timestamp tbEndTime;
}
