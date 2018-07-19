package com.jiaop.jplibs.design.factory.c;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/18
 *     desc   : 形状工厂
 *     version: 1.0.0
 * </pre>
 */
public class ShapeFactory extends BaseFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        switch (shape) {
            case "round":
                return new Round();
            case "square":
                return new Square();
            default:
                throw new IllegalArgumentException();
        }
    }
}
