package com.jiaop.jplibs.design.enjoy.complex;

import android.util.Log;

import com.jiaop.jplibs.design.enjoy.alone.FlyWeight;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/26
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class Main {

    private final static String TAG = "Main";

    private void main() {
        List<Character> compositeState = new ArrayList<Character>();
        compositeState.add('a');
        compositeState.add('b');
        compositeState.add('c');
        compositeState.add('a');
        compositeState.add('b');

        FlyWeightFactory flyFactory = new FlyWeightFactory();
        FlyWeight compositeFly1 = flyFactory.factory(compositeState);
        FlyWeight compositeFly2 = flyFactory.factory(compositeState);
        compositeFly1.operation("Composite Call");

        Log.i(TAG, "复合享元模式是否可以共享对象：" + (compositeFly1 == compositeFly2));

        Character state = 'a';
        FlyWeight fly1 = flyFactory.factory(state);
        FlyWeight fly2 = flyFactory.factory(state);

        Log.i(TAG, "单纯享元模式是否可以共享对象：" + (fly1 == fly2));
    }

}
