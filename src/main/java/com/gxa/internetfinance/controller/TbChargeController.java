package com.gxa.internetfinance.controller;

import com.gxa.internetfinance.pojo.po.TbCharge;
import com.gxa.internetfinance.pojo.pram.TbChargePram;
import com.gxa.internetfinance.service.TbChargeService;
import com.gxa.internetfinance.util.JsonResult;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 充值表(TbCharge)表控制层
 *
 * @author makejava
 * @since 2021-06-07 16:52:41
 */
@RestController
@RequestMapping("/tbCharge")
@Api(value = "管理员后台端------充值记录", tags = "管理员后台端------充值记录接口")
@ApiResponses({
        @ApiResponse(code=400,message="请求参数不完整或者错误"),
        @ApiResponse(code=404,message="找不到页面"),
        @ApiResponse(code=405,message="请求方式不正确，比如后台接收是post，但前端请求的是get"),
        @ApiResponse(code=406,message="页面地址和接口名冲突"),
        @ApiResponse(code=415,message="请求格式不正确，前端可能没有把请求头修改为json，也可能前端请求的json对象没有转换为字符串"),
        @ApiResponse(code=500,message="后台服务逻辑错误")
})
public class TbChargeController {
    /**
     * 服务对象
     */
    @Resource(name = "tbChargeService")
    private TbChargeService tbChargeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "通过主键查询单条数据")
    @PostMapping("/selectOne/{id}")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "id",value = "要查询的id",required = true,dataType = "int"),
    })
    public JsonResult selectOne(@PathVariable Integer id) {
        return this.tbChargeService.queryById(id);
    }

    @ApiOperation(value = "新增充值记录")
    @PostMapping("/insetOne")
    public JsonResult insetOne(@RequestBody TbCharge tbCharge){
        return tbChargeService.insert(tbCharge);
    }

    @ApiOperation(value = "带条件的分页查询")
    @PostMapping("/selectByAll")
    public JsonResult selectByAll(@RequestBody TbChargePram tbChargePram){
        return tbChargeService.selectByAll(tbChargePram);
    }
}
