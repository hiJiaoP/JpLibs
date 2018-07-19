package com.jiaop.jplibs.design.adapter;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/19
 *     desc   : 对象适配器
 *     version: 1.0.0
 * </pre>
 */
public class BeauAdapter implements B {

    private A a;

    public BeauAdapter(A a) {
        this.a = a;
    }

    @Override
    public void isB() {

    }

    /**
     * 可以重新声明方法
     */
    public void isA() {
        a.isA();
    }
}
