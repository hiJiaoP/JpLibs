package com.jiaop.jplibs.design.iterator;

import android.util.Log;

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

    private void main() {
        List<String> names = new ArrayList<>();
        names.add("A");
        names.add("B");
        names.add("C");

        Aggregate aggregate = new ConcreteAggregate(names);
        Iterator iterator = aggregate.iterator();

        Log.i("Main", "第一个元素 == " + iterator.first());
        Log.i("Main", "最后一个元素 == " + iterator.last());

        while (iterator.hasNext()) {
            Log.i("Main", "下个元素 == " + iterator.next());
        }

    }

}
