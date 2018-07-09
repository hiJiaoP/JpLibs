package com.jiaop.libs.http;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/6
 *     desc   : 封装请求范湖数据基类
 *     version: 1.0.0
 * </pre>
 */
public class BaseResult<T> {

    private String code;
    private String msg;
    private T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
