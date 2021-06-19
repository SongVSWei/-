package com.gxa.internetfinance.service.impl;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.gxa.internetfinance.exception.BusinessException;
import com.gxa.internetfinance.service.OssService;
import com.gxa.internetfinance.util.OssProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

/**
 * @Author：Win
 * @Date: 2021/6/8 10:53
 * @Description:
 */
@Service
public class OssServiceImpl implements OssService {
    /**
     * 上传图片文件
     *
     * @param file 要上传的图片文件
     * @return 操作成功后返回该头像文件存储在OSS对象服务器上的路径
     */
    @Override
    public String uploadAvatarFile(MultipartFile file) {

// 填写Bucket所在地域对应的Endpoint。以华东1（杭州）为例，Endpoint填写为https://oss-cn-hangzhou.aliyuncs.com。
        String endpoint = OssProperties.END_POINT;

// 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
        String accessKeyId = OssProperties.ACCESS_KEY_ID;
        String accessKeySecret = OssProperties.ACCESS_KEY_SECRET;
        String bucketName = OssProperties.BUCKET_NAME;

// 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        try {
// 填写本地文件的完整路径。如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件流。
            InputStream inputStream = file.getInputStream();
//            获取上传文件的实际文件名
            String originalFilename = file.getOriginalFilename();
//            获取文件的后缀名
            String suffix = Objects.requireNonNull(originalFilename).substring(originalFilename.lastIndexOf("."));
//            使用UUID对文件名进行转换防止同一文件名对此上传被覆盖
            String newFileName = UUID.randomUUID().toString().replace("-", "") + suffix;
//            按照年月日对上传的文件进行分类(可以使用org.joda.time这个工具类实现，也可以使用java中的SimpleDateFormat实现，两者的底层原理是一样的)
            String folderName = "internetfinance/" + new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            /* 填写Bucket名称和Object完整路径。Object完整路径中不能包含Bucket名称。
             * 第一个参数为OSS服务的bucket
             * 第二个参数为要上传的文件（可以包含文件夹，如果该文件夹不存在，将会自动创建）
             * 第三个参数为上传文件输入流
             */
            ossClient.putObject(bucketName, folderName + "/" + newFileName, inputStream);
//            关闭OSSClient。
            ossClient.shutdown();
//            拼接上传文件的返回路径
            return "https://" + bucketName + "." + endpoint + "/" + folderName + "/" + newFileName;
        } catch (IOException e) {
            e.printStackTrace();
            throw new BusinessException("图片文件上传失败~~~");
        }
    }

    /**
     * 判断文件是否存在
     *
     * @param file 需要判断的文件
     * @return true or false
     */
    @Override
    public boolean judgeElement(MultipartFile file) {
        OSS ossClient = getOssClient(OssProperties.END_POINT, OssProperties.ACCESS_KEY_ID, OssProperties.ACCESS_KEY_SECRET);
// 判断文件是否存在。如果返回值为true，则文件存在，否则存储空间或者文件不存在。
// 设置是否进行重定向或者镜像回源。默认值为true，表示忽略302重定向和镜像回源；如果设置isINoss为false，则进行302重定向或者镜像回源。
//boolean isINoss = true;
// 填写Bucket名称和Object完整路径。Object完整路径中不能包含Bucket名称。
        boolean found = ossClient.doesObjectExist(OssProperties.BUCKET_NAME, file.getOriginalFilename());
//boolean found = ossClient.doesObjectExist("examplebucket", "exampleobject.txt", isINoss);

// 关闭OSSClient。
        ossClient.shutdown();
        return found;
    }

    /**
     * 删除单个文件
     *
     * @param fileUrl 文件完整路径。文件完整路径中不能包含Bucket名称
     * @return true or false
     */
    @Override
    public boolean deleteElement(String fileUrl) {
        try {
            OSS ossClient = getOssClient(OssProperties.END_POINT, OssProperties.ACCESS_KEY_ID, OssProperties.ACCESS_KEY_SECRET);
            ossClient.deleteObject(OssProperties.BUCKET_NAME, fileUrl);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException("文件删除失败~~~");
        }
    }

    /**
     * 返回OSS-Client方法
     *
     * @param endpoint        Bucket所在地域对应的Endpoint
     * @param accessKeyId     访问id
     * @param accessKeySecret 访问密钥
     * @return OssClient 对象
     */
    private static OSS getOssClient(String endpoint, String accessKeyId, String accessKeySecret) {
        return new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
    }
}

