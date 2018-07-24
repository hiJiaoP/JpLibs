package com.jiaop.jplibs.design.combination.safe;

import android.util.Log;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/24
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void dispaly(int level) {
        Log.i("Leaf", name + " -- " + level);
    }
}
