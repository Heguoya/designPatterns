package com.hgy.designpatterns.structuralpatterns.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 男人标准实现类
 * @author Evan
 * @Date 2018/9/10
 */
public class MaleCriteriaImpl implements Criteria {

    /**
     * 符合标准的对象集合
     *
     * @param persons
     * @return
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if("MALE".equalsIgnoreCase(person.getGender())){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
