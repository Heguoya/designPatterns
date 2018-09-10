package com.hgy.designpatterns.structuralpatterns.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evan
 * @Date 2018/9/10
 */
public class FilterPatternDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","MALE", "Single"));
        persons.add(new Person("John","MALE", "Married"));
        persons.add(new Person("Laura","FEMALE", "Married"));
        persons.add(new Person("Diana","FEMALE", "Single"));
        persons.add(new Person("Mike","MALE", "Single"));
        persons.add(new Person("Bobby","MALE", "Single"));

        Criteria male = new MaleCriteriaImpl();
        Criteria female = new FemaleCriteriaImpl();
        Criteria single = new SingleCriteriaImpl();
        Criteria singleMale = new AndCriteriaImpl(single, male);
        Criteria singleOrFemale = new OrCriteriaImpl(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }
}
