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
 * 提现记录封装的实体
 */
@ApiModel(value = "提现记录")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class WithdrawVo {
    /**
     * 提现id
     */
    @JsonInclude
    @ApiModelProperty(value = "添加时id不填，自动生成（提现审核时必传）", name = "tbWidthdrawId")
    private Integer tbWidthdrawId;
    /**
     * 用户手机
     */
    @JsonInclude
    @NotBlank(message = "充值时用户手机不能为空！", groups = {Add.class})
    @ApiModelProperty(value = "用户手机", name = "tbChargeUserPhone", required = true, example = "15520628888")
    private String tbWidthdrawUserPhone;
    /**
     * 用户真实姓名
     */
    @ApiModelProperty(value = "真实姓名")
    private String userName;
    /**
     * 用户类型
     */
    @ApiModelProperty(value = "用户类型")
    private String userRole;

    /**
     * 提现金额
     */
    @ApiModelProperty(value = "提现金额", name= "tbWidthdrawAmount" ,required = true)
    private Double tbWidthdrawAmount;
    /**
     * 提现手续费
     */
    @ApiModelProperty(value = "提现手续费（根据提现金额自动计算）", name= "tbWidthdrawPoundage")
    private Double tbWidthdrawPoundage;
    /**
     * 到账金额
     */
    @JsonInclude
    @ApiModelProperty(value = "到账金额（提现金额扣除手续费的）", name = "tbWidhtdrawReceivedMoney")
    private Double tbWidhtdrawReceivedMoney;
    /**
     * 银行账号
     */
    @JsonInclude
    @ApiModelProperty(value = "银行卡号", name = "tbWidthdrawBankcard")
    private String tbWidthdrawBankcard;
    /**
     * 银行名称
     */
    @JsonInclude
    @ApiModelProperty(value = "银行名称", name = "userdetailName")
    private String userdetailName;
    /**
     * 交易流水号
     */
    @ApiModelProperty(value = "交易流水号")
    private String tbTransactionSerialNumber;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @ApiModelProperty(value = "提交时间")
    private Timestamp tbWidthdrawCreateTime;

    /**
     * 审核人
     */
    @ApiModelProperty(value = "审核人（提现审核时必传）", name = "tbWidthdrawAuditor")
    private String tbWidthdrawAuditor;
    /**
     * 0未审核，1已审核，默认未审核,2审核不通过
     */
    @ApiModelProperty(value = "审核状态", name = "tbWidthdrawAuditStatus")
    private Integer tbWidthdrawAuditStatus=0;
    /**
     * 字符串类型的状态
     */
    private String auditStatus;
    /**
     * 审核时间
     */
    @ApiModelProperty(value = "审核时间" ,name="tbWidthdrawAuditTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Timestamp tbWidthdrawAuditTime;

    /**
     * 交易完成时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @ApiModelProperty(value = "到账时间")
    private Timestamp tbTransactionPublishTime;



}
