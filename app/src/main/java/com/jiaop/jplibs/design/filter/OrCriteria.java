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
public class OrCriteria implements Criteria {

    //筛选只要具备其中一个标准的对象

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);
        //遍历其中一种标准，判断如果另一种标准不存在，则保留
        for (Person person : otherCriteriaItems) {
            if (!firstCriteriaItems.contains(person)) {
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }

}
