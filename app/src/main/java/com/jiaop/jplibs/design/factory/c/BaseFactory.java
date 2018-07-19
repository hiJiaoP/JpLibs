package com.jiaop.jplibs.design.factory.c;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/18
 *     desc   : 为Color和Shape对象创建抽象类来获取工厂
 *     version: 1.0.0
 * </pre>
 */
public abstract class BaseFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);

}
