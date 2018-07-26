package com.jiaop.jplibs.design.state;

import android.util.Log;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/26
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class Main {

    private void main(){
        MyContext context = new MyContext();
        StartState startState = new StartState();
        startState.doAction(context);
        Log.i("Main",context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        Log.i("Main",context.getState().toString());
    }

}
