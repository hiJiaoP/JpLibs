package com.jiaop.jplibs.design.visitor;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/26
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class ElementA implements Element {

    @Override
    public void accept(Vistor vistor) {
        vistor.visit(this);
    }

}
