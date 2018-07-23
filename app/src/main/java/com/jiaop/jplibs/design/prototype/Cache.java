package com.jiaop.jplibs.design.prototype;

import java.util.Hashtable;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/23
 *     desc   : 缓存类
 *     version: 1.0.0
 * </pre>
 */
public class Cache {

    private static Hashtable<String, Shape> map = new Hashtable<String, Shape>();

    /**
     * 获取克隆对象
     *
     * @param id
     * @return
     * @throws CloneNotSupportedException
     */
    public static Shape getShape(String id) throws CloneNotSupportedException {
        Shape shape = map.get(id);
        return (Shape) shape.clone();
    }

    /**
     * 设置值
     */
    public static void loadCache() {
        Rectangle rectangle = new Rectangle();
        rectangle.setId("1");
        map.put(rectangle.getId(), rectangle);

        Circle circle = new Circle();
        circle.setId("2");
        map.put(circle.getId(), circle);
    }

}
