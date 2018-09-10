package com.hgy.designpatterns.structuralpatterns.filterpattern;

import java.util.List;

/**
 * 标准接口
 * @author Evan
 * @Date 2018/9/10
 */
public interface Criteria {
    /**
     * 符合标准的对象集合
     * @param persons
     * @return
     */
     List<Person> meetCriteria(List<Person> persons);
}
