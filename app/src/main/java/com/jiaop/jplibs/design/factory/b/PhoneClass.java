package com.jiaop.jplibs.design.factory.b;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/18
 *     desc   : 制造原料
 *     version: 1.0.0
 * </pre>
 */
public class PhoneClass implements PhoneFactory {

    @Override
    public Battery createBattery() {
        return new Battery();
    }

    @Override
    public Dispaly createDisplay() {
        return new Dispaly();
    }
}
