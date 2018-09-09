package com.hgy.designpatterns.creationalpatterns.prototypepattern;

/**
 * BaseShape 抽象类的实体类 Rectangle
 * @author Evan
 * @Date 2018/9/8
 */
public class Rectangle extends BaseShape {

    public Rectangle() {
        type = "rectangle";
    }

    @Override
    void draw() {
        System.out.println("This is a rectangle");
    }
}
