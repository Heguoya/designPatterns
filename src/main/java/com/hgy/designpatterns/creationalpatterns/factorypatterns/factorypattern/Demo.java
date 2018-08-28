package com.hgy.designpatterns.creationalpatterns.factorypatterns.factorypattern;

/**
 * @author Evan
 * @Date 2018/8/28
 */
public class Demo {
    public static void main(String[] args) {
        Factory circleFactory = new CircleFactory();
        Shape circle = circleFactory.getShape();
        circle.draw();
    }
}
