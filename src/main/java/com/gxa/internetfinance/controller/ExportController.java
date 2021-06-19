package com.gxa.internetfinance.controller;

import com.gxa.internetfinance.mapper.TbChargeMapper;
import com.gxa.internetfinance.mapper.TbUserMoneyLogMapper;
import com.gxa.internetfinance.mapper.TbUserMoneyMapper;
import com.gxa.internetfinance.mapper.TbWidthdrawMapper;
import com.gxa.internetfinance.pojo.po.TbUserMoneyLog;
import com.gxa.internetfinance.pojo.pram.TbChargePram;
import com.gxa.internetfinance.pojo.vo.BorrowInfoVO;
import com.gxa.internetfinance.pojo.vo.TbChargeVo;
import com.gxa.internetfinance.pojo.vo.UserMoneyVo;
import com.gxa.internetfinance.pojo.vo.WithdrawVo;
import com.gxa.internetfinance.service.BorrowBaseInfoService;
import com.gxa.internetfinance.util.ExportFileUtil;
import com.gxa.internetfinance.util.MoneyLogParam;
import com.gxa.internetfinance.util.MoneyParam;
import com.gxa.internetfinance.util.WithdrawParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

/**
 * @Author：Win
 * @Date: 2021/6/10 9:17
 * @Description: Excel文件导出
 */
@RestController
@CrossOrigin
@RequestMapping("/export")
@Api(value = "管理员后台端------生成Excel", tags = "管理员后台端------生成Excel接口")
public class ExportController {
    @Resource
    private BorrowBaseInfoService borrowBaseInfoService;
    private final Logger logger = LoggerFactory.getLogger(ExportController.class);
    @Resource
    private TbChargeMapper tbChargeMapper;
    @Resource
    private TbWidthdrawMapper tbWidthdrawMapper;
    @Resource
    private TbUserMoneyLogMapper tbUserMoneyLogMapper;
    @Resource
    private TbUserMoneyMapper tbUserMoneyMapper;

    /**
     * 方法描述：导出EXCEL表格
     **/
    @GetMapping("excel")
    public void exportExcel(HttpServletResponse response) {
        //导出的表格名称
        String title = "所有借款标列表";

        //表中第一行表头字段
        String[] headers = {"借款ID", "借款方", "借款人手机", "借款名称", "借款金额", "年化利率", "还款方式", "期限", "借款管理费月率", "借款管理费", "上架时间", "开售时间"};

        //从数据库查询出来的结果集
        int i = borrowBaseInfoService.countCondition(null, null);
        List<BorrowInfoVO> borrowInfoVOS = borrowBaseInfoService.pageCondition(1, i, null, null);

        //具体需要写入excel需要的那些字段，这些字段从BorrowInfoVO类中拿，也就是上面的实际数据结果集的泛型
        List<String> list = Arrays.asList("id", "userName",
                "userPhone", "name", "total", "apr", "repayment",
                "loanPeriod", "loanMgrInterestRate","loanManagementFee",
                "borrowSubjectInfo.gmtCreated", "borrowSubjectInfo.saleTime");
        try {
            ExportFileUtil.exportExcel(response, title, headers, borrowInfoVOS, list);
        } catch (Exception e) {
            if (logger.isErrorEnabled()) {
                e.printStackTrace();
                logger.error(e.getMessage());
            }
        }
    }


