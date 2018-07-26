package com.jiaop.jplibs.design.visitor;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/26
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public interface Element {

    //抽象元素

    void accept(Vistor vistor);

}
