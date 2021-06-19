package com.gxa.internetfinance.pojo.po;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.gxa.internetfinance.config.DateJsonDeserializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Agreement implements Serializable {
    private Integer id;

    @ApiModelProperty("协议名称")
    private String name;

    @ApiModelProperty("协议类型")
    private String type;

    @ApiModelProperty("协议内容")
    private String context;

    @ApiModelProperty("协议是否启用")
    private boolean inUse;


}
