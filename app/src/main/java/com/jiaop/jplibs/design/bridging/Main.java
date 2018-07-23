package com.jiaop.jplibs.design.bridging;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/23
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class Main {

    public void main() {
        Phone android = new PhoneImpl(new Android());
        Phone iphone = new PhoneImpl(new IPhone());

        android.make();
        iphone.make();
    }

}
