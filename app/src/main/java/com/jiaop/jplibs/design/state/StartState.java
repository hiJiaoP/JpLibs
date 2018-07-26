package com.jiaop.jplibs.design.state;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/26
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class StartState implements State{

    //开始状态

    @Override
    public void doAction(MyContext context) {
        context.setState(this);
    }
}
