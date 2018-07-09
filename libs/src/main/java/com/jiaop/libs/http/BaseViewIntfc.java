package com.jiaop.libs.http;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/6
 *     desc   : 封装页面交互层
 *     version: 1.0.0
 * </pre>
 */
public interface BaseViewIntfc<T> {

    void success(T result);

    void fail(String fail);

}
