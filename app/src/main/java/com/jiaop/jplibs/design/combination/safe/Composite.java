package com.jiaop.jplibs.design.combination.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/24
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class Composite extends Component {

    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void dispaly(int level) {

    }
}
