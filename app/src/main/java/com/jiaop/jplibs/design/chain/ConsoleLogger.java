package com.jiaop.jplibs.design.chain;

import android.util.Log;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/26
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        Log.i("ConsoleLogger", "Standard Console::Logger: " + message);
    }
}
