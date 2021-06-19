package com.gxa.internetfinance.pojo.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class BorrowCheck {
    @ApiModelProperty(value = "审核表自增主键", name = "id")
    private Integer id;
    @ApiModelProperty(value = "需要审核信息的编号（借款标的标号）",
            name = "baseInfoId", required = true, example = "1")
    private Integer baseInfoId;
    @ApiModelProperty(value = "是否通过审核（0-不通过 1-通过）",
            name = "approved", required = true, example = "1")
    private Boolean approved;
    @ApiModelProperty(value = "备注",
            name = "remark", required = true, example = "请说明标的风控措施")
    private String remark;
    @ApiModelProperty(value = "创建时间",
            name = "gmtCreated", example = "2021-06-06 12:12:12")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gmtCreated;
    @ApiModelProperty(value = "更新时间",
            name = "gmtCreated", example = "2021-06-06 12:12:12")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gmtModified;
}