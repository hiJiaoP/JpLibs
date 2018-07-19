package com.jiaop.jplibs.design.factory.b;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/18
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class PhonePlant implements PhonePlantIntfc {

    PhoneFactory pf;

    public PhonePlant() {
        pf = new PhoneClass();
    }

    @Override
    public Phone assembley() {
        Phone p = new Phone();
        p.setBattery(pf.createBattery());
        p.setDispaly(pf.createDisplay());
        return p;
    }
}
