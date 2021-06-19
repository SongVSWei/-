package com.gxa.internetfinance.pojo.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(value = "BorrowGuarantee", description = "BorrowGuarantee新增借款信息对应的担保信息")
public class BorrowGuarantee {

    @ApiModelProperty(value = "担保信息自增主键ID", name = "id", required = true, example = "0")
    private Integer id;

    @ApiModelProperty(value = "借款信息ID", name = "baseInfoId", required = true, example = "0")
    private Integer baseInfoId;

    @ApiModelProperty(value = "该条借款是否存在担保", name = "guaranteed", required = true, example = "false")
    private Boolean guaranteed;

    @ApiModelProperty(value = "抵押类型", name = "mortgageType", example = "0-无 1-房抵")
    private Integer mortgageType;

    @ApiModelProperty(value = "担保机构", name = "guaranteeAgency", example = "上海天图典当行")
    private String guaranteeAgency;

    @ApiModelProperty(value = "抵押物材料", name = "collateral", example = "抵押物材料相关图片url……")
    private String collateral;

    @ApiModelProperty(value = "创建时间", name = "gmtCreated", required = true, example = "2021-06-05 20:30:30")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gmtCreated;

    @ApiModelProperty(value = "最近一次更新时间", name = "gmtModified", required = true, example = "2021-06-05 20:30:30")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gmtModified;

}