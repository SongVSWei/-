package com.gxa.internetfinance.controller;

import com.gxa.internetfinance.exception.BusinessException;
import com.gxa.internetfinance.pojo.po.BorrowCheck;
import com.gxa.internetfinance.pojo.po.BorrowSubjectInfo;
import com.gxa.internetfinance.pojo.po.BorrowSubjectType;
import com.gxa.internetfinance.pojo.vo.BorrowInfoQueryVO;
import com.gxa.internetfinance.pojo.vo.BorrowInfoVO;
import com.gxa.internetfinance.service.BorrowBaseInfoService;
import com.gxa.internetfinance.service.LoanReviewService;
import com.gxa.internetfinance.service.SubjectService;
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
 * @Date: 2021/6/7 14:33
 * @Description: 标的上架、维护、添加查询借款标类别功能
 */
@CrossOrigin
@RestController
@RequestMapping("/subject")
@Api(value = "标的上下架、维护、管理、添加查询借款标类别等功能", tags = "标的上下架、维护、管理、添加查询借款标类别等功能接口")
public class SubjectController {
    @Resource
    private SubjectService subjectService;
    @Resource
    private BorrowBaseInfoService borrowBaseInfoService;
    @Resource
    private LoanReviewService loanReviewService;

    /**
     * 借款标的类别查询
     *
     * @return result of operation
     */
    @ApiOperation(value = "查询所有借款标的类别方法")
    @GetMapping("type/findAll")
    public JsonResult findAllSubjectType() {
        List<BorrowSubjectType> borrowSubjectType = subjectService.findAllType();
        return JsonResult.ok().data("info", borrowSubjectType);
    }

    /**
     * 借款标的类别修改
     *
     * @return result of operation
     */
    @ApiOperation(value = "修改借款标的类别信息的方法")
    @PostMapping("type/update")
    public JsonResult updateSubjectType(@RequestBody BorrowSubjectType borrowSubjectType) {
        subjectService.update(borrowSubjectType);
        return JsonResult.ok();
    }

    /**
     * 借款标的类别添加
     *
     * @return result of operation
     */
    @ApiOperation(value = "添加借款标的类别的方法")
    @ApiImplicitParams(@ApiImplicitParam(value = "需要添加的借款标类别对象", name = "borrowSubjectType", required = true, paramType = "body", dataType = "BorrowSubjectType"))
    @PostMapping("type/add")
    public JsonResult addSubjectType(@RequestBody BorrowSubjectType borrowSubjectType) {
        subjectService.insert(borrowSubjectType);
        return JsonResult.ok();
    }

