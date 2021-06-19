package com.gxa.internetfinance.pojo.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.gxa.internetfinance.config.DateJsonDeserializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rotation implements Serializable {

    @ApiModelProperty("id字段,当作主键用")
    private Integer id;

    @ApiModelProperty("轮播图的标题")
    private String name;

    @ApiModelProperty("轮播位置")
    private String desc;

    @ApiModelProperty("轮播图")
    private String img;

    @JsonDeserialize(using = DateJsonDeserializer.class)
//    @JsonSerialize(using = DateJsonSerializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty("开始时间")
    private Date startTime;

    @ApiModelProperty("结束时间")
    @JsonDeserialize(using = DateJsonDeserializer.class)
//    @JsonSerialize(using = DateJsonSerializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date stopTime;

    @ApiModelProperty("是否上架")
    private Boolean inUse;

    @ApiModelProperty("排序")
    private Integer sort;

    @ApiModelProperty("跳转链接")
    private String Url;

}
