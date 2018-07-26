package com.jiaop.jplibs.design.plot;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/26
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class MyContext {

    private Strategy strategy;

    public MyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        strategy.doSomething();
    }

}
