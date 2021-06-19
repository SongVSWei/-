package com.gxa.internetfinance.controller;

import com.gxa.internetfinance.service.OssService;
import com.gxa.internetfinance.util.JsonResult;
import com.gxa.internetfinance.util.OssProperties;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * @Author：Win
 * @Date: 2021/6/8 10:31
 * @Description:
 */
@RestController
@RequestMapping("/oss/service/file")
@CrossOrigin
@Api(value = "图片上传功能", tags = "图片上传功能接口")
public class OssController {
    @Resource
    private OssService ossService;

    @ApiOperation(value = "图片文件上传至OSS对象存储服务的方法")
    @ApiImplicitParams(@ApiImplicitParam(value = "需要上传的图片", name = "file", required = true, paramType = "body", dataType = "MultipartFile"))
    @PostMapping("upload")
    public JsonResult uploadElement(MultipartFile file) {
        String fileUrl = ossService.uploadAvatarFile(file);
        return JsonResult.ok().data("fileUrl", fileUrl);
    }

    @ApiOperation(value = "判断该图片是否存在于服务器上")
    @ApiImplicitParams(@ApiImplicitParam(value = "需要判断的图片", name = "file", required = true, paramType = "body", dataType = "MultipartFile"))
    @PostMapping("judge")
    public JsonResult judgeElement(MultipartFile file) {
        boolean isJudge = ossService.judgeElement(file);
        if (isJudge) return JsonResult.ok().message("存在相同的文件");
        return JsonResult.ok().message("目前并无相同文件");
    }

    @ApiOperation(value = "删除存储空间中单个文件")
    @ApiImplicitParams(@ApiImplicitParam(value = "需要删除的文件", name = "file", required = true, paramType = "body", dataType = "MultipartFile"))
    @PostMapping("delete")
    public JsonResult deleteElement(String fileUrl) {
//        处理fileUrl,提出endPoint和BucketName
        String[] strings = fileUrl.split(OssProperties.BUCKET_NAME);
        ossService.deleteElement(strings[strings.length - 1]);
        return JsonResult.ok().message("文件删除成功");
    }
}
