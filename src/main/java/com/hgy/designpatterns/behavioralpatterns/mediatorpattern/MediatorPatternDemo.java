package com.hgy.designpatterns.behavioralpatterns.mediatorpattern;

/**
 * @author Evan
 * @Date 2018/9/12
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
