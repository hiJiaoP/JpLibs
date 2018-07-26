package com.jiaop.jplibs.design.iterator;

import java.util.List;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/26
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class ConcreteAggregate extends Aggregate {

    //具体聚集对象

    private List<String> names;

    public ConcreteAggregate(List<String> names) {
        this.names = names;
    }

    @Override
    Iterator iterator() {
        return new AggregateIterator(this);
    }

    public String first(){
        return names == null ? null : names.get(0);
    }

    public String last(){
        return names == null ? null : names.get(names.size() - 1);
    }

    public String next(int index){
        return names == null ? null : names.get(index);
    }

    public int size(){
        return names.size();
    }
}
