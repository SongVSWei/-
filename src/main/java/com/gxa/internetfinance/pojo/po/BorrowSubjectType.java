package com.gxa.internetfinance.pojo.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class BorrowSubjectType {

    @ApiModelProperty(value = "借款标的类型自增主键", name = "id", required = true, example = "0")
    private Integer id;

    @ApiModelProperty(value = "借款标的类型名称", name = "name", required = true, example = "区块链")
    private String name;

    @ApiModelProperty(value = "借款标的类型排序优先级（数字越大排序越靠前）", name = "sort", required = true, example = "111")
    private Integer sort;

    @ApiModelProperty(value = "借款标的类型当前状态（是否可用···0-有效 1-禁止）", name = "status", required = true, example = "0")
    private Integer status;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "借款标的类型创建时间", name = "gmtCreated", required = true, example = "2021-06-06 12:12:12")
    private Date gmtCreated;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "借款标的类型更新时间", name = "gmtModified", required = true, example = "2021-06-06 12:12:12")
    private Date gmtModified;
}