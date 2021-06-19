package com.gxa.internetfinance.controller;

import com.gxa.internetfinance.pojo.po.MessagePush;
import com.gxa.internetfinance.service.MessagePushService;
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
@RequestMapping("/mp")
@Api(value = "消息推送模块", tags = "消息推送接口",produces = "applicaton/json;charset:UTF-8")
public class MessagePushController {
    @Resource
    MessagePushService messagePushService=null;
    @ApiOperation(value = "新增操作")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "messagePush",value = "json格式的experience对象",dataType = "json")
    )
    @PostMapping("/add")
    public JsonResult add(@RequestBody MessagePush messagePush){
        JsonResult jsonResult=new JsonResult();
        Integer register = messagePushService.register(messagePush);
        if (register>0){
            jsonResult.setCode(1);
            jsonResult.setMessage("注册成功");
        }else {
            jsonResult.setCode(0);
            jsonResult.setMessage("注册失败");
        }
        return jsonResult;
    }
   /* @ApiOperation(value = "分页查询的操作")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page",value = "第几页",paramType = "int",defaultValue = "1"),
            @ApiImplicitParam(name = "size",value = "每页显示多少条",paramType = "int",defaultValue = "10")
    }
    )
    @GetMapping("/get")
    public JsonResult selectByPage(@RequestParam("page") Integer page,@RequestParam("size") Integer size){
        System.out.println("page:"+page);
        System.out.println("size:"+size);
        JsonResult jsonResult=new JsonResult();
        jsonResult.setCode(1);
        jsonResult.setMessage("查询成功");
        Map<String,Object> resultMap=new HashMap<>();
        resultMap.put("姓名","满200减10红包");
        jsonResult.setData(resultMap);
        return jsonResult;
    }*/
    @ApiOperation(value = "条件查询的操作")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page",value = "第几页",paramType = "query",defaultValue = "1"),
            @ApiImplicitParam(name = "size",value = "每页显示多少条",paramType = "query",defaultValue = "10"),
            @ApiImplicitParam(name = "title",value = "搜索标题",paramType = "query"),
            @ApiImplicitParam(name = "status",value = "状态",paramType = "query"),
    }
    )
    @GetMapping("/getCondition")
    public JsonResult selectBycondition(@RequestParam("page") Integer page,@RequestParam("size") Integer size,String title,String status){
        JsonResult jsonResult=new JsonResult();
        List<MessagePush> messagePushes = messagePushService.pageCondition(page, size, title, status);
        jsonResult.setCode(1);
        jsonResult.setMessage("查询操作成功");
        Map<String,Object> resultMap=new HashMap<>();
        resultMap.put("data",messagePushes);
        jsonResult.setData(resultMap);
        return jsonResult;
    }
}
