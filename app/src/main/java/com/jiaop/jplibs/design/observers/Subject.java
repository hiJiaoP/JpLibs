package com.jiaop.jplibs.design.observers;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/20
 *     desc   : 被观察者
 *     version: 1.0.0
 * </pre>
 */
public class Subject {

    //一对多关系，通知观察者状态改变
    private List<Observer> observers = new ArrayList<>();

    /**
     * 增加观察者
     *
     * @param observer
     */
    public void addObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    /**
     * 移除观察者
     *
     * @param observer
     */
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    /**
     * 通知观察者
     *
     * @param msg
     */
    public void noticeObserver(String msg) {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }

}
