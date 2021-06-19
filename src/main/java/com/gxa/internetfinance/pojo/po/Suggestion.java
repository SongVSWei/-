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
public class Suggestion implements Serializable {
    private Integer id;
    @ApiModelProperty("手机型号")
    private String phoneModel;

    @ApiModelProperty("意见建议")
    private String desc;

    @ApiModelProperty("意见来源")
    private String ideaSourse;

    @ApiModelProperty("是否已经处理")
    private boolean inHandle;

    @ApiModelProperty("反馈者手机号码")
    private String phone;

    @ApiModelProperty("回复")
    private String response;

    @ApiModelProperty("提交时间")
    @JsonDeserialize(using = DateJsonDeserializer.class)
//    @JsonSerialize(using = DateJsonSerializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date expireTime;


}
