package com.gxa.internetfinance.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Zhang F
 * @version 1.0
 * @date 2021/6/8 15:11
 * 还款管理查询条件的封装
 */


@Data
@ApiModel(value = "RepayScord查询对象", description = "还款记录查询条件的封装")
public class RepayRecordQueryVO {

    @ApiModelProperty(value = "借款方，模糊查询")
    private String loanMan;

    @ApiModelProperty(value = "借款人手机")
    private String loanPhone;

    @ApiModelProperty(value = "状态")
    private String repayStatus;
}
