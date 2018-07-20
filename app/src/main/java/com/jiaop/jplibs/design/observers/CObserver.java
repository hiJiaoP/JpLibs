package com.jiaop.jplibs.design.observers;

import android.util.Log;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/20
 *     desc   : 第三个观察者
 *     version: 1.0.0
 * </pre>
 */
public class CObserver extends Observer {

    @Override
    void update(String msg) {
        Log.i("CObserver", CObserver.class.getName() + "--" + msg);
    }
}
