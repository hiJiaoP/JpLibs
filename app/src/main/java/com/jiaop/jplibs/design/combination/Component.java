package com.jiaop.jplibs.design.combination;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/24
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public abstract class Component {

    protected String name;

    public Component(String name){
        this.name = name;
    }

    /**
     * 增加节点
     * @param component
     */
    public abstract void add(Component component);

    /**
     * 移除节点
     * @param component
     */
    public abstract void remove(Component component);

    /**
     * 显示层级
     */
    public abstract void dispaly(int level);

}