    /**
     * 满标复审：条件分页查询所有状态为·满标待审·的方法，数据用于标的管理页面数据显示
     *
     * @param current           当前页
     * @param limit             每页显示的数量
     * @param borrowInfoQueryVO 查询条件封装对象
     * @return result of operation
     */
    @ApiOperation(value = "分页条件查询所有状态为满标复审的方法")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "当前页", name = "current", required = true, dataType = "int", paramType = "path"),
            @ApiImplicitParam(value = "每页显示的数量", name = "limit", required = true, dataType = "int", paramType = "path"),
            @ApiImplicitParam(value = "条件查询对象", name = "borrowInfoQueryVO")})
    @PostMapping("review/page/condition/{current}/{limit}")
    public JsonResult fullBidReview(
            @PathVariable Integer current,
            @PathVariable Integer limit,
            @RequestBody(required = false) BorrowInfoQueryVO borrowInfoQueryVO) {
        String condition = "满标待审";
        //        获取总记录数
        int total = borrowBaseInfoService.countCondition(borrowInfoQueryVO, condition);
        if ((current - 1) * limit > total)
            throw new BusinessException("不存在当前查询的页数，请重新输入小于当前页数的数字");
//        获取每页显示的数量集合
        List<BorrowInfoVO> borrowInfoVOS = borrowBaseInfoService.pageCondition(current, limit, borrowInfoQueryVO, condition);
        return JsonResult.ok().data("total", total).data("rows", borrowInfoVOS);
    }

    /**
     * 满标复审：根据id查询信息
     *
     * @param baseInfoId id
     * @return result of operation
     */
    @ApiOperation(value = "根据id查询满标复审的标的信息")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "当前页", name = "current", required = true, dataType = "int", paramType = "path"),
    })
    @GetMapping("get/review/info/{baseInfoId}")
    public JsonResult get(@PathVariable Integer baseInfoId) {
        BorrowInfoVO borrowInfoVO = borrowBaseInfoService.get(baseInfoId);
        return JsonResult.ok().data("info", borrowInfoVO);
    }

    /**
     * 满标复审：提交复审信息
     *
     * @param borrowCheck 需要复审对象的借款审核信息
     * @return result of operation
     */
    @ApiOperation(value = "提交复审信息")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "需要提交的复审对象信息", name = "borrowInfoVO", dataType = "BorrowInfoVO", paramType = "body", required = true)})
    @PostMapping("review/submit")
    public JsonResult reviewSubmit(@RequestBody BorrowCheck borrowCheck) {
        //        添加审核信息
        Integer insert = loanReviewService.insert(borrowCheck);
        if (insert == 0)
            throw new BusinessException("审核信息添加失败~~~");
//        根据审核信息中是否通过来设置借贷信息的状态（未通过--->初审未通过 和 通过--->待上架）
        BorrowInfoVO borrowInfoVO = borrowBaseInfoService.get(borrowCheck.getBaseInfoId());
        if (borrowCheck.getApproved()) {
//            审核通过
            borrowInfoVO.setStatus("还款中");
        } else {
//            审核未通过
            borrowInfoVO.setStatus("流标");
        }
        Integer update = borrowBaseInfoService.update(borrowInfoVO);
        if (update == 0)
            throw new BusinessException("借贷信息状态更新失败~~~");
        return JsonResult.ok();
    }

    /**
     * 所有借款标
     *
     * @param current           当前页
     * @param limit             每页显示的数量
     * @param borrowInfoQueryVO 查询条件封装对象
     * @return result of operation
     */
    @ApiOperation(value = "分页条件查询所有借款标的方法")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "当前页", name = "current", required = true, dataType = "int", paramType = "path"),
            @ApiImplicitParam(value = "每页显示的数量", name = "limit", required = true, dataType = "int", paramType = "path"),
            @ApiImplicitParam(value = "条件查询对象", name = "borrowInfoQueryVO")})
    @PostMapping("findAll/page/condition/{current}/{limit}")
    public JsonResult findAllPageCondition(
            @PathVariable Integer current,
            @PathVariable Integer limit,
            @RequestBody(required = false) BorrowInfoQueryVO borrowInfoQueryVO) {
        //        获取总记录数
        int total = borrowBaseInfoService.countCondition(borrowInfoQueryVO, null);
        if ((current - 1) * limit > total)
            throw new BusinessException("不存在当前查询的页数，请重新输入小于当前页数的数字");
//        获取每页显示的数量集合
        List<BorrowInfoVO> borrowInfoVOS = borrowBaseInfoService.pageCondition(current, limit, borrowInfoQueryVO, null);
        return JsonResult.ok().data("total", total).data("rows", borrowInfoVOS);
    }

    /**
     * 借款标的管理：条件分页查询所有状态为·募集中·的方法，数据用于标的管理页面数据显示
     *
     * @param current           当前页
     * @param limit             每页显示的数量
     * @param borrowInfoQueryVO 查询条件封装对象
     * @return result of operation
     */
    @ApiOperation(value = "分页条件查询所有状态为募集中的方法")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "当前页", name = "current", required = true, dataType = "int", paramType = "path"),
            @ApiImplicitParam(value = "每页显示的数量", name = "limit", required = true, dataType = "int", paramType = "path"),
            @ApiImplicitParam(value = "条件查询对象", name = "borrowInfoQueryVO")})
    @PostMapping("manage/page/condition/{current}/{limit}")
    public JsonResult managePageCondition(
            @PathVariable Integer current,
            @PathVariable Integer limit,
            @RequestBody(required = false) BorrowInfoQueryVO borrowInfoQueryVO) {
        String condition = "募集中";
        //        获取总记录数
        int total = borrowBaseInfoService.countCondition(borrowInfoQueryVO, condition);
        if ((current - 1) * limit > total)
            throw new BusinessException("不存在当前查询的页数，请重新输入小于当前页数的数字");
//        获取每页显示的数量集合
        List<BorrowInfoVO> borrowInfoVOS = borrowBaseInfoService.pageCondition(current, limit, borrowInfoQueryVO, condition);
        return JsonResult.ok().data("total", total).data("rows", borrowInfoVOS);
    }

    /**
     * 借款标的上架功能：
     *
     * @param borrowSubjectInfo 标的额外的提交信息
     * @param baseInfoId        借款标的主键
     * @return result of operation
     */
    @ApiOperation(value = "提交标的信息的方法")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "需要提交的标的信息对象", name = "borrowSubjectInfo", required = true, dataType = "BorrowSubjectInfo", paramType = "body"),
            @ApiImplicitParam(value = "当前标的的ID值", name = "baseInfoId", required = true, dataType = "int", paramType = "path")})
    @PostMapping("submit/{baseInfoId}")
    public JsonResult submit(@RequestBody BorrowSubjectInfo borrowSubjectInfo, @PathVariable Integer baseInfoId) {
//        关联主键
        borrowSubjectInfo.setId(baseInfoId);
        subjectService.insert(borrowSubjectInfo);
//        修改借款标的的状态信息
        BorrowInfoVO borrowInfoVO = borrowBaseInfoService.get(baseInfoId);
        borrowInfoVO.setStatus("募集中");
//        更新上架时间
        borrowBaseInfoService.update(borrowInfoVO);
        return JsonResult.ok();
    }

    /**
     * 借款标的下架功能：
     *
     * @param baseInfoId 借款标的主键
     * @return result of operation
     */
    @ApiOperation(value = "借款标的下架方法")
    @ApiImplicitParams({
            @ApiImplicitParam(
                    value = "当前标的的ID值",
                    name = "baseInfoId",
                    required = true,
                    dataType = "int",
                    paramType = "path")})
    @PostMapping("offShelf/{baseInfoId}")
    public JsonResult offShelf(@PathVariable Integer baseInfoId) {

//        修改借款标的的状态信息
        BorrowInfoVO borrowInfoVO = borrowBaseInfoService.get(baseInfoId);
        borrowInfoVO.setStatus("撤标");
//        更新
        borrowBaseInfoService.update(borrowInfoVO);
        return JsonResult.ok();
    }

    /**
     * 借款标的上架：条件分页查询所有状态为·待上架·的方法
     *
     * @param current           当前页
     * @param limit             每页显示的数量
     * @param borrowInfoQueryVO 查询条件封装对象
     * @return result of operation
     */
    @ApiOperation(value = "分页条件查询所有状态为待上架的方法")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "当前页", name = "current", required = true, dataType = "int", paramType = "path"),
            @ApiImplicitParam(value = "每页显示的数量", name = "limit", required = true, dataType = "int", paramType = "path"),
            @ApiImplicitParam(value = "条件查询对象", name = "borrowInfoQueryVO")})
    @PostMapping("page/condition/{current}/{limit}")
    public JsonResult pageInfoListWithCondition(
            @PathVariable Integer current,
            @PathVariable Integer limit,
            @RequestBody(required = false) BorrowInfoQueryVO borrowInfoQueryVO) {
        String condition = "待上架";
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
