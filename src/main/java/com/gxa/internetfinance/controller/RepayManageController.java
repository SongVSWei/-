package com.gxa.internetfinance.controller;

import com.alibaba.fastjson.JSON;
import com.gxa.internetfinance.exception.BusinessException;
import com.gxa.internetfinance.pojo.po.RepayManage;
import com.gxa.internetfinance.pojo.vo.BorrowInfoVO;
import com.gxa.internetfinance.pojo.vo.RepayManageQueryVO;
import com.gxa.internetfinance.pojo.vo.RepayManageVO;
import com.gxa.internetfinance.service.ParameterService;
import com.gxa.internetfinance.service.RepayManageService;
import com.gxa.internetfinance.service.impl.RepayManageServiceImpl;
import com.gxa.internetfinance.util.ExportFileUtil;
import com.gxa.internetfinance.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

/**
 * @author Zhang F
 * @version 1.0
 * @date 2021/6/8 19:58
 * 还款管理
 */

@CrossOrigin
@RestController
@RequestMapping("/repayManage")
@Api(value = "还款管理",tags = "还款管理的接口")
public class RepayManageController {

    @Resource
    private RepayManageService repayManageService;

    @ApiOperation("分页条件查询所有的管理信息")
    @ApiImplicitParams({@ApiImplicitParam(
            value = "页数",
            name = "page",
            required = true,
            dataType = "int"
    ), @ApiImplicitParam(
            value = "每页显示的数量",
            name = "size",
            required = true,
            dataType = "int"
    ), @ApiImplicitParam(
            value = "条件查询对象",
            required = false,
            name = "repayManageQueryVO"
    )})
    @PostMapping("/selectRepayMgr/{page}/{size}")
    public JsonResult selectRepayMgr(@PathVariable("page") Integer page, @PathVariable("size") Integer size, @RequestBody(required = false) RepayManageQueryVO repayManageQueryVO) {
        List<RepayManageVO> repayManageVOS = repayManageService.selectAll();
        int total = repayManageVOS.size();
        if ((page - 1) * size > total){
            throw new BusinessException("不存在当前查询的页数，请重新输入小于当前页数的数字");
        }else{
            List<RepayManageVO> repayManageVOList = repayManageService.selectBypage(page, size, repayManageQueryVO);

            if (repayManageVOList != null) {

                return JsonResult.ok().data("total",total).data("info", repayManageVOList);
            }

        }
        return null;
    }

