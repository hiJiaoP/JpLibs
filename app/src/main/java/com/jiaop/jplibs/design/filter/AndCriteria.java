package com.jiaop.jplibs.design.filter;

import java.util.List;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/24
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class AndCriteria implements Criteria {

    //组合标准，交集

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        //筛选其中一种标准
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        //筛选另一种标准，并返回
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
