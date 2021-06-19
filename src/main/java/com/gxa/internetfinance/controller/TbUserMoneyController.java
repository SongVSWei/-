package com.gxa.internetfinance.controller;

import com.gxa.internetfinance.service.TbUserMoneyService;
import com.gxa.internetfinance.util.JsonResult;
import com.gxa.internetfinance.util.MoneyParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/tbUserMoney")
@Api(value = "管理员后台端------用户资金", tags = "管理员后台端------用户资金接口")
@ApiResponses({
        @ApiResponse(code=400,message="请求参数不完整或者错误"),
        @ApiResponse(code=404,message="找不到页面"),
        @ApiResponse(code=405,message="请求方式不正确，比如后台接收是post，但前端请求的是get"),
        @ApiResponse(code=406,message="页面地址和接口名冲突"),
        @ApiResponse(code=415,message="请求格式不正确，前端可能没有把请求头修改为json，也可能前端请求的json对象没有转换为字符串"),
        @ApiResponse(code=500,message="后台服务逻辑错误")
})
public class TbUserMoneyController {
    @Autowired
    private TbUserMoneyService tbUserMoneyService;

    /**
     * 按条件分页查询
     * @param param
     * @return
     */
    @PostMapping("/list")
    @ApiOperation(value = "按条件参数分页查询")
    public JsonResult list(@RequestBody MoneyParam param){
        return tbUserMoneyService.listByParam(param);
    }

    /**
     * 按电话号码查询资金信息
     * @param phone
     * @return
     */
    @PostMapping("/findByPhone/{phone}")
    @ApiOperation(value = "按电话号码查询资金信息")
    public JsonResult list(@PathVariable String phone){
        return tbUserMoneyService.findByPhone(phone);
    }






}
