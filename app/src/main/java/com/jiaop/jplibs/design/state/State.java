package com.jiaop.jplibs.design.state;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/26
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public interface State {

    //状态接口

    void doAction(MyContext context);

}
