package com.jiaop.jplibs.design.combination.safe;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/24
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public abstract class Component {

    protected String name;

    public Component(String name){
        this.name = name;
    }

    public abstract void dispaly(int level);
}
