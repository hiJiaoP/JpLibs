package com.jiaop.jplibs.design.iterator;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/26
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class AggregateIterator implements Iterator {

    //具体迭代器

    private ConcreteAggregate concreteAggregate;
    private int index;

    public AggregateIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
        this.index = 0;
    }

    @Override
    public String first() {
        return concreteAggregate.first();
    }

    @Override
    public String last() {
        return concreteAggregate.last();
    }

    @Override
    public boolean hasNext() {
        if (index < concreteAggregate.size()) {
            index++;
            return true;
        }
        return false;
    }

    @Override
    public String next() {
        return concreteAggregate.next(index - 1);
    }
}
