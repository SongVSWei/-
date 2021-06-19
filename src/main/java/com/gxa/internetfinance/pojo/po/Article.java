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
@NoArgsConstructor
@AllArgsConstructor
public class Article implements Serializable {
    private Integer id;
    @ApiModelProperty("文章标题")
    private String name;

    @ApiModelProperty("文章类别")
    private String desc;

    @ApiModelProperty("图片存放地址")

    private String img;
    @ApiModelProperty("更新时间  发布时间")
    @JsonDeserialize(using = DateJsonDeserializer.class)
//    @JsonSerialize(using = DateJsonSerializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date releaseTime;

    @ApiModelProperty("是否上架")
    private boolean inUse;

    @ApiModelProperty("排序")
    private Integer sort;

    @ApiModelProperty("跳转链接")
    private String Url;

    @ApiModelProperty("文章正文")
    private String context;

    @ApiModelProperty("是否置顶")
    private boolean inTop;

    @ApiModelProperty("文章来源")
    private String source;

    @ApiModelProperty("作者")
    private String author;

    @ApiModelProperty("一句话描述")
    private String introduce;


}
