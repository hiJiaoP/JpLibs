package com.jiaop.jplibs.design.factory.b;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/18
 *     desc   : 手机
 *     version: 1.0.0
 * </pre>
 */
public class Phone {

    private Battery battery;
    private Dispaly dispaly;

    public Phone() {
    }

    public Phone(Battery battery, Dispaly dispaly) {
        this.battery = battery;
        this.dispaly = dispaly;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Dispaly getDispaly() {
        return dispaly;
    }

    public void setDispaly(Dispaly dispaly) {
        this.dispaly = dispaly;
    }
}
