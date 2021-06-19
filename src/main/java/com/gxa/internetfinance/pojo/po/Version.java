package com.gxa.internetfinance.pojo.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.gxa.internetfinance.config.DateJsonDeserializer;
import com.gxa.internetfinance.config.DateJsonSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor

@NoArgsConstructor
public class Version  implements Serializable {
    private Integer id;


    @ApiModelProperty("版本名称")
    private String name;

    @ApiModelProperty("更新描述")
    private String updateDesc;

    @ApiModelProperty("系统")
    private String platform;

    @ApiModelProperty("添加时间")
    @JsonDeserialize(using = DateJsonDeserializer.class)
//    @JsonSerialize(using = DateJsonSerializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date expireTime;

    @ApiModelProperty("是否有效")
    private boolean inEffective;

    @ApiModelProperty("版本号")
    private String number;

    @ApiModelProperty("应用包安装包的地址")
    private String uploadApplication;

    @ApiModelProperty("渠道1安装包的地址")
    private String uploadone;

    @ApiModelProperty("渠道2安装包的地址")
    private String uploadTwo;

    @ApiModelProperty("上传官方包的地址")
    private String uploadOffcial;


}
