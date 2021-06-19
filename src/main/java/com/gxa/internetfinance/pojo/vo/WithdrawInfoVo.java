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
 * 提现信息
 */
@ApiModel(value = "提现信息")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WithdrawInfoVo {
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
    @ApiModelProperty(value = "用户手机", name = "tbChargeUserPhone")
    private String tbWidthdrawUserPhone;
    /**
     * 用户真实命名
     */
    @JsonInclude
    @ApiModelProperty(value = "用户真实命名", name = "userName")
    private String userName;

    /**
     * 用户类型
     */
    @JsonInclude
    @ApiModelProperty(value = "用户类型", name = "userRole")
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
    @ApiModelProperty(value = "预计到账金额（提现金额扣除手续费的）", name = "tbWidhtdrawReceivedMoney")
    private Double tbWidhtdrawReceivedMoney;
    /**
     * 银行账号
     */
    @JsonInclude
    @ApiModelProperty(value = "银行账号", name = "tbWidthdrawBankcard")
    private String tbWidthdrawBankcard;

    /**
     * 提现银行
     */
    @JsonInclude
    @ApiModelProperty(value = "提现银行", name = "userdetailBranckName")
    private String userdetailName;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "提交时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Timestamp tbWidthdrawCreateTime;

}
