package com.hgy.designpatterns.structuralpatterns.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evan
 * @Date 2018/9/10
 */
public class FemaleCriteriaImpl implements Criteria {
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
            if("FEMALE".equalsIgnoreCase(person.getGender())){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
