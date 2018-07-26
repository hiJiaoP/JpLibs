package com.jiaop.jplibs.design.enjoy.complex;

import com.jiaop.jplibs.design.enjoy.alone.FlyWeight;

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
public class ConcreteCompositeFlyWeight implements FlyWeight {

    //复合享元角色类

    private Map<Character, FlyWeight> files = new HashMap<Character, FlyWeight>();

    /**
     * 聚集管理方法
     * 增加一个新的单纯享元对象到聚集中
     *
     * @param key
     * @param fly
     */
    public void add(Character key, FlyWeight fly) {
        files.put(key, fly);
    }

    /**
     * 外蕴状态作为参数传入到方法中
     *
     * @param status
     */
    @Override
    public void operation(String status) {
        FlyWeight fly = null;
        for (Object o : files.keySet()) {
            fly = files.get(o);
            fly.operation(status);
        }
    }
}
