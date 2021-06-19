package com.gxa.internetfinance.controller;

import com.gxa.internetfinance.pojo.po.Article;
import com.gxa.internetfinance.pojo.po.Rotation;
import com.gxa.internetfinance.pojo.po.Version;
import com.gxa.internetfinance.service.ArticleService;
import com.gxa.internetfinance.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * @Author：Win
 * @Date: 2021/6/1 16:58
 * @Description:
 */
@RestController
@Api(value = "文章管理",tags = "文章管理接口")
@ControllerAdvice
@CrossOrigin
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @ApiOperation("这是添加文章的")
    @ApiImplicitParams(@ApiImplicitParam(name = "article",value = "需要添加的版本的对象",
            example = "一个对象",required = true,paramType = "body",dataType ="Article"))
    @PostMapping("/insert")
    public JsonResult insert(@RequestBody Article article){
        Integer insert = articleService.insert(article);
        if (insert>0){
            return JsonResult.ok().message("添加完成");
        }
        return JsonResult.error().message("添加失败");
    }


    @ApiOperation("这是操作选项中的编辑")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "article",value ="传入需要编辑的对象",example = ""
                    ,required = true,paramType = "body",dataType ="Article")
    })
    @PostMapping("/edit")
    public  JsonResult UpdateAll(@RequestBody Article article){
        Integer update = articleService.Update(article);
        if (update>0){
            return JsonResult.ok().message("编辑完成");
        }
        return JsonResult.error().message("编辑失败");
    }


    @ApiOperation("这是操作选项中的删除")
    @ApiImplicitParams(@ApiImplicitParam(name = "id",value = "需要删除的文章的id",
            example = "6",required = true,paramType = "param",dataType ="int"))
    @PostMapping("/delete")
    public JsonResult Delete(@RequestParam("id") Integer id){
        Integer delete = articleService.Delete(id);
        if (delete>0){
            return JsonResult.ok().message("删除完成");
        }
        return JsonResult.error().message("删除失败");
    }


    @ApiOperation("这是综合查询，根据三个并行条件进行查询,加上分页查询")
    @ApiImplicitParams({
            @ApiImplicitParam(
                    name = "article",required = true,value = "带有上面三个条件的对象",
                    paramType = "body",dataType ="Article"
            ),@ApiImplicitParam(
            name = "page",value = "查询的页码",example = "3",required = true,
            paramType = "param",dataType ="int"
    ),@ApiImplicitParam(
            name = "size",required =true,value = "查询显示的条数",example = "6",
            paramType = "param",dataType ="int"
    ),@ApiImplicitParam(
            name = "inUse",required =true,value = "是否上下架",example = "1",
            paramType = "param",dataType ="int"
    )

    })
    @PostMapping("/selectLikeOthers/{page}/{size}")
    public JsonResult selectByPage(@RequestBody Article article,
                                   @PathVariable("page")Integer page,
                                   @PathVariable(value = "size") Integer size,
                                   @RequestParam("inUse") Integer inUse){

        HashMap<String, Object> select =articleService.select(article, page, size,inUse);
        if (select!=null){
            return JsonResult.ok().message("查询完成").data("result",select);
        }
        return JsonResult.error().message("查询失败");
    }




//
//    @ApiOperation(value = "文章标题的模糊查询,加上分类和状态的条件查询", notes = "三个条件并行")
//    @GetMapping("/selectLikeDescAndTypeAndinUse")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "likedesc",value = "文章标题",paramType = "param"),
//            @ApiImplicitParam(name = "type",value = "分类类别",paramType = "param"),
//            @ApiImplicitParam(name = "inUse",value = "是否上架",paramType = "param")
//    })
//    public JsonResult selectLikeDescAndTypeAndinUse(@RequestParam("likedesc") String likedsec,
//                                              @RequestParam("type") String type,
//                                              @RequestParam("inUse") String inUse
//                                                    ) {
//        return JsonResult.ok().message("查询成功");
//    }
//


}
