package com.gxa.internetfinance.pojo.po;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * tb_user_money_log
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "资金日志")
public class TbUserMoneyLog implements Serializable {
    private Integer tbUserMoneyLogId;

    /**
     * 用户姓名
     */
    @ApiModelProperty(value = "用户姓名")
    private String tbUserMoneyLogName;

    /**
     * 用户手机
     */
    @ApiModelProperty(value = "用户手机")
    private String tbUserMoneyLogPhone;

    /**
     * 资金类型
     */
    @ApiModelProperty(value = "资金类型")
    private String tbUserMoneyLogType;

    /**
     * 操作金额
     */
    @ApiModelProperty(value = "操作金额")
    private Double tbUserMoneyLogMoney;

    /**
     * 操作前可用余额
     */
    @ApiModelProperty(value = "操作前可用余额")
    private Double tbUserMoneyLogBeforeMoney;

    /**
     * 操作后可用余额
     */
    @ApiModelProperty(value = "操作后可用余额")
    private Double tbUserMoneyLogAfterMoney;

    /**
     * 操作前冻结金额
     */
    @ApiModelProperty(value = "操作前冻结金额")
    private Double tbUserMoneyLogBeforeFreeze;

    /**
     * 操作后冻结金额
     */
    @ApiModelProperty(value = "操作后冻结金额")
    private Double tbUserMoneyLogAfterFreeze;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String tbUserMoneyLogDesc;

    /**
     * 操作时间
     */
    @ApiModelProperty(value = "操作时间")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    private Timestamp tbUserMoneyLogActionTime;

    private static final Long serialVersionUID = 1L;
}