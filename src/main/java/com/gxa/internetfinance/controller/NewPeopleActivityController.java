package com.gxa.internetfinance.controller;

import com.gxa.internetfinance.pojo.po.NewPeopleActivityStrategy;
import com.gxa.internetfinance.service.NewPeopleActivityService;
import com.gxa.internetfinance.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/npa")
@Api(value = "新手活动策划模块",tags = "新手活动策划接口",produces = "applicaton/json;charset:UTF-8")
public class NewPeopleActivityController {
    @Resource
    NewPeopleActivityService newPeopleActivityService=null;

    @ApiOperation(value = "修改操作")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "newPeopleActivity",value = "json格式的experience对象",dataType = "json")
    )
    @PostMapping("/update")
    public JsonResult update(@RequestBody NewPeopleActivityStrategy newPeopleActivityStrategy){
        JsonResult jsonResult=new JsonResult();
        Integer update = newPeopleActivityService.update(newPeopleActivityStrategy);
        if (update>0){
            jsonResult.setCode(1);
            jsonResult.setMessage("修改成功");
        }else {
            jsonResult.setCode(0);
            jsonResult.setMessage("修改失败");
        }
        return jsonResult;
    }
    @ApiOperation(value = "分页查询的操作")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page",value = "第几页",paramType = "query",defaultValue = "1"),
            @ApiImplicitParam(name = "size",value = "每页显示多少条",paramType = "query",defaultValue = "10")
    }
    )
    @GetMapping("/get")
    public JsonResult selectByPage(@RequestParam("page") Integer page,@RequestParam("size") Integer size){
        System.out.println("page:"+page);
        System.out.println("size:"+size);
        JsonResult jsonResult=new JsonResult();
        List<NewPeopleActivityStrategy> page1 = newPeopleActivityService.page(page, size);
        jsonResult.setCode(1);
        jsonResult.setMessage("查询成功");
        Map<String,Object> resultMap=new HashMap<>();
        resultMap.put("data",page1);
        jsonResult.setData(resultMap);
        return jsonResult;
    }
}
