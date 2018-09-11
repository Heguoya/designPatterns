package com.hgy.designpatterns.structuralpatterns.facadepattern;

/**
 * 圆形实现类
 * @author Evan
 * @Date 2018/9/11
 */
public class Circle implements Shape {
    /**
     * 画的方法
     */
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
