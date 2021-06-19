package com.gxa.internetfinance.pojo.po;

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
import java.io.Serializable;

/**
 * 提现表(TbWidthdraw)实体类
 *
 * @author makejava
 * @since 2021-06-08 10:41:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "体现记录实体类")
public class TbWidthdraw implements Serializable {
    private static final long serialVersionUID = 626943542871743469L;

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
     * 审核时间
     */
    @ApiModelProperty(value = "审核时间" ,name="tbWidthdrawAuditTime")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    private Timestamp tbWidthdrawAuditTime;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    @ApiModelProperty(value = "创建时间")
    private Timestamp tbWidthdrawCreateTime;
    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    @ApiModelProperty(value = "更新时间")
    private Timestamp tbWidthdrawUpdateTime;
    /**
     * 是否删除，1已删除，0未删除，默认未删除
     */
    @ApiModelProperty(value = "是否删除，1已删除，0未删除")
    private Integer tbWidthdrawIsDeleted;

    /**
     * 交易id
     */
    @ApiModelProperty(value = "交易id")
    private Integer tbWidthdrawTransactionId;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String tbWidthdrawDesc;






}
