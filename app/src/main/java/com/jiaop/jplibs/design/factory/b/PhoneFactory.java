package com.jiaop.jplibs.design.factory.b;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/18
 *     desc   : 原料工厂
 *     version: 1.0.0
 * </pre>
 */
public interface PhoneFactory {

    public Battery createBattery();

    public Dispaly createDisplay();

}
