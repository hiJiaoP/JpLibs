package com.jiaop.jplibs.design.plot;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/26
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class Main {

    public void main() {
        MyContext context;
        System.out.println("-----执行策略1-----");
        context = new MyContext(new StrategyOne());
        context.execute();

        System.out.println("-----执行策略2-----");
        context = new MyContext(new StrategyTwo());
        context.execute();
    }

}
