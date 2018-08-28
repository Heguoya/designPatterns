package com.hgy.designpatterns.creationalpatterns.factorypatterns.abstractfactorypattern;

/**
 * 长方形实现类
 * @author Evan
 * @Date 2018/8/27
 */
public class Rectangle implements Shape {
    /**
     * 画图方法
     */
    @Override
    public void draw() {
        System.out.println("画一个长方形");
    }
}
