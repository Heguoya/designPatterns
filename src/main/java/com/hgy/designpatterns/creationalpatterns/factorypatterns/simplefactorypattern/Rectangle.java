package com.hgy.designpatterns.creationalpatterns.factorypatterns.simplefactorypattern;

/**
 * 矩形实现类
 * @author Evan
 * @Date 2018/8/27
 */
public class Rectangle implements Shape {
    /**
     * 矩形实现画的方法
     */
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}
