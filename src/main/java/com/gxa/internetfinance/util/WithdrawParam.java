package com.gxa.internetfinance.util;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 提现记录参数列表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WithdrawParam {
    /**
     * 页码
     */
    @ApiModelProperty(value = "页码")
    private Integer page=1;
    /**
     * 页容量
     */
    @ApiModelProperty(value = "页容量")
    private Integer limit=6;
    /**
     * 提现id
     */
    @ApiModelProperty(value = "提现单号")
    private Integer id;

    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号")
    private String phone;

    /**
     * 用户名
     */
    @ApiModelProperty(value = "账户名（就是真实姓名）")
    private String name;
    /**
     * 银行卡号
     */
    @ApiModelProperty(value = "银行卡号")
    private String bankCard;
    /**
     * 银行名称
     */
    @ApiModelProperty(value = "银行名称")
    private String backName;

    /**
     * 开始时间
     */
//    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    @ApiModelProperty(value = "开始时间，格式如：2020-12-01 10:00:20")
    private String startTime;

    /**
     * 结束时间
     */
    @ApiModelProperty(value = "结束时间，格式如：2020-12-12 10:00:20")
    private String endTime;





}
