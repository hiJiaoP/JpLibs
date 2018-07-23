package com.jiaop.jplibs.design.prototype;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/23
 *     desc   : 创建接口抽象类，浅克隆
 *     version: 1.0.0
 * </pre>
 */
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    public Shape() {
    }

    abstract void draw();

    public Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        return clone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
