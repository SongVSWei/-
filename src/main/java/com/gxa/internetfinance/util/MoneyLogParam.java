package com.gxa.internetfinance.util;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 资金日志参数对象
 */
@ApiModel(value = "资金日志")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MoneyLogParam {
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
     * 姓名
     */
    @ApiModelProperty(value = "姓名")
    private String name;

    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号")
    private String phone;

    /**
     * 资金类型
     */
    @ApiModelProperty(value = "资金类型")
    private String type;


}
