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
public interface Criteria {

    //创建一个标准的接口
    //根据不同的标准获取相应的人群
    List<Person> meetCriteria(List<Person> persons);

}
