package com.gxa.internetfinance.controller;

import com.gxa.internetfinance.service.TbUserMoneyLogService;
import com.gxa.internetfinance.util.JsonResult;
import com.gxa.internetfinance.util.MoneyLogParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/moneyLog")
@Api(value = "管理员后台端------资金日志", tags = "管理员后台端------资金日志接口")
@ApiResponses({
        @ApiResponse(code=400,message="请求参数不完整或者错误"),
        @ApiResponse(code=404,message="找不到页面"),
        @ApiResponse(code=405,message="请求方式不正确，比如后台接收是post，但前端请求的是get"),
        @ApiResponse(code=406,message="页面地址和接口名冲突"),
        @ApiResponse(code=415,message="请求格式不正确，前端可能没有把请求头修改为json，也可能前端请求的json对象没有转换为字符串"),
        @ApiResponse(code=500,message="后台服务逻辑错误")
})
public class TbUserMoneyLogController {
    @Resource
    TbUserMoneyLogService tbUserMoneyLogService;


    /**
     * 资金日志列表
     * @param param
     * @return
     */
    @PostMapping("/list")
    @ApiOperation(value = "通过条件参数分页查询")
    public JsonResult listByParam(@RequestBody MoneyLogParam param){

        return tbUserMoneyLogService.listByParam(param);
    }



}
