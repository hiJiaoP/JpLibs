package com.jiaop.jplibs.design.bridging;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/23
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class PhoneImpl extends Phone{

    public PhoneImpl(Make make) {
        super(make);
    }

    @Override
    public void make() {
        make.makePhone();
    }
}
