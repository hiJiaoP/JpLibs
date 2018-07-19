package com.jiaop.jplibs.design.factory.a;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/18
 *     desc   : 简单工厂模式
 *     version: 1.0.0
 * </pre>
 */
public class FactoryMode {

    public static Fruit get(int type) {
        switch (type) {
            case 0:
                //参数为0返回苹果
                return new Apple();
            case 1:
                //参数为1返回香蕉
                return new Banana();
            default:
                throw new IllegalArgumentException();
        }
    }

}
