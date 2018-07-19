package com.jiaop.jplibs.design.factory.c;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/18
 *     desc   : 工厂创建器
 *     version: 1.0.0
 * </pre>
 */
public class FactoryProducer {

    public static BaseFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }

}
