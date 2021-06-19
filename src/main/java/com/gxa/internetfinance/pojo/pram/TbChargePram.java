package com.gxa.internetfinance.pojo.pram;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;


/**
 * @author 蔚枫
 * @version 1.0
 * Talk is cheap. Show me the code
 * @description 充值表搜索的pram
 * select tb_charge_id,tb_charge_user_phone,user_name,user_resource,tb_charge_money,tb_charge_received_money,tb_charge_way,tb_transaction_create_time,tb_transaction_publish_time,tb_transaction_is_success
 * from tb_charge c
 * left join tb_transaction t on c.tb_charge_transaction_id=t.tb_transaction_id
 * left join tb_user u on c.tb_charge_user_phone = u.user_phone
 * @date 2021/6/9 11:22
 */
@Data
@ApiModel("分页传递参数的实体对象")
@Component
public class TbChargePram {
    /**
     * 充值ID
     */
    @JsonInclude
    @ApiModelProperty(value = "充值单号", name = "tbChargeId")
    private Integer tbChargeId;
    /**
     * 充值方式
     */
    @JsonInclude
    @ApiModelProperty(value = "充值方式填入支付宝或微信,默认支付宝", name = "tbChargeMoney",example = "支付宝")
    private String tbChargeWay="支付宝";
    /**
     * 用户手机
     */
    @JsonInclude
    @ApiModelProperty(value = "用户手机", name = "tbChargeUserPhone", example = "1")
    private String tbChargeUserPhone;
    /**
     * 交易状态，0成功，1失败，2充值处理中，默认成功
     */
    @JsonInclude
    @ApiModelProperty(value = "交易状态，0成功，1失败，2充值处理中", name = "tbTransactionIsSuccess", example = "1")
    private Integer tbTransactionIsSuccess;
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
