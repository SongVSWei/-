package com.gxa.internetfinance.controller;

import com.gxa.internetfinance.exception.BusinessException;
import com.gxa.internetfinance.pojo.vo.BorrowInfoQueryVO;
import com.gxa.internetfinance.pojo.vo.BorrowInfoVO;
import com.gxa.internetfinance.service.BorrowBaseInfoService;
import com.gxa.internetfinance.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Author：Win
 * @Date: 2021/6/5 18:12
 * @Description:
 */

@CrossOrigin
@RestController
@RequestMapping({"/borrow"})
@Api(value = "新增借款、新标维护功能", tags = {"新增借款、新标维护功能接口"})
public class BorrowBaseInfoController {
    @Resource
    private BorrowBaseInfoService baseInfoService;


    @ApiOperation("根据指定主键查询借贷信息")
    @ApiImplicitParams({@ApiImplicitParam(
            value = "当前借款信息的主键",
            name = "baseInfoId",
            dataType = "int",
            required = true,
            paramType = "path"
    )})
    @GetMapping({"getInfo/{baseInfoId}"})
    public JsonResult getInfo(@NotNull @PathVariable("baseInfoId") Integer baseInfoId) {
        BorrowInfoVO borrowInfoVO = this.baseInfoService.get(baseInfoId);
        return JsonResult.ok().data("info", borrowInfoVO);
    }

    @ApiOperation("新增借款页面中相关借款信息的修改方法")
    @ApiImplicitParams({@ApiImplicitParam(
            value = "需要接收的BorrowInfoVO对象信息",
            name = "baseInfo",
            dataType = "BorrowInfoVO",
            required = true,
            paramType = "body"
    )})
    @PostMapping({"updateInfo"})
    public JsonResult updateInfo(@RequestBody BorrowInfoVO baseInfo) {
        this.baseInfoService.update(baseInfo);
        return JsonResult.ok();
    }

    @ApiOperation("新增借款页面中的保存按钮执行的方法")
    @ApiImplicitParams({@ApiImplicitParam(
            value = "需要接收的BorrowInfoVO对象信息",
            name = "baseInfo",
            dataType = "BorrowInfoVO",
            required = true,
            paramType = "body"
    )})
    @PostMapping({"saveInfo"})
    public JsonResult saveInfo(@RequestBody BorrowInfoVO baseInfo) {
        Integer saveId = this.baseInfoService.save(baseInfo);
        return JsonResult.ok().data("saveId", saveId);
    }

    @ApiOperation("新增借款页面中的提交审核按钮执行的方法")
    @ApiImplicitParams({@ApiImplicitParam(
            value = "需要接收的BorrowInfoVO对象信息",
            name = "baseInfo",
            dataType = "BorrowInfoVO",
            required = true,
            paramType = "body"
    )})
    @PostMapping({"checkInfo"})
    public JsonResult submitInfoToReview(@RequestBody BorrowInfoVO baseInfo) {
        this.baseInfoService.check(baseInfo);
        return JsonResult.ok();
    }

    @ApiOperation("分页条件查询所有的新标信息")
    @ApiImplicitParams({@ApiImplicitParam(
            value = "当前页",
            name = "current",
            required = true,
            dataType = "int",
            paramType = "path"
    ), @ApiImplicitParam(
            value = "每页显示的数量",
            name = "limit",
            required = true,
            dataType = "int",
            paramType = "path"
    ), @ApiImplicitParam(
            value = "条件查询对象",
            name = "borrowInfoQueryVO",
            dataType = "BorrowInfoQueryVO",
            paramType = "body"
    )})
    @PostMapping({"page/condition/{current}/{limit}"})
    public JsonResult pageInfoListWithCondition(@PathVariable("current") Integer current, @PathVariable("limit") Integer limit, @RequestBody(required = false) BorrowInfoQueryVO borrowInfoQueryVO) {
        int total = this.baseInfoService.countCondition(borrowInfoQueryVO, null);
        if ((current - 1) * limit > total) {
            throw new BusinessException("不存在当前查询的页数，请重新输入小于当前页数的数字");
        } else {
            List<BorrowInfoVO> records = this.baseInfoService.pageCondition(current, limit, borrowInfoQueryVO, null);
            return JsonResult.ok().data("total", total).data("rows", records);
        }
    }
}