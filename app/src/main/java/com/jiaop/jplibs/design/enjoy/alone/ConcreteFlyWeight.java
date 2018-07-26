package com.jiaop.jplibs.design.enjoy.alone;

import android.util.Log;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/26
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class ConcreteFlyWeight implements FlyWeight {

    //具体享元角色类

    private final static String TAG = "ConcreteFlyWeight";
    //内蕴状态
    private Character intrinsicState = null;

    /**
     * 内蕴状态值应当在享元对象被创建时赋值，所有的内蕴状态在对象创建之后，就不会再改变了。
     * 如果一个享元对象有外蕴状态的话，所有的外部状态都必须存储在客户端
     * 在使用享元对象时，再由客户端传入享元对象。
     *
     * @param status
     */
    public ConcreteFlyWeight(Character status) {
        this.intrinsicState = status;
    }

    /**
     * 由外部传入的外蕴状态
     * 外蕴状态作为参数传入方法中，改变方法的行为，但是并不改变对象的内蕴状态。
     *
     * @param status
     */
    @Override
    public void operation(String status) {
        Log.i(TAG, "Intrinsic == " + intrinsicState);
        Log.i(TAG, "Extrinsic == " + status);
    }
}
