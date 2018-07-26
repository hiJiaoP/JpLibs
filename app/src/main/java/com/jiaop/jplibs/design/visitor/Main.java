package com.jiaop.jplibs.design.visitor;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/26
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class Main {

    private void main() {
        ElementAll elementAll = new ElementAll();
        elementAll.accept(new DisplayVisitor());
    }

}
