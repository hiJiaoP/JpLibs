package com.jiaop.jplibs.design.visitor;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/26
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class ElementAll implements Element {

    private Element[] elements;

    public ElementAll() {
        this.elements = new Element[]{new ElementA(), new ElementB()};
    }

    @Override
    public void accept(Vistor vistor) {
        for (Element element : elements) {
            element.accept(vistor);
        }
        vistor.visit(this);
    }

}
