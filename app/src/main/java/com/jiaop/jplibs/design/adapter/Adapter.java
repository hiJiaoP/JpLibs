package com.jiaop.jplibs.design.adapter;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/19
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class Adapter extends AImpl implements B {

    @Override
    public void isB() {
        isA();
    }
}
