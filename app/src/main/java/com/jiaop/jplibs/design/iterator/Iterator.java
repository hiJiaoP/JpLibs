package com.jiaop.jplibs.design.iterator;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/26
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public interface Iterator {

    //迭代器接口

    /**
     * 第一个元素
     *
     * @return
     */
    String first();

    /**
     * 最后一个元素
     *
     * @return
     */
    String last();

    /**
     * 是否存在下一个元素
     *
     * @return
     */
    boolean hasNext();

    /**
     * 下个元素
     *
     * @return
     */
    String next();

}
