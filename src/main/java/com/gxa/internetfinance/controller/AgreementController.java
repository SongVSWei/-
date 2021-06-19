package com.gxa.internetfinance.controller;

import com.gxa.internetfinance.pojo.po.Agreement;
import com.gxa.internetfinance.pojo.po.Article;
import com.gxa.internetfinance.pojo.po.Rotation;
import com.gxa.internetfinance.service.AgreementService;
import com.gxa.internetfinance.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * @Author：Win
 * @Date: 2021/6/1 16:58
 * @Description:
 */
@RestController
@Api(value = "协议管理",tags = "协议管理接口")
@ControllerAdvice
@CrossOrigin
@RequestMapping("/agreement")
public class AgreementController {
    @Autowired
    private AgreementService agreementService;

//   @ApiOperation(value = "协议编辑的预览的功能" ,notes = "将要修改的对象传递")
//   @ApiImplicitParams(@ApiImplicitParam(name = "id",value = "根据协议的id来进行预览",
//   required = true,example = "1",paramType = "param"))
//    @PostMapping("/look")
//    public JsonResult look(@RequestParam("id") Integer id){
//       Agreement agreement = new Agreement();
//       agreement.setId(id);
//       return  JsonResult.ok().data("agreement",agreement);
//   }


    @ApiOperation("协议编辑的预览的功能")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "agreement",value ="传入轮播图的这个实体类的对象",example = ""
                    ,required = true,paramType = "body",dataType ="Agreement")
    })
    @PostMapping("/look")
    public  JsonResult UpdateInlook(@RequestBody Agreement agreement){
        Integer update = agreementService.UpdateByEdit(agreement);
        if (update>0){
            return JsonResult.ok().message("编辑完成");
        }
        return JsonResult.error().message("编辑失败");
    }



//    @ApiOperation("这是操作选项中的启用，把是否启用后的状态赋值给对象传递给我")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "agreement",value ="启用后的状态赋值后的对象"
//                    ,required = true,paramType = "body")
//    })
//    @PostMapping("/updateinUse")
//    public  JsonResult UpdateInUse(@RequestBody Agreement agreement){
//        Integer integer = agreementService.UpdateByInUse(agreement);
//        if (integer>0){
//            return JsonResult.ok().message("启用状态修改完成");
//        }
//        return JsonResult.error().message("启用状态失败");
//
//    }


    @ApiOperation("这是操作选项中的启用，把是否启用后的状态赋值给我")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "inUse",value ="启用还是停用的值,传递1就是启用，传递0就是停用"
                    ,required = true,paramType = "param",dataType ="int"),
            @ApiImplicitParam(name = "id",value ="要修改的对象的id"
                    ,required = true,paramType = "param",dataType ="int")
    })
    @PostMapping("/updateinUse/{id}/{inUse}")
    public  JsonResult UpdateInUse(@PathVariable("inUse")Integer inUse,
                                   @PathVariable("id")Integer id){
        Integer integer = agreementService.UpdateByInUse(id,inUse);
        if (integer>0){
            return JsonResult.ok().message("启用状态修改完成");
        }
        return JsonResult.error().message("启用状态失败");

    }

    @ApiOperation("这是添加协议的")
    @ApiImplicitParams(@ApiImplicitParam(name = "agreement",value = "需要添加的协议的对象",
            example = "一个对象",required = true,paramType = "body",dataType ="Agreement"))
    @PostMapping("/insert")
    public JsonResult insert(@RequestBody Agreement agreement){
        Integer insert = agreementService.insert(agreement);
        if (insert>0){
            return JsonResult.ok().message("添加完成");
        }
        return JsonResult.error().message("添加失败");
    }


    @ApiOperation("这是综分页查询")
    @ApiImplicitParams({
            @ApiImplicitParam(
            name = "page",value = "查询的页码",example = "3",required = true,
            paramType = "param",dataType ="int"
    ),@ApiImplicitParam(
            name = "size",required =true,value = "查询显示的条数",example = "6",
            paramType = "param",dataType ="int"
    )})
    @PostMapping("/selectAllAndEffective/{page}/{size}")
    public JsonResult selectByPage(
                                   @PathVariable("page")Integer page,
                                   @PathVariable(value = "size") Integer size){

        HashMap<String, Object> select = agreementService.select(page, size);
        if (select!=null){
            return JsonResult.ok().message("查询完成").data("result",select);
        }
        return JsonResult.error().message("查询失败");
    }







}
