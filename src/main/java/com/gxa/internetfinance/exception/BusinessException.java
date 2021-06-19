package com.gxa.internetfinance.exception;

/**
 * @Author：Win
 * @Date: 2021/5/26 17:39
 * @Description: 自定义业务异常
 */

public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = 2059834241810807639L;

    public BusinessException(String message) {
        super(message);
    }

}
