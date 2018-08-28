package com.hgy.designpatterns.creationalpatterns.factorypatterns.factorypattern;

/**
 * 圆形实现类
 * @author Evan
 * @Date 2018/8/27
 */
public class Circle implements Shape {
    /**
     * 圆形实现方法
     */
    @Override
    public void draw() {
        System.out.println("画一个圆形");
    }
}