    /**
     * 方法描述：导出EXCEL表格
     **/
    @PostMapping("excel/charge")
    @ApiOperation("充值记录导出Excel")
    public void exportChargeExcel(HttpServletResponse response, @RequestBody TbChargePram tbChargePram) throws UnsupportedEncodingException {
        //导出的表格名称
        String title = "充值记录";

        //表中第一行表头字段
        String[] headers = {"充值ID", "用户手机", "真实姓名", "用户来源", "充值金额", "到账金额", "充值方式", "交易流水号", "订单时间","到账时间","状态"};

        //从数据库查询出来的结果集
        List<TbChargeVo> tbChargeVoList = tbChargeMapper.selectByAll(tbChargePram);
        for (TbChargeVo tbChargeVo : tbChargeVoList) {
            System.out.println(tbChargeVo);
            if(tbChargeVo.getTbTransactionIsSuccess() == 1){
                tbChargeVo.setChargeStatus("成功");
            }
            if(tbChargeVo.getTbTransactionIsSuccess() == 0){
                tbChargeVo.setChargeStatus("失败");
            }
        }
        //具体需要写入excel需要的那些字段，这些字段从TbChargeVo类中拿，也就是上面的实际数据结果集的泛型
        List<String> list = Arrays.asList("tbChargeId", "tbChargeUserPhone",
                "userName", "userResource", "tbChargeMoney", "tbChargeReceivedMoney", "tbChargeWay",
                "tbTransactionSerialNumber", "tbTransactionCreateTime","tbTransactionPublishTime","chargeStatus");
        try {
            ExportFileUtil.exportExcel(response, title, headers, tbChargeVoList, list);
        } catch (Exception e) {
            if (logger.isErrorEnabled()) {
                e.printStackTrace();
                logger.error(e.getMessage());
            }
        }
    }
    /**
     * 方法描述：提现记录导出EXCEL表格
     **/
    @PostMapping("excel/withdraw")
    @ApiOperation("提现记录导出Excel")
    public void exportWithdrawExcel(HttpServletResponse response, @RequestBody WithdrawParam param) throws UnsupportedEncodingException {
        //导出的表格名称
        String title = "提现记录";

        //表中第一行表头字段
        String[] headers = {"提现单号", "用户手机", "真实姓名", "用户类型", "提现金额","提现手续费", "到账金额", "银行账号","银行名称", "交易流水号", "提交时间","审核人","审核时间","到账时间"};

        //从数据库查询出来的结果集
        List<WithdrawVo> withdrawVoList = tbWidthdrawMapper.queryByParam(param);

        //具体需要写入excel需要的那些字段，这些字段从WithdrawVo类中拿，也就是上面的实际数据结果集的泛型
        List<String> list = Arrays.asList("tbWidthdrawId", "tbWidthdrawUserPhone",
                "userName", "userRole", "tbWidthdrawAmount", "tbWidthdrawPoundage", "tbWidhtdrawReceivedMoney","tbWidthdrawBankcard","userdetailName",
                "tbTransactionSerialNumber", "tbWidthdrawCreateTime","tbWidthdrawAuditor","tbWidthdrawAuditTime","tbTransactionPublishTime");
        try {
            ExportFileUtil.exportExcel(response, title, headers, withdrawVoList, list);
        } catch (Exception e) {
            if (logger.isErrorEnabled()) {
                e.printStackTrace();
                logger.error(e.getMessage());
            }
        }
    }

    /**
     * 方法描述：资金日志导出EXCEL表格
     **/
    @PostMapping("excel/moneyLog")
    @ApiOperation("资金日志导出Excel")
    public void exportMoneyLogExcel(HttpServletResponse response, @RequestBody MoneyLogParam param) throws UnsupportedEncodingException {
        //导出的表格名称
        String title = "资金日志";

        //表中第一行表头字段
        String[] headers = {"用户姓名", "用户手机", "资金类型", "操作金额", "操作前可用余额","操作后可用余额", "操作前冻结金额", "操作后冻结金额","备注", "操作时间"};

        //从数据库查询出来的结果集
        List<TbUserMoneyLog> logList = tbUserMoneyLogMapper.findByParam(param);

        //具体需要写入excel需要的那些字段，这些字段从TbUserMoneyLog类中拿，也就是上面的实际数据结果集的泛型
        List<String> list = Arrays.asList("tbUserMoneyLogName", "tbUserMoneyLogPhone",
                "tbUserMoneyLogType", "tbUserMoneyLogMoney", "tbUserMoneyLogBeforeMoney", "tbUserMoneyLogAfterMoney",
                "tbUserMoneyLogBeforeFreeze","tbUserMoneyLogAfterFreeze","tbUserMoneyLogDesc", "tbUserMoneyLogActionTime");
        try {
            ExportFileUtil.exportExcel(response, title, headers, logList, list);
        } catch (Exception e) {
            if (logger.isErrorEnabled()) {
                e.printStackTrace();
                logger.error(e.getMessage());
            }
        }
    }

