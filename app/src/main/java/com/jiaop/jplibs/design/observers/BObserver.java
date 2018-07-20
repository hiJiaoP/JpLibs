package com.jiaop.jplibs.design.observers;

import android.util.Log;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/20
 *     desc   : 第二个观察者
 *     version: 1.0.0
 * </pre>
 */
public class BObserver extends Observer {

    @Override
    void update(String msg) {
        Log.i("BObserver", BObserver.class.getName() + "--" + msg);
    }
}
