package com.hgy.designpatterns.structuralpatterns.facadepattern;

/**
 * 方形实现类
 * @author Evan
 * @Date 2018/9/11
 */
public class Square implements Shape {
    /**
     * 画的方法
     */
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
