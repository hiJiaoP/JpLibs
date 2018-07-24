package com.jiaop.jplibs.design.filter;

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
public class Main {

    private void main() {
        //首先创建一个人群
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Robert", "Male", "Single"));
        personList.add(new Person("John", "Male", "Married"));
        personList.add(new Person("Laura", "Female", "Married"));
        personList.add(new Person("Diana", "Female", "Single"));
        personList.add(new Person("Mike", "Male", "Single"));
        personList.add(new Person("Bobby", "Male", "Single"));

        //标准
        Criteria male = new Male();
        Criteria female = new Female();
        Criteria single = new Single();
        //单身的男人
        Criteria singleMale = new AndCriteria(single, male);
        //单身的或者女人
        Criteria singleOrFemale = new OrCriteria(single, female);

        //筛选男人
        male.meetCriteria(personList);
        //筛选女人
        female.meetCriteria(personList);
        //筛选单身的人
        single.meetCriteria(personList);
        //筛选单身男人
        singleMale.meetCriteria(personList);
        //筛选单身或者女人，满足其一即可
        singleOrFemale.meetCriteria(personList);
    }

}
