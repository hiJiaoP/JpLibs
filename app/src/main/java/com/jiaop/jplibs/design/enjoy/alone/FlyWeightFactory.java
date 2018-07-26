package com.jiaop.jplibs.design.enjoy.alone;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/26
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class FlyWeightFactory {

    //享元工厂角色类
    //享元工厂对象在整个系统中只有一个，可以使用单例模式

    private Map<Character, FlyWeight> files = new HashMap<Character, FlyWeight>();

    /**
     * 当客户端需要单纯享元对象的时候，需要调用享元工厂的factory()方法，
     * 并传入所需的单纯享元对象的内蕴状态，由工厂方法产生所需要的享元对象。
     *
     * @param state
     * @return
     */
    public FlyWeight factory(Character state) {
        //先从缓存中查找对象
        FlyWeight fly = files.get(state);
        if (fly == null) {
            //如果对象不存在则创建一个新的Flyweight对象
            fly = new ConcreteFlyWeight(state);
            //把这个新的Flyweight对象添加到缓存中
            files.put(state, fly);
        }
        return fly;
    }

}
