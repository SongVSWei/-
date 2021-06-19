package com.gxa.internetfinance.controller;

import com.gxa.internetfinance.pojo.po.TbWidthdraw;
import com.gxa.internetfinance.service.TbWidthdrawService;
import com.gxa.internetfinance.util.JsonResult;
import com.gxa.internetfinance.util.WithdrawParam;
import io.swagger.annotations.*;
import io.swagger.models.auth.In;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 提现表(TbWidthdraw)表控制层
 *
 * @author makejava
 * @since 2021-06-07 16:53:28
 */
@RestController
@RequestMapping("/tbWidthdraw")
@Api(value = "管理员后台端------提现记录", tags = "管理员后台端------提现记录接口")
@ApiResponses({
        @ApiResponse(code=400,message="请求参数不完整或者错误"),
        @ApiResponse(code=404,message="找不到页面"),
        @ApiResponse(code=405,message="请求方式不正确，比如后台接收是post，但前端请求的是get"),
        @ApiResponse(code=406,message="页面地址和接口名冲突"),
        @ApiResponse(code=415,message="请求格式不正确，前端可能没有把请求头修改为json，也可能前端请求的json对象没有转换为字符串"),
        @ApiResponse(code=500,message="后台服务逻辑错误")
})
public class TbWidthdrawController {
    /**
     * 服务对象
     */
    @Resource
    private TbWidthdrawService tbWidthdrawService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "通过id查询单条记录")
    @PostMapping("/selectOne/{id}")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "id",value = "要查询的id",required = true,dataType = "int"),
    })
    public TbWidthdraw selectOne(@PathVariable Integer id) {
        return this.tbWidthdrawService.queryById(id);
    }

    /**
     * 提现
     * @param tbWidthdraw
     * @return
     */
    @ApiOperation(value = "新增提现记录(接收json格式的TbWidthdraw)，必传tbChargeUserPhone（提现用户的手机）、tbWidthdrawAmount（提现金额）、tbWidthdrawBankcard（银行账号）")
    @PostMapping("/withDraw")
    public JsonResult withDraw(@RequestBody TbWidthdraw tbWidthdraw){
        return tbWidthdrawService.withdraw(tbWidthdraw);
    }

    /**
     * 提现审核操作
     * @param tbWidthdraw
     * @return
     */
    @ApiOperation(value = "提现审核操作(接收json格式的TbWidthdraw),传tbWidthdrawId（提现记录id）、tbWidthdrawAuditor（审核人）、tbWidthdrawAuditStatus（1通过，2不通过）、tbWidthdrawDesc（备注）")
    @PostMapping("/audit")
    public JsonResult audit(@RequestBody TbWidthdraw tbWidthdraw){
        return tbWidthdrawService.audit(tbWidthdraw);
    }

    /**
     * 最近十五天的提现记录
     * @param
     * @return
     */
    @ApiOperation(value = "最近十五天的提现记录(传用户电话号码)")
    @PostMapping("/lastWithdraw/{phone}")
    public JsonResult lastWithdraw(@PathVariable String phone ){
        return tbWidthdrawService.LastTimeWithdraw(phone);
    }

    /**
     * 提现信息
     * @param
     * @return
     */
    @ApiOperation(value = "根据提现id查询提现信息")
    @PostMapping("/widthInfo/{id}")
    public JsonResult widthInfo(@PathVariable Integer id ){
        return tbWidthdrawService.withInfo(id);
    }

    /**
     * 通过条件分页查询
     * @param param
     * @return
     */
    @ApiOperation(value = "通过条件分页查询提现记录")
    @PostMapping("/list")
    public JsonResult listByParam(@RequestBody WithdrawParam param){
        return tbWidthdrawService.listByParam(param);
    }






}
