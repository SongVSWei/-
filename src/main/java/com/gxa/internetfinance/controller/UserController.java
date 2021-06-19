package com.gxa.internetfinance.controller;


import com.gxa.internetfinance.exception.BusinessException;
import com.gxa.internetfinance.pojo.po.User;
import com.gxa.internetfinance.pojo.vo.UserVo;
import com.gxa.internetfinance.service.UserService;
import com.gxa.internetfinance.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@ControllerAdvice
@RequestMapping("/user")
@CrossOrigin
@Api(value = "用户的管理模块",produces = "application/json;charset=UTF-8",tags = "用户的管理模块接口")
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation(value = "根据姓名查询用户信息的操作")
    @ApiImplicitParams(
            @ApiImplicitParam(name  = "name",value = "用户的名字", required = true,dataType = "String" )
    )
    @GetMapping("/getByName")
    public JsonResult getByName(@RequestParam("name") String name) throws BusinessException{

            UserVo user = new UserVo();
            user.setPhone("3123213213");
           return JsonResult.ok().data("user",user);
    }



    @ApiOperation(value = "根据手机号查询用户信息的操作")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "phone",value = "用户的手机号", required = true, dataType = "String" )
    )

    @GetMapping("/getByPhone")
    public JsonResult getByPhone(@RequestParam("phone") String phone) throws BusinessException{

        UserVo user = new UserVo();
        user.setName("张三丰");
        return JsonResult.ok().data("user",user);
    }



    @ApiOperation(value = "新增个人借款用户")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "user",value = "个人用户", required = true, dataType = "User",paramType = "Body" )
    )

    @PostMapping("/addPersonalUser")
    public JsonResult addPersonalUser(@RequestBody User user) throws BusinessException{

        Integer integer = userService.personalInsert(user);
        return JsonResult.ok();

    }

    @ApiOperation(value = "新增企业借款用户")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "user",value = "企业用户", required = true, dataType = "User",paramType = "Body" )
    )

    @PostMapping("/addCompanyUser")
    public JsonResult addCompanyUser(@RequestBody User user) throws BusinessException{

        Integer integer = userService.companyinsert(user);
        return JsonResult.ok();

    }



    @ApiOperation(value = "综合查询(3个条件的)")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user", value = "带有3个查询条件的对象", required = true, dataType = "User", paramType = "Body"),
            @ApiImplicitParam(name = "page", value = "查询的页码", required = true, dataType = "int", paramType = "param"),
            @ApiImplicitParam(name = "size", value = "显示的条数", required = true, dataType = "int", paramType = "param"),
    })

    @PostMapping("/selectAll")
    public JsonResult selectAll(@RequestBody User user,@RequestParam("page") Integer page
            ,@RequestParam(value = "size") Integer size ) {
        List<User> select = userService.select(user, page, size);
        Integer Counts = userService.selectTotalCounts(user);
        if(select != null){
            return JsonResult.ok().message("查询成功").data("result", select).data("counts",Counts);
        }else {
            return JsonResult.error().message("查询失败");
        }

    }

    @ApiOperation(value = "综合查询(5个条件的)")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user", value = "带有5个查询条件的对象", required = true, dataType = "User", paramType = "Body"),
            @ApiImplicitParam(name = "page", value = "查询的页码", required = true, dataType = "int", paramType = "param"),
            @ApiImplicitParam(name = "size", value = "显示的条数", required = true, dataType = "int", paramType = "param"),
    })

    @PostMapping("/selectWhole")
    public JsonResult selectWhole(@RequestBody User user,@RequestParam("page") Integer page
            ,@RequestParam(value = "size") Integer size ) {

        List<User> select = userService.selectWhole(user, page, size);
        Integer Counts = userService.selectWholeCounts(user);
        if(select != null){
            return JsonResult.ok().message("查询成功").data("result", select).data("counts",Counts);
        }else {
            return JsonResult.error().message("查询失败");
        }

    }



    @ApiOperation(value = "查询个人借款用户的资料")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "id",value = "个人借款用户的id", required = true, dataType = "int",paramType = "param" )
    )

    @PostMapping("/selectPersonalDetails")
    public JsonResult selectPersonalDetails(@RequestParam("id") Integer id) throws BusinessException{

        UserVo userVo = userService.selectPersonalDetailsById(id);
        return JsonResult.ok().data("result",userVo);

    }


    @ApiOperation(value = "查询公司借款用户的资料")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "id",value = "公司借款用户的id", required = true, dataType = "int",paramType = "param" )
    )

    @PostMapping("/selectCompanyDetails")
    public JsonResult selectCompanyDetails(@RequestParam("id") Integer id) throws BusinessException{

        UserVo userVo = userService.selectCompanyDetailsById(id);
        return JsonResult.ok().data("result",userVo);

    }




    @ApiOperation(value = "根据id修改投资用户资料")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "投资用户的id", required = true, dataType = "int", paramType = "param"),
            @ApiImplicitParam(name = "user", value = "带有至多5个字段的对象", required = true, dataType = "UserVo", paramType = "Body"),
    })

    @PostMapping("/updateInvestUserById")
    public JsonResult updateInvestUserById(@RequestBody UserVo user,@RequestParam("id") Integer id) throws BusinessException{

        Integer integer = userService.updateInvestUserById(user,id);
        return JsonResult.ok();

    }

    @ApiOperation(value = "根据id修改借款个人用户资料")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "借款个人用户的id", required = true, dataType = "int", paramType = "param"),
            @ApiImplicitParam(name = "user", value = "带有借款个人用户资料字段的对象", required = true, dataType = "UserVo", paramType = "Body"),
    })

    @PostMapping("/updatePersonalLendingUserById")
    public JsonResult updatePersonalLendingUserById(@RequestBody UserVo user,@RequestParam("id") Integer id) throws BusinessException{

        Integer integer = userService.updatePersonalLendingUserById(user, id);
        return  JsonResult.ok();

    }

    @ApiOperation(value = "根据id修改借款公司用户资料")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "借款公司用户的id", required = true, dataType = "int", paramType = "param"),
            @ApiImplicitParam(name = "user", value = "带有借款公司用户资料字段的对象", required = true, dataType = "UserVo", paramType = "Body"),
    })

    @PostMapping("/updateCompanylLendingUserById")
    public JsonResult updateCompanylLendingUserById(@RequestBody UserVo user,@RequestParam("id") Integer id) throws BusinessException{
        Integer integer = userService.updateCompanylLendingUserById(user, id);
        return JsonResult.ok();

    }







    @ApiOperation(value = "根据id查询用户资料")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户的id", required = true, dataType = "int", paramType = "param"),
    })

    @PostMapping("/selectById")
    public JsonResult selectById(@RequestParam("id") Integer id) throws BusinessException{

        UserVo userVo = userService.selectById(id);
        return JsonResult.ok().data("result",userVo);

    }














}


