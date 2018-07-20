package com.jiaop.jplibs.design.observers;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/20
 *     desc   : 使用
 *     version: 1.0.0
 * </pre>
 */
public class Main {

    /**
     * 在被观察者中注册了这些观察者，当被观察者状态有所改变，
     * 观察者也会做出相应的变化。
     */
    public void main() {
        AObserver aObserver = new AObserver();
        BObserver bObserver = new BObserver();
        CObserver cObserver = new CObserver();

        Subject subject = new Subject();

        subject.addObserver(aObserver);
        subject.addObserver(bObserver);
        subject.addObserver(cObserver);

        subject.noticeObserver("Change");

    }

}
