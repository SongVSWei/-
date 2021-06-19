package com.gxa.internetfinance.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @Author：Win
 * @Date: 2021/6/8 10:52
 * @Description:
 */
public interface OssService {
    /**
     * 上传图片文件
     *
     * @param file 要上传的图片文件
     * @return 操作成功后返回该头像文件存储在OSS对象服务器上的路径
     */
    String uploadAvatarFile(MultipartFile file);

    /**
     * 判断文件是否存在
     * @param file 需要判断的文件
     * @return true or false
     */
    boolean judgeElement(MultipartFile file);

    /**
     * 删除单个文件
     * @param fileUrl 文件完整路径。文件完整路径中不能包含Bucket名称
     * @return true or false
     */
    boolean deleteElement(String fileUrl);
}
