package com.jiaop.jplibs.design.proxy;

import java.lang.reflect.Proxy;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/20
 *     desc   : 使用
 *     version: 1.0.0
 * </pre>
 */
public class Main {
    /**
     * 静态代理的使用
     */
    public void main() {
        Service service = new ServiceImpl();
        ServiceProxy serviceProxy = new ServiceProxy(service);
        serviceProxy.serviced();
    }

    public void dynamicMain() {
        Service service = new ServiceImpl();
        /**
         * ClassLoader loader表示当前使用到的appClassloader
         * Class<?>[] interfaces表示目标对象实现的一组接口
         * InvocationHandler h表示当前的InvocationHandler实现实例对象
         */
        Service proxy = (Service) Proxy.newProxyInstance(Service.class.getClassLoader(),
                new Class[]{Service.class}, new DynamicProxy(service));

        proxy.serviced();
    }

}
