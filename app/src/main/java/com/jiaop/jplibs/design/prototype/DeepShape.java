package com.jiaop.jplibs.design.prototype;

import java.util.Date;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/23
 *     desc   : 创建接口抽象类，深克隆
 *     version: 1.0.0
 * </pre>
 */
public abstract class DeepShape implements Cloneable {

    private String id;
    private Date date;

    abstract void draw();

    public Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        DeepShape shape = (DeepShape) clone;
        //把对象下的所有引用属性也克隆出来
        shape.date = (Date) this.date.clone();
        return clone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
