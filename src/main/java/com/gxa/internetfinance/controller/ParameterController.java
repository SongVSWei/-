package com.gxa.internetfinance.controller;

import com.gxa.internetfinance.exception.BusinessException;
import com.gxa.internetfinance.pojo.po.Parameter;
import com.gxa.internetfinance.service.ParameterService;
import com.gxa.internetfinance.util.JsonResult;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Zhang F
 * @version 1.0
 * @date 2021/6/7 15:55
 */

@CrossOrigin
@RestController
@RequestMapping("/parameterConfig")
@Api(value = "系统设置的参数设置",tags = "系统设置的参数设置接口")
public class ParameterController {

    @Resource
    private ParameterService parameterService;

    @PostMapping("/selectParamConfig/{page}/{size}")
    @ApiOperation(value = "查询所有参数设置的操作")
    @ApiImplicitParams({
            @ApiImplicitParam(
                    name = "page",
                    value = "页数",
                    required = true,
                    dataType = "int"
            ),
            @ApiImplicitParam(
                    name = "size",
                    value = "每页的数量",
                    required = true,
                    dataType = "int"
            ),
            @ApiImplicitParam(
                    name = "parameter",
                    value = "模糊查询的条件",
                    required = false,
                    paramType = "body"
            )
    })
    public JsonResult selectParamConfig(@PathVariable("page") Integer page, @PathVariable("size") Integer size, @RequestBody Parameter parameter){

        Integer total = this.parameterService.countCondition(parameter);
        System.out.println("ttt:"+total);
        if ((page - 1) * size > total) {
            throw new BusinessException("不存在当前查询的页数，请重新输入小于当前页数的数字");
        } else {
            List<Parameter> parameterList = this.parameterService.selectParamConfig(page,size,parameter.getName());
            if (parameterList != null){
                return JsonResult.ok().data("total",total).data("info",parameterList);
            }
        }

        return null;
    }

    @PostMapping("/update")
    @ApiOperation(value = "修改参数配置内容")
    @ApiImplicitParams({
            @ApiImplicitParam(
                    name = "parameter",
                    value = "修改的参数对象",
                    required = true,
                    dataType = "Parameter",
                    paramType = "body"
            )})
    public JsonResult update(@RequestBody Parameter parameter){
        Integer update = parameterService.update(parameter);
        if(update > 0){
            return JsonResult.ok();
        }
        return null;
    }

    @PostMapping("/addParam")
    @ApiOperation(value = "添加参数配置内容")
    @ApiImplicitParams({
            @ApiImplicitParam(
                    name = "parameter",
                    value = "添加的参数对象",
                    required = true,
                    dataType = "Parameter",
                    paramType = "body"
            )})
    public JsonResult addParam(@RequestBody Parameter parameter){
        Integer addParam = parameterService.addParam(parameter);
        if(addParam > 0){
            return JsonResult.ok();
        }
        return null;
    }


    @PostMapping("/deleteParam/{id}")
    @ApiOperation(value = "删除参数配置内容")
    @ApiImplicitParams({
            @ApiImplicitParam(
                    name = "id",
                    value = "通过id删除数据",
                    required = true,
                    dataType = "int",
                    paramType="path"
            )})
    public JsonResult deleteParam(@PathVariable("id")Integer id){
        Integer deleteParam = parameterService.deleteParam(id);
        if(deleteParam > 0){
            return JsonResult.ok().message("删除成功");
        }
        return JsonResult.ok().message("删除失败");
    }
}
