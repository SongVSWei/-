package com.gxa.internetfinance.util;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 资金参数
 */
@ApiModel(value = "资金参数对象")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MoneyParam {
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
     * 手机号
     */
    @ApiModelProperty(value = "手机号")
    private String phone;

    /**
     * 用户角色
     */
    @ApiModelProperty(value = "用户角色")
    private String role;

    /**
     * 姓名
     */
    @ApiModelProperty(value = "姓名")
    private String name;

}
