package com.jiaop.libs.http;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/6
 *     desc   : 封装网络请求回调基类
 *     version: 1.0.0
 * </pre>
 */
public interface OnBaseHttpResultListener<T> {

    void success(T result);

    void fail(String fail);

}