    /**
     * 方法描述：用户资金导出EXCEL表格
     **/
    @PostMapping("excel/userMoney")
    @ApiOperation("用户资金导出Excel")
    public void exportUserMoneyExcel(HttpServletResponse response, @RequestBody MoneyParam param) throws UnsupportedEncodingException {
        //导出的表格名称
        String title = "用户资金";

        //表中第一行表头字段
        String[] headers = {"用户id","姓名", "手机", "总资产", "可用余额", "冻结金额","待收金额", "累计投资", "累计投资收益","累计借款", "累计还款","借还款差额"};

        //从数据库查询出来的结果集
        List<UserMoneyVo> userMoneyVoList = tbUserMoneyMapper.findByParam(param);

        //具体需要写入excel需要的那些字段，这些字段从UserMoneyVo类中拿，也就是上面的实际数据结果集的泛型
        List<String> list = Arrays.asList("tbUserId","userName", "tbUserMoneyPhone",
                "tbMoneyTotal", "tbUserMoneyUsable", "tbUserMoneyFrozen", "tbUserMoneyAmountCollect",
                "tbUserMoneyTotalInvest","tbUserMoneyTotalIncome","tbUserMoneyTotalBorrow", "tbUserMoneyTotalRepay","borrowBalanceRepay");
        try {
            ExportFileUtil.exportExcel(response, title, headers, userMoneyVoList, list);
        } catch (Exception e) {
            if (logger.isErrorEnabled()) {
                e.printStackTrace();
                logger.error(e.getMessage());
            }
        }
    }

    /**
     * 方法描述：提现审核列表导出EXCEL表格
     **/
    @PostMapping("excel/withdrawAudit")
    @ApiOperation("提现审核列表导出Excel")
    public void exportWithdrawAuditExcel(HttpServletResponse response, @RequestBody WithdrawParam param) throws UnsupportedEncodingException {
        //导出的表格名称
        String title = "提现审核记录";

        //表中第一行表头字段
        String[] headers = {"提现单号", "用户手机", "真实姓名", "用户类型", "提现金额","提现手续费", "到账金额", "银行账号","银行名称", "提交时间","状态"};

        //从数据库查询出来的结果集
        List<WithdrawVo> withdrawVoList = tbWidthdrawMapper.queryByParam(param);
        for (WithdrawVo withdrawVo : withdrawVoList) {
            if(withdrawVo.getTbWidthdrawAuditStatus() == 0){
                withdrawVo.setAuditStatus("待审核");
            }else if(withdrawVo.getTbWidthdrawAuditStatus() == 1){
                withdrawVo.setAuditStatus("已审核");
            }else{
                withdrawVo.setAuditStatus("审核不通过");
            }
        }
        //具体需要写入excel需要的那些字段，这些字段从WithdrawVo类中拿，也就是上面的实际数据结果集的泛型
        List<String> list = Arrays.asList("tbWidthdrawId", "tbWidthdrawUserPhone",
                "userName", "userRole", "tbWidthdrawAmount", "tbWidthdrawPoundage", "tbWidhtdrawReceivedMoney","tbWidthdrawBankcard","userdetailName",
                "tbWidthdrawCreateTime","auditStatus");
        try {
            ExportFileUtil.exportExcel(response, title, headers, withdrawVoList, list);
        } catch (Exception e) {
            if (logger.isErrorEnabled()) {
                e.printStackTrace();
                logger.error(e.getMessage());
            }
        }
    }
}
