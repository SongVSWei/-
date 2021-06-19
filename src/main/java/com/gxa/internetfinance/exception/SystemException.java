package com.gxa.internetfinance.exception;

/**
 * @author 蔚枫
 * @version 1.0
 * Talk is cheap. Show me the code
 * @description 自定义系统异常类
 * @date 2021/6/8 09:00
 */
public class SystemException extends RuntimeException{

    private Integer code;

    private String msg;

    public SystemException() {
    }

    public SystemException(Integer code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
