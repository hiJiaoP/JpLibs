package com.jiaop.jplibs.design.factory.c;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/18
 *     desc   : 颜色工厂
 *     version: 1.0.0
 * </pre>
 */
public class ColorFactory extends BaseFactory {

    @Override
    public Color getColor(String color) {
        switch (color) {
            case "red":
                return new Red();
            case "blue":
                return new Blue();
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
