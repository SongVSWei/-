package com.gxa.internetfinance.exception;


import com.gxa.internetfinance.util.ExceptionUtil;
import com.gxa.internetfinance.util.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author：Win
 * @Date: 2021/5/26 17:24
 * @Description: 统一异常处理
 */
@ControllerAdvice//统一异常处理
@Slf4j//输出日志
@ResponseBody
public class GlobalException {
    /**
     * 全局异常处理
     *
     * @param e exception
     * @return result of operation
     */
    //指定出现什么异常执行这个方法
    @ExceptionHandler(Exception.class)
//    返回的数据格式（json）
    public JsonResult error(Exception e) {
        //        输出错误日志到文件中
        log.error(ExceptionUtil.getMessage(e));
        e.printStackTrace();
        return JsonResult.error().message("执行了全局异常处理~~~" + e.getMessage());
    }

    /**
     * 自定义异常处理
     *
     * @param e exception
     * @return result of operation
     */
    @ExceptionHandler(BusinessException.class)
    public JsonResult error(BusinessException e) {
//        输出错误日志到文件中
        log.error(ExceptionUtil.getMessage(e));
        e.printStackTrace();
        return JsonResult.error().message(e.getMessage());
    }

    /**
     * 自定义异常处理
     *
     * @param e exception
     * @return result of operation
     */
    @ExceptionHandler(SystemException.class)
    public JsonResult error(SystemException e) {
//        输出错误日志到文件中
        log.error(ExceptionUtil.getMessage(e));
        e.printStackTrace();
        return JsonResult.error().message(e.getMessage());
    }
}
