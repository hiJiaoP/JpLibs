package com.jiaop.jplibs.design.visitor;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/26
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class DisplayVisitor implements Vistor{

    //具体访问者

    @Override
    public void visit(ElementA element) {
        System.out.println("visit ElementA");

    }

    @Override
    public void visit(ElementB element) {
        System.out.println("visit ElementB");

    }

    @Override
    public void visit(ElementAll element) {
        System.out.println("visit Element Other");

    }

}
