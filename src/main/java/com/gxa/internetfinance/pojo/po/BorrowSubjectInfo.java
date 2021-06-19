package com.gxa.internetfinance.pojo.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(value = "BorrowSubjectInfo", description = "BorrowSubjectInfo--标的上架信息封装实体")
public class BorrowSubjectInfo {
    @ApiModelProperty(value = "借款标的信息的主键", name = "id", required = true, example = "5")
    private Integer id;

    @ApiModelProperty(value = "标的类型ID值", name = "typeId", required = true, example = "1")
    private Integer typeId;

    @ApiModelProperty(value = "标的递增金额档位（100、200、500、1000等）", name = "incrementalAmount", required = true, example = "100")
    private Integer incrementalAmount;

    @ApiModelProperty(value = "标的投资计息方式（成交日、T+1、T+2、成立计息）", name = "investmentInterestCalWay", required = true, example = "成交日")
    private String investmentInterestCalWay;

    @ApiModelProperty(value = "标的是否设置精选（0-否 1-是，默认为否）", name = "investmentInterestCalWay", required = true, example = "0")
    private Boolean featured;

    @ApiModelProperty(value = "标的募集时间（0-满标为止 || 1-指定时间）", name = "recruitmentTime", required = true, example = "0")
    private Integer recruitmentTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "标的开售时间", name = "saleTime", required = true, example = "2021-06-07 12:12:12")
    private Date saleTime;

    @ApiModelProperty(value = "标的标签（高收益、低风险、官方标、红包可用、新用户仅限一次、限时抢投等）", name = "tag", required = true, example = "高收益、低风险")
    private String tag;

    @ApiModelProperty(value = "标的最低起投金额（0-999999的整数）", name = "minInvestmentAmount", required = true, example = "0")
    private Integer minInvestmentAmount;

    @ApiModelProperty(value = "标的最大可投金额（大于等于最小可投金额且小于等于借款总额的正整数）", name = "maxInvestmentAmount", required = true, example = "1000")
    private Integer maxInvestmentAmount;

    @ApiModelProperty(value = "标的上架渠道（PC || APP）", name = "shelfChannel", required = true, example = "APP")
    private String shelfChannel;

    @ApiModelProperty(value = "标的是否为新手专享（0-否 1-是）", name = "exclusiveForNovices", required = true, example = "0")
    private Boolean exclusiveForNovices;

    @ApiModelProperty(value = "标的项目介绍", name = "projectIntroduction", required = true, example = "这是高收益低风险的基金项目，快来买哟~~~")
    private String projectIntroduction;

    @ApiModelProperty(value = "标的风控措施", name = "riskControlMeasures", required = true, example = "专业的风控团队为您把关，让您高枕无忧，人在家中坐，钱从天上来")
    private String riskControlMeasures;

    @ApiModelProperty(value = "创建时间||上架时间", name = "gmtCreated", required = true, example = "2021-06-07 12:12:12")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gmtCreated;

    @ApiModelProperty(value = "更新时间", name = "gmtModified", required = true, example = "2021-06-07 12:12:12")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gmtModified;

    @ApiModelProperty(value = "标的已募集金额", name = "raisedAmount", required = true, example = "0")
    private Double raisedAmount;
}