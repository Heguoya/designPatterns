package com.hgy.designpatterns.behavioralpatterns.iteratorpattern;

/**
 * @author Evan
 * @Date 2018/9/12
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        Container container =new ContainerImpl();
        for (Iterator iterator = container.getIterator(); iterator.hasNext(); ) {
            String name = (String) iterator.next();
            System.out.println("Name"+name);
        }
    }
}
