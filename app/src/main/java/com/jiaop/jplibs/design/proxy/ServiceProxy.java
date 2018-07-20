package com.jiaop.jplibs.design.proxy;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/20
 *     desc   : 服务的代理类
 *     version: 1.0.0
 * </pre>
 */
public class ServiceProxy implements Service {

    private Service service;

    public ServiceProxy(Service service) {
        this.service = service;
    }

    @Override
    public void serviced() {
        service.serviced();
    }
}
