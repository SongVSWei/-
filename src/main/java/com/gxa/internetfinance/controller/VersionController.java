package com.gxa.internetfinance.controller;

//import com.gxa.internetfinance.pojo.vo.UserVO;
//import com.gxa.internetfinance.service.UserPOService;
import com.gxa.internetfinance.pojo.po.Agreement;
import com.gxa.internetfinance.pojo.po.Suggestion;
import com.gxa.internetfinance.pojo.po.Version;
import com.gxa.internetfinance.service.VersionService;
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
@CrossOrigin
@Api(value = "版本管理",tags = "版本管理接口")
@ControllerAdvice
@RequestMapping("/version")
public class VersionController {
    @Autowired
    private VersionService versionService;

//    @ApiOperation(value = "版本的全查询的结果", notes = "这个是全查询，不需传入其他参数")
//    @GetMapping("/selectAll")
//    public JsonResult selectAll() {
//        return JsonResult.ok().message("查询成功");
//    }
//
//    @ApiOperation(value = "有效版本的查询的结果")
//    @GetMapping("/selectEffective")
//    public JsonResult selectEffective() {
//        return JsonResult.ok().message("查询成功");
//    }
//
//    @ApiOperation(value = "禁用版本的查询的结果")
//    @GetMapping("/selectNoEffective")
//    public JsonResult selectNoEffective() {
//        return JsonResult.ok().message("查询成功");
//    }


    @ApiOperation(value = "版本的全查询,加上是否版本有效", notes = "三个条件并行")
    @PostMapping("/selectAllAndEffective/{page}/{size}/{inEffective}")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page",value = "页数",paramType = "param",dataType ="int"),
            @ApiImplicitParam(name = "size",value = "数量",paramType = "param",dataType ="int"),
            @ApiImplicitParam(name = "inEffective",value = "是否作废，1代表作废，0代表有效的，全部就传空值",paramType = "param",dataType ="int")
    })
    public JsonResult selectLikeDescAndHandle(@PathVariable("page") Integer page,
                                              @PathVariable("size") Integer size,
                                              @PathVariable("inEffective") Integer inEffective
                                              ) {
        HashMap<String, Object> select = versionService.select( page, size,inEffective);
        if (select!=null){
            return JsonResult.ok().message("查询完成").data("result",select);
        }
        return JsonResult.error().message("查询失败");
    }





    @ApiOperation("这是添加版本的")
    @ApiImplicitParams(@ApiImplicitParam(name = "version",value = "需要添加的版本的对象",
            example = "一个对象",required = true,paramType = "body",dataType ="Version"))
    @PostMapping("/insert")
    public JsonResult insert(@RequestBody Version version){
        Integer insert =versionService.insert(version);
        if (insert>0){
            return JsonResult.ok().message("添加完成");
        }
        return JsonResult.error().message("添加失败");
    }


    @ApiOperation("这是操作选项中的作废")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value ="id",example = "2"
                    ,required = true,paramType = "param",dataType ="int")
    })
    @PostMapping("/updateinUse")
    public  JsonResult UpdateInUse(@RequestParam("id") Integer id){
        Integer integer = versionService.UpdateByInUse(id);
        if (integer>0){
            return JsonResult.ok().message("作废完成");
        }
        return JsonResult.error().message("作废失败");
    }

}
