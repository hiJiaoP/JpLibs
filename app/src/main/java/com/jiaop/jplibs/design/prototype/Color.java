package com.jiaop.jplibs.design.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/23
 *     desc   : 序列化需要原型对象实现Serializable接口
 *     version: 1.0.0
 * </pre>
 */
public class Color implements Serializable {

    private String id;
    private Date date;

    public Color() {
    }

    public Color(String id, Date date) {
        this.id = id;
        this.date = date;
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