    @ApiOperation("导出表格")
    @PostMapping("/export")
    public void export(HttpServletResponse response) {
        //导出的表格名称
        String title = "还款管理列表";

        //表中第一行表头字段
        String[] headers = {"编号","借款方","借款人手机","标名", "借款金额",
                    "期限","还款方式","期数","应还款时间","实际还款时间","预还金额","实还金额",
                    "本金","利息","逾期罚息","状态","是否逾期"};

        //从数据库查询出来的结果集
        List<RepayManageVO> repayManageVOS = repayManageService.selectAll();
        System.out.println("repayManageVOS:"+repayManageVOS);

        //具体需要写入excel需要的那些字段，这些字段从BorrowInfoVO类中拿，也就是上面的实际数据结果集的泛型
        List<String> list = Arrays.asList("id", "loanMan",
                "phone", "borrowBaseInfo.name", "borrowBaseInfo.total", "term", "interestWay",
                "stage", "expireTime","actualTime",
                "expectAmount", "actualAmount","principal","borrowBaseInfo.loanMgrInterestRate","borrowBaseInfo.overdue","status","over");
        try {
            ExportFileUtil.exportExcel(response, title, headers, repayManageVOS, list);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        try{
//            List<RepayManageVO> list = repayManageService.selectAll();
//            System.out.println("list:"+list);
//            HSSFWorkbook workbook = new HSSFWorkbook();
//            HSSFSheet sheet = workbook.createSheet("还款管理列表");
//            String fileName = "还款管理列表.xls";
//            fileName = URLEncoder.encode(fileName,"utf-8").replaceAll("\\+", "%20");
//            String[] headers = {"编号","借款方","借款人手机","标名", "借款金额",
//                    "期限","还款方式","期数","应还款时间","实际还款时间","预还金额","实还金额",
//                    "本金","利息","逾期罚息","状态","是否逾期"};
//            HSSFRow row = sheet.createRow(0);
//            for(int i=0;i<headers.length;i++){
//                HSSFCell cell = row.createCell(i);
//                HSSFRichTextString text = new HSSFRichTextString(headers[i]);
//                cell.setCellValue(text);
//            }
//            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            int rowNum = 1;
//            for (RepayManageVO item : list) {
//                HSSFRow dataRow = sheet.createRow(rowNum);
//                dataRow.createCell(0).setCellValue(rowNum);
//                dataRow.createCell(1).setCellValue(item.getId());
//                dataRow.createCell(2).setCellValue(item.getLoanMan());
//                dataRow.createCell(3).setCellValue(item.getPhone());
//                dataRow.createCell(4).setCellValue(item.getName());
//                if(item.getTotal()!=null){
//                    dataRow.createCell(5).setCellValue(item.getTotal());
//                }
//                dataRow.createCell(6).setCellValue(dateFormat.format(item.getTerm()));
//                dataRow.createCell(7).setCellValue(item.getInterestWay());
//                dataRow.createCell(8).setCellValue(item.getStage());
//                dataRow.createCell(9).setCellValue(dateFormat.format(item.getExpireTime()));
//                dataRow.createCell(10).setCellValue(dateFormat.format(item.getActualTime()));
//                if (item.getExpectAmount() != null){
//                    dataRow.createCell(11).setCellValue(item.getExpectAmount());
//                }
//                if (item.getActualAmount()!=null){
//                    dataRow.createCell(12).setCellValue(item.getActualAmount());
//                }
//                if (item.getPrincipal() != null){
//                    dataRow.createCell(13).setCellValue(item.getPrincipal());
//                }
//
//                if(item.getLoanMgrInterestRate()!=null){
//                    dataRow.createCell(14).setCellValue(item.getLoanMgrInterestRate());
//                }
//                if(item.getOverdue()!=null){
//                    dataRow.createCell(15).setCellValue(item.getOverdue());
//                }
//                if(item.getStatus() !=null){
//                    dataRow.createCell(16).setCellValue(item.getStatus());
//                }
//                if(item.getOver()!=null){
//                    dataRow.createCell(17).setCellValue(item.getOver());
//                }
//
//                rowNum++;
//            }

//            String[] title = new String[]{"编号","借款方","借款人手机","标名", "借款金额",
//                    "期限","还款方式","期数","应还款时间","实际还款时间","预还金额","实还金额",
//                    "本金","利息","逾期罚息","状态","是否逾期"};
//            response.setContentType("application/octet-stream");
//            response.setHeader("Content-disposition", "attachment;filename=" + fileName);
//            response.flushBuffer();
//            workbook.write(response.getOutputStream());
//        }catch (Exception e) {
//            e.printStackTrace();
//        }

//        HSSFWorkbook wb = new HSSFWorkbook();
//        HSSFSheet sheet = wb.createSheet("订单表");
//        sheet.setDefaultColumnWidth(15);
//        HSSFRow row = sheet.createRow(0);
//        HSSFCellStyle style = wb.createCellStyle();
////        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
//        style.setAlignment(HorizontalAlignment.CENTER);
//        HSSFCell cell = null;
//        for (int i = 0; i < title.length; i++) {
//            cell = row.createCell(i);
//            cell.setCellValue(title[i]);
//            cell.setCellStyle(style);
//        }
//        try {
////            orderService.queryPageList(page);
////            orderChargeService.reportTotal(page);
////            List<CostObject> list = page.getDatas();
//            List<RepayManageVO> list = repayManageService.selectAll();
//
//            System.out.println("list:" + list);
//            if (list != null && list.size() > 0) {
//                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//                for (int i = 0, len = list.size(); i < len; i++) {
//                    RepayManageVO r = list.get(i);
//                    row = sheet.createRow(i + 1);
//                    //setCellValue不能为空，进行判断
//                    row.createCell(0).setCellValue(r.getId());
//                    if (r.getLoanMan()==null){
//                        row.createCell(1).setCellValue(0);
//                    }else {
//                        row.createCell(1).setCellValue(r.getLoanMan());
//                    }
//                    if (r.getPhone()==null){
//                        row.createCell(2).setCellValue(0);
//                    }else {
//                        row.createCell(2).setCellValue(r.getPhone());
//                    }
//                    if (r.getName()==null){
//                        row.createCell(3).setCellValue((long)0);
//                    }else {
//                        row.createCell(3).setCellValue(r.getName());
//                    }
//                    if (r.getTotal()==null){
//                        row.createCell(4).setCellValue(0);
//                    }else {
//                        row.createCell(4).setCellValue(r.getTotal());
//                    }
//                    if (r.getTerm()==null){
//                        row.createCell(5).setCellValue(0);
//                    }else {
//                        row.createCell(5).setCellValue(r.getTerm());
//                    }
//                    if (r.getInterestWay()==null){
//                        row.createCell(6).setCellValue(0);
//                    }else {
//                        row.createCell(6).setCellValue(r.getInterestWay());
//                    }
//                    if (r.getStage()==null){
//                        row.createCell(7).setCellValue((long)0);
//                    }else {
//                        row.createCell(7).setCellValue(r.getStage());
//                    }
//                    if (r.getExpireTime()==null){
//                        row.createCell(8).setCellValue(0);
//                    }else {
//                        row.createCell(8).setCellValue(r.getExpireTime().toString());
//                    }
//                    if (r.getActualTime()==null){
//                        row.createCell(9).setCellValue((long)0);
//                    }else {
//                        row.createCell(9).setCellValue(r.getActualTime().toString());
//                    }
//                    if (r.getExpectAmount()==null){
//                        row.createCell(10).setCellValue("(null)");
//                    }else {
//                        row.createCell(10).setCellValue(r.getExpectAmount());
//                    }
//                    if (r.getActualAmount()==null){
//                        row.createCell(11).setCellValue((long)0);
//                    }else {
//                        row.createCell(11).setCellValue(r.getActualAmount());
//                    }
//                    if (r.getPrincipal()==null){
//                        row.createCell(12).setCellValue("(null)");
//                    }else {
//                        row.createCell(12).setCellValue(r.getPrincipal());
//                    }
//                    if (r.getLoanMgrInterestRate()==null){
//                        row.createCell(13).setCellValue((long)0);
//                    }else {
//                        row.createCell(13).setCellValue(r.getLoanMgrInterestRate());
//                    }
//                    if (r.getOverdue()==null){
//                        row.createCell(14).setCellValue(0);
//                    }else {
//                        row.createCell(14).setCellValue(r.getOverdue());
//                    }
//                    if (r.getStatus()==null){
//                        row.createCell(15).setCellValue("(null)");
//                    }else {
//                        row.createCell(15).setCellValue(r.getStatus());
//                    }
//                    if (r.getOver()==null){
//                        row.createCell(16).setCellValue("(null)");
//                    }else {
//                        row.createCell(16).setCellValue(r.getOver());
//                    }
//
//                }
//            }
//            OutputStream out = response.getOutputStream();
//            response.setHeader("content-disposition", "attachment; filename=exportAll.xls");
//            response.setContentType("application/octet-stream");
//            response.setCharacterEncoding("UTF-8");
//            wb.write(out);
//            out.close();
//        } catch (Exception e) {
//            throw new BusinessException("导出失败");
//        }
    }

}
