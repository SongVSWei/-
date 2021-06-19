package com.gxa.internetfinance.controller;

import com.gxa.internetfinance.exception.BusinessException;
import com.gxa.internetfinance.pojo.po.BorrowCheck;
import com.gxa.internetfinance.pojo.vo.BorrowInfoQueryVO;
import com.gxa.internetfinance.pojo.vo.BorrowInfoVO;
import com.gxa.internetfinance.service.BorrowBaseInfoService;
import com.gxa.internetfinance.service.LoanReviewService;
import com.gxa.internetfinance.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author：Win
 * @Date: 2021/6/6 18:30
 * @Description: 借款审核功能
 */
@CrossOrigin
@RestController
@RequestMapping("/review")
@Api(value = "借款审核功能", tags = "借款审核功能接口")
public class LoanReviewController {
    @Resource
    private LoanReviewService loanReviewService;
    @Resource
    private BorrowBaseInfoService borrowBaseInfoService;

    /**
     * 审核借款信息是否通过的方法
     *
     * @param borrowCheck 借款审核信息
     * @return result of operation
     */
    @ApiOperation(value = "审核借款信息是否通过的方法")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "当前借款审核信息封装的对象", name = "borrowCheck")})
    @PostMapping("submit")
    public JsonResult submit(
            @RequestBody BorrowCheck borrowCheck) {
//        添加审核信息
        Integer insert = loanReviewService.insert(borrowCheck);
        if (insert == 0)
            throw new BusinessException("审核信息添加失败~~~");
//        根据审核信息中是否通过来设置借贷信息的状态（未通过--->初审未通过 和 通过--->待上架）
//        根据baseInfoId查询借款信息
        BorrowInfoVO borrowInfoVO = borrowBaseInfoService.get(borrowCheck.getBaseInfoId());
        if (borrowCheck.getApproved()) {
//            审核通过
            borrowInfoVO.setStatus("待上架");
        } else {
//            审核未通过
            borrowInfoVO.setStatus("初审未通过");
        }
        Integer update = borrowBaseInfoService.update(borrowInfoVO);
        if (update == 0)
            throw new BusinessException("借贷信息状态更新失败~~~");
        return JsonResult.ok();
    }

    /**
     * 条件分页查询所有状态为新标待审核的方法
     *
     * @param current           当前页
     * @param limit             每页显示的数量
     * @param borrowInfoQueryVO 查询条件封装对象
     * @return result of operation
     */
    @ApiOperation(value = "分页条件查询所有状态为新标待审核的方法")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "当前页", name = "current", required = true, dataType = "int", paramType = "path"),
            @ApiImplicitParam(value = "每页显示的数量", name = "limit", required = true, dataType = "int", paramType = "path"),
            @ApiImplicitParam(value = "条件查询对象", name = "borrowInfoQueryVO")})
    @PostMapping("page/condition/{current}/{limit}")
    public JsonResult pageInfoListWithCondition(
            @PathVariable Integer current,
            @PathVariable Integer limit,
            @RequestBody(required = false) BorrowInfoQueryVO borrowInfoQueryVO) {
        String condition = "新标待审核";
        //        获取总记录数
        int total = borrowBaseInfoService.countCondition(borrowInfoQueryVO, condition);
        if ((current - 1) * limit > total)
            throw new BusinessException("不存在当前查询的页数，请重新输入小于当前页数的数字");
//        获取每页显示的数量集合

//        List<BorrowInfoVO> borrowInfoVOS = loanReviewService.pageCondition(current, limit, borrowInfoQueryVO,condition);
        List<BorrowInfoVO> borrowInfoVOS = borrowBaseInfoService.pageCondition(current, limit, borrowInfoQueryVO, condition);
        return JsonResult.ok().data("total", total).data("rows", borrowInfoVOS);
    }
}
