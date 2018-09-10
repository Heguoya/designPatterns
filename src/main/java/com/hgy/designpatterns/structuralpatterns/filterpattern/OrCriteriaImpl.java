package com.hgy.designpatterns.structuralpatterns.filterpattern;

import java.util.List;

/**
 * @author Evan
 * @Date 2018/9/10
 */
public class OrCriteriaImpl implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteriaImpl(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    /**
     * 符合标准对象的集合
     * @param persons
     * @return
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        for (Person person : otherCriteriaItems) {
            if (!firstCriteriaItems.contains(person)) {
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
