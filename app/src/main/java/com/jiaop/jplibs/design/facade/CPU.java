package com.jiaop.jplibs.design.facade;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/25
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class CPU implements ChildSys {

    @Override
    public void startup() {
        //开启CPU
    }

    @Override
    public void shutdown() {
        //关闭CPU
    }
}
