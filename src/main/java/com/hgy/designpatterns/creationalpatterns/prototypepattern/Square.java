package com.hgy.designpatterns.creationalpatterns.prototypepattern;

/**
 * BaseShape 抽象的的实体类 Square
 *
 * @author Evan
 * @Date 2018/9/8
 */
public class Square extends BaseShape {
    public Square() {
        type = "Square";
    }

    /**
     * 抽象方法
     */
    @Override
    void draw() {
        System.out.println("This is a square");
    }
}
