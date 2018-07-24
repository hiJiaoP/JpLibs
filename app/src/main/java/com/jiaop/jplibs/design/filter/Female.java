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
public class Female implements Criteria {

    //女性

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("FEMALE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
