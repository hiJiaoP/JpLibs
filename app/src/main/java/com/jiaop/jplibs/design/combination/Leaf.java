package com.jiaop.jplibs.design.combination;

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

    //因为叶子节点没有子节点，所以添加和移除没意义

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public void dispaly(int level) {
        Log.i("Leaf", name + " -- " + level);
    }
}
