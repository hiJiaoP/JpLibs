package com.jiaop.jplibs.design.state;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/26
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class MyContext {

    //带有某个状态的类

    private State state;

    public MyContext(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

}
