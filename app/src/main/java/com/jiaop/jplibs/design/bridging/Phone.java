package com.jiaop.jplibs.design.bridging;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/23
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public abstract class Phone {

    protected Make make;

    public Phone(Make make){
        this.make = make;
    }

    public abstract void make();

}
