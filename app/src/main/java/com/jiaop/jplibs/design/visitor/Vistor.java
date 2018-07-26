package com.jiaop.jplibs.design.visitor;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/26
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public interface Vistor {

    ////抽象访问者

    void visit(ElementA element);

    void visit(ElementB element);

    void visit(ElementAll element);

}
