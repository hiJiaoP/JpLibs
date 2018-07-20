package com.jiaop.jplibs.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/20
 *     desc   : 动态的服务代理类
 *     version: 1.0.0
 * </pre>
 */

/**
 * 实现InvocationHandler接口，并重写invoke()函数
 */
public class DynamicProxy implements InvocationHandler {

    private Object object;

    public DynamicProxy(Object o) {
        this.object = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object, args);
        return result;
    }
}
