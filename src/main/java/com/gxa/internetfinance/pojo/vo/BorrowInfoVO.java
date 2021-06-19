package com.gxa.internetfinance.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gxa.internetfinance.pojo.po.BorrowCheck;
import com.gxa.internetfinance.pojo.po.BorrowGuarantee;
import com.gxa.internetfinance.pojo.po.BorrowSubjectInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author：Win
 * @Date: 2021/6/5 19:15
 * @Description: 新增借款页面的所有信息封装实体类
 */
@Data
@ApiModel(value = "BorrowInfoVO", description = "BorrowInfoVO新增借款页面信息封装实体")
public class BorrowInfoVO {
    @ApiModelProperty(value = "借款信息ID", name = "id", required = true, example = "0")
    private Integer id;
    @ApiModelProperty(value = "借款信息的标名", name = "name", required = true, example = "新标1号")
    private String name;
    @ApiModelProperty(value = "借款信息的借款人名称", name = "userName", required = true, example = "张三丰")
    private String userName;
    @ApiModelProperty(value = "借款信息的借款人手机号", name = "userPhone", required = true, example = "13888888888")
    private String userPhone;
    @ApiModelProperty(value = "借款年利率", name = "apr", required = true, example = "0.12")
    private Double apr;
    @ApiModelProperty(value = "期限类型", name = "termType", required = true, example = "天")
    private String termType;
    @ApiModelProperty(value = "借款起息方式", name = "interestWay", required = true, example = "成立计息")
    private String interestWay;
    @ApiModelProperty(value = "借款逾期罚息利率", name = "overdue", required = true, example = "0.05")
    private Double overdue;
    @ApiModelProperty(value = "资金用途", name = "useOfFunds", example = "资金周转")
    private String useOfFunds;
    @ApiModelProperty(value = "风险等级", name = "riskLevel", required = true, example = "较低")
    private String riskLevel;
    @ApiModelProperty(value = "借款总金额", name = "total", required = true, example = "20000")
    private Double total;
    @ApiModelProperty(value = "还款方式", name = "repayment", required = true, example = "一次性还款")
    private String repayment;
    @ApiModelProperty(value = "借款期限", name = "loanPeriod", required = true, example = "5")
    private Integer loanPeriod;
    @ApiModelProperty(value = "借款管理费月利率", name = "loanMgrInterestRate", required = true, example = "0.03")
    private Double loanMgrInterestRate;
    @ApiModelProperty(value = "借款类型", name = "loanType", required = true, example = "续贷")
    private String loanType;
    @ApiModelProperty(value = "还款来源", name = "asd", required = true, example = "工资")
    private String asd;
    @ApiModelProperty(value = "借款资料", name = "loanInformation", required = true, example = "上传的资料图片url……")
    private String loanInformation;
    @ApiModelProperty(value = "新标状态", name = "status", example = "作废")
    private String status;
    @ApiModelProperty(value = "创建时间", name = "gmtCreated", example = "2021-06-05 20:30:30")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gmtCreated;
    @ApiModelProperty(value = "最近一次更新时间", name = "gmtModified", example = "2021-06-05 20:30:30")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gmtModified;
    @ApiModelProperty(value = "担保信息", name = "guarantee", required = true)
    private BorrowGuarantee guarantee;
    @ApiModelProperty(value = "标的具体信息", name = "borrowSubjectInfo", required = true)
    private BorrowSubjectInfo borrowSubjectInfo;
    @ApiModelProperty(value = "标的审核信息", name = "borrowChecks", required = true)
    private BorrowCheck borrowCheck;
    @ApiModelProperty(value = "借款管理费", name = "loanManagementFee", required = true, example = "200")
    private BigDecimal loanManagementFee;
    @ApiModelProperty(value = "借款标的投资进度", name = "investmentProgress", required = true, example = "5.8%")
    private String investmentProgress;
}
