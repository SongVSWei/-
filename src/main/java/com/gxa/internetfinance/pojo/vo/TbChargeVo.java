package com.gxa.internetfinance.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.gxa.internetfinance.group.Add;
import com.gxa.internetfinance.pojo.po.TbCharge;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

import java.sql.Timestamp;

/**
 * @author 蔚枫
 * @version 1.0
 * Talk is cheap. Show me the code
 * @description 充值记录
 * @date 2021/6/9 9:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbChargeVo extends TbCharge {
    /**
     * 真实姓名
     */
    private String userName;
    /**
     * 用户来源
     */
    private String userResource;
    /**
     * 交易流水号
     */
    private String tbTransactionSerialNumber;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    private Timestamp tbTransactionCreateTime;
    /**
     * 交易完成时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    private Timestamp tbTransactionPublishTime;
    /**
     * 交易状态，0成功，1失败，2充值处理中，默认成功
     */
    private Integer tbTransactionIsSuccess;
    /**
     * 充值状态
     */
    private String chargeStatus;


    /**
     * 充值ID
     */
    @JsonInclude
    @ApiModelProperty(value = "添加时id不填，自动生成", name = "tbChargeId")
    private Integer tbChargeId;
    /**
     * 用户手机
     */
    @JsonInclude
    @NotBlank(message = "充值时用户手机不能为空！", groups = {Add.class})
    @ApiModelProperty(value = "用户手机", name = "tbChargeUserPhone", required = true, example = "15520628888")
    private String tbChargeUserPhone;
    /**
     * 充值金额
     */
    @JsonInclude
    @NotBlank(message = "充值时充值金额不能为空！", groups = {Add.class})
    @ApiModelProperty(value = "充值金额", name = "tbChargeMoney", required = true, example = "1000")
    private Double tbChargeMoney;
    /**
     * 到账金额
     */
    @JsonInclude
    @ApiModelProperty(value = "到账金额可不填，会自动等于充值金额", name = "tbChargeMoney")
    private Double tbChargeReceivedMoney;
    /**
     * 充值方式
     */
    @JsonInclude
    @ApiModelProperty(value = "充值方式填入支付宝或微信,默认支付宝", name = "tbChargeMoney",example = "支付宝")
    private String tbChargeWay="支付宝";
    /**
     * 创建时间
     */
    @JsonIgnore
    //@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    private Timestamp tbChargeCreateTime;
    /**
     * 更新时间
     */
    @JsonIgnore
    //@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    private Timestamp tbChargeUpdateTime;
    /**
     * 是否删除，0未删除，1已删除，默认未删除
     */
    @JsonIgnore
    private Integer tbChargeIsDeleted;

    /**
     * 交易id,0为未交易
     */
    @JsonIgnore
    private Integer tbChargeTransactionId;


}
