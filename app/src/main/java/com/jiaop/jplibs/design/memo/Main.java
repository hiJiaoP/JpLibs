package com.jiaop.jplibs.design.memo;

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

    private void main() {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        Log.i("Main", "Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        Log.i("Main", "First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        Log.i("Main", "Second saved State: " + originator.getState());
    }

}
