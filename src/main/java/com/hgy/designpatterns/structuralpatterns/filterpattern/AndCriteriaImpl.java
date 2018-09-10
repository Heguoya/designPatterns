package com.hgy.designpatterns.structuralpatterns.filterpattern;

import java.util.List;

/**
 * 双重标准
 * @author Evan
 * @Date 2018/9/10
 */
public class AndCriteriaImpl implements Criteria {
    /**
     * 第一个标准
     */
    private Criteria criteria;
    /**
     * 第二个标准
     */
    private Criteria otherCriteria;

    /**
     * 构造方法
     * @param criteria
     * @param otherCriteria
     */
    public AndCriteriaImpl(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    /**
     * 标准方法
     * @param persons
     * @return
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
