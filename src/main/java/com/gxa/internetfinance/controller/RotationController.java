package com.gxa.internetfinance.controller;

import com.gxa.internetfinance.pojo.po.Rotation;
import com.gxa.internetfinance.service.impl.RotationServiceImpl;
import com.gxa.internetfinance.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.tags.Param;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;

/**
 * @Author：Win
 * @Date: 2021/6/1 16:58
 * @Description:
 */
@RestController
@Api(value = "轮播管理",tags ="轮播管理接口" )
@ControllerAdvice
@RequestMapping("/Rotation")
@CrossOrigin
public class RotationController {
    @Autowired
    private RotationServiceImpl rotationService;


//
//    @ApiOperation(value = "轮播图的全查询的结果", notes = "这个是全查询，不需传入其他参数")
//    @GetMapping("/selectAll")
//    public JsonResult selectAll() {
//        return JsonResult.ok().message("查询成功");
//    }


//    @ApiOperation("这是分页查询，根据条件的页码和个数")
//    @ApiImplicitParams({
//            @ApiImplicitParam(
//                    name = "page",required = true,value = "第几页",example = "2",
//                    paramType = "param"
//            ),@ApiImplicitParam(
//            name = "size",required = true,value = "多少个",example = "2",
//            paramType = "param"
//    ),@ApiImplicitParam(
//            name = "name",required =false,value = "名字",example = "z张三",
//            paramType = "param"
//    )})
//    @GetMapping("/selectByPage")
//    public JsonResult selectByPage(@RequestParam("page")Integer page,
//                                      @RequestParam("size")Integer size,
//                                      @RequestParam(value = "name",required = false) String name){
//        return JsonResult.ok().data("31",36);
//    }



    @ApiOperation("这是操作选项中的编辑")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "rotation",value ="传入轮播图的这个实体类的对象",example = ""
                    ,required = true,paramType = "body",dataType ="Rotation")
    })
    @PostMapping("/edit")
    public  JsonResult UpdateInUse(@RequestBody Rotation rotation){
        Integer update = rotationService.Update(rotation);
        if (update>0){
            return JsonResult.ok().message("编辑完成");
        }
        return JsonResult.error().message("编辑失败");
    }


    @ApiOperation("这是操作选项中的删除")
    @ApiImplicitParams(@ApiImplicitParam(name = "id",value = "需要删除的轮播图的id",
    example = "6",required = true,paramType = "param",dataType ="int"))
    @PostMapping("/delete")
    public JsonResult Delete(@RequestParam("id") Integer id){
        Integer delete = rotationService.Delete(id);
        if (delete>0){
            return JsonResult.ok().message("删除完成");
        }
        return JsonResult.error().message("删除失败");
    }


    @ApiOperation("这是添加轮播广告的")
    @ApiImplicitParams(@ApiImplicitParam(name = "rotation",value = "需要添加的轮广告的对象",
            example = "一个对象",required = true,paramType = "body",dataType ="Rotation"))
    @PostMapping("/insert")
    public JsonResult insert(@RequestBody Rotation rotation) throws ParseException {
        Integer insert = rotationService.insert(rotation);
        if (insert>0){
            return JsonResult.ok().message("添加完成");
        }
        return JsonResult.error().message("添加失败");
    }


    @ApiOperation("这是综合查询，根据三个并行条件进行查询,加上分页查询")
    @ApiImplicitParams({
            @ApiImplicitParam(
                    name = "rotation",required = true,value = "带有上面三个条件的对象",
                    paramType = "body",dataType ="Rotataion"
            ),@ApiImplicitParam(
            name = "page",value = "查询的页码",example = "3",required = true,
            paramType = "param",dataType ="int"
    ),@ApiImplicitParam(
            name = "size",required =true,value = "查询显示的条数",example = "6",
            paramType = "param",dataType ="int"
    )})
    @PostMapping("/selectLikeOthers/{page}/{size}")
    public JsonResult selectByComprehensive(@RequestBody Rotation rotation,
                                   @PathVariable("page")Integer page,
                                   @PathVariable(value = "size") Integer size){

        HashMap<String, Object> select = rotationService.select(rotation, page, size);
        if (select!=null){
            return JsonResult.ok().message("查询完成").data("result",select);
        }
        return JsonResult.error().message("查询失败");
    }


//    @ApiOperation("这是综合查询，根据四个并行条件进行查询")
//    @ApiImplicitParams({
//            @ApiImplicitParam(
//                    name = "title",required = true,value = "搜索的轮播标题",example = "活动宣传图",
//                    paramType = "param"
//            ),@ApiImplicitParam(
//            name = "location",value = "location",example = "商城轮播",
//            paramType = "param"
//    ),@ApiImplicitParam(
//            name = "inUse",required =false,value = "是否上下架",example = "上架",
//            paramType = "param"
//    )})
//    @GetMapping("/selectLikeOthers")
//    public JsonResult selectByPage(@RequestParam("title")String title,
//                                   @RequestParam("page")Integer location,
//                                   @RequestParam(value = "size") String size){
//
//        return JsonResult.ok().message("查询完成");
//    }



}
