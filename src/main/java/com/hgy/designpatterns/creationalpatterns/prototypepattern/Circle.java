package com.hgy.designpatterns.creationalpatterns.prototypepattern;

/**
 * 抽象类BaseShape 的实体类Circle
 * @author Evan
 * @Date 2018/9/8
 */
public class Circle extends BaseShape {
    public Circle() {
        type = "Circle";
    }

    /**
     * 抽象方法
     */
    @Override
    void draw() {
        System.out.println("This is a Circle");
    }
}
