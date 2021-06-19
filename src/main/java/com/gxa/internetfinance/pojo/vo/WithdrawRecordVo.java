package com.gxa.internetfinance.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.gxa.internetfinance.group.Add;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

import java.sql.Timestamp;

/**
 * 提现记录（提现审核详情的）
 */
@ApiModel(value = "提现记录")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WithdrawRecordVo {
    /**
     * 用户手机
     */
    @JsonInclude
    @ApiModelProperty(value = "用户手机", name = "tbChargeUserPhone")
    private String tbWidthdrawUserPhone;

    /**
     * 银行账号
     */
    @JsonInclude
    @ApiModelProperty(value = "银行账号", name = "tbWidthdrawBankcard")
    private String tbWidthdrawBankcard;

    /**
     * 提现金额
     */
    @ApiModelProperty(value = "提现金额", name= "tbWidthdrawAmount" ,required = true)
    private Double tbWidthdrawAmount;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "提现时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Timestamp tbWidthdrawCreateTime;

    /**
     * 状态
     */
    @ApiModelProperty(value = "提现状态")
    private Integer tbTransactionIsSuccess;

}
