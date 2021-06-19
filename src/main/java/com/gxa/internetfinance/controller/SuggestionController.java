package com.gxa.internetfinance.controller;

import com.gxa.internetfinance.pojo.po.Rotation;
import com.gxa.internetfinance.pojo.po.Suggestion;
import com.gxa.internetfinance.service.impl.SuggestionServiceImpl;
import com.gxa.internetfinance.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;

/**
 * @Author：Win
 * @Date: 2021/6/1 16:58
 * @Description:
 */
@RestController
@CrossOrigin
@Api(value = "意见管理",tags = "意见管理接口")
@ControllerAdvice
@RequestMapping("/suggestion")
public class SuggestionController {
    @Autowired
    private SuggestionServiceImpl suggestionService;

//    @ApiOperation(value = "意见的全查询的结果", notes = "这个是全查询，不需传入其他参数")
//    @PostMapping("/selectAll")
//    public JsonResult selectAll() {
//        return JsonResult.ok().message("查询成功");
//    }
//
//    @ApiOperation(value = "意见的未处理的查询的结果", notes = "未处理的查询，不需传入其他参数")
//    @PostMapping("/selectNoHandle")
//    public JsonResult selectNoHandle() {
//        return JsonResult.ok().message("查询成功");
//    }
//
//    @ApiOperation(value = "意见的已处理的查询的结果", notes = "已处理的查询，不需传入其他参数")
//    @PostMapping("/selectYesHandle")
//    public JsonResult selectNoYesHandle() {
//        return JsonResult.ok().message("查询成功");
//    }

//
//    @ApiOperation(value = "问题的关键词的模糊查询,加上是否已经处理的条件查询", notes = "两个条件并行")
//    @GetMapping("/selectLikeDescAndHandle")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "likedesc",value = "问题的关键词",paramType = "param"),
//            @ApiImplicitParam(name = "handle",value = "是否已经处理",paramType = "param")
//    })
//    public JsonResult selectLikeDescAndHandle(@RequestParam("likedesc") String likedsec,
//                                              @RequestParam("Handle") String handle) {
//        return JsonResult.ok().message("查询成功");
//    }



    @ApiOperation("对意见进行处理")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value ="传入即将要处理的对象的id",example = "2"
                    ,required = true,paramType = "param",dataType ="int"),
            @ApiImplicitParam(name = "response",value ="传入处理后的回复内容",example = "回复内容"
                    ,required = true,paramType = "param",dataType ="String")
    })
    @PostMapping("/UpdateInHandle")
//    public  JsonResult UpdateInHandle(@RequestBody Integer id,String response){
    public  JsonResult UpdateInHandle(@RequestBody Suggestion suggestion){
        Integer integer = suggestionService.UpdateByInUse(suggestion);
        if (integer>0){
            return JsonResult.ok().message("编辑完成");
        }
        return JsonResult.error().message("编辑失败");
    }

    @ApiOperation("这是添加轮播广告的")
    @ApiImplicitParams(@ApiImplicitParam(name = "suggestion",value = "需要添加意见的对象",
            example = "一个对象",required = true,paramType = "body",dataType ="Suggestion"))
    @PostMapping("/insert")
    public JsonResult insert(@RequestBody Suggestion suggestion) throws ParseException {
        Integer insert =suggestionService.insert(suggestion);
        if (insert>0){
            return JsonResult.ok().message("添加完成");
        }
        return JsonResult.error().message("添加失败");
    }



    @ApiOperation("这是综合查询，根据二个并行条件进行查询,加上分页查询")
    @ApiImplicitParams({
            @ApiImplicitParam(
                    name = "suggestion",required = true,value = "带有上面二个条件的对象",
                    paramType = "body",dataType =" Suggestion"
            ),@ApiImplicitParam(
            name = "page",value = "查询的页码",example = "3",required = true,
            paramType = "param",dataType ="int"
    ),@ApiImplicitParam(
            name = "size",required =true,value = "查询显示的条数",example = "6",
            paramType = "param",dataType ="int"
    ),@ApiImplicitParam(
            name = "inHandle",required =true,value = "是否上下架",example = "1",
            paramType = "param",dataType ="int")})
    @PostMapping("/selectLikeOthers/{page}/{size}")
    public JsonResult selectByComprehensive(@RequestBody Suggestion suggestion,
                                            @PathVariable("page")Integer page,
                                            @PathVariable(value = "size") Integer size,
                                            @RequestParam("inHandle") Integer inHandle){

        HashMap<String, Object> select = suggestionService.select( page, size,suggestion,inHandle);
        if (select!=null){
            return JsonResult.ok().message("查询完成").data("result",select);
        }
        return JsonResult.error().message("查询失败");
    }


}
