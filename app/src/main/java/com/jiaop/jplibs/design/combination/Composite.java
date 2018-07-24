package com.jiaop.jplibs.design.combination;

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

    //存储包含的枝节点和叶节点
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void dispaly(int level) {
        for (Component component : children) {
            component.dispaly(level + 2);
        }
    }
}
