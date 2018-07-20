package com.jiaop.jplibs.design.observers;

import android.util.Log;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/20
 *     desc   : 第一个观察者
 *     version: 1.0.0
 * </pre>
 */
public class AObserver extends Observer {

    @Override
    void update(String msg) {
        Log.i("AObserver", AObserver.class.getName() + "--" + msg);
    }
}
