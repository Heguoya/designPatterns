package com.hgy.designpatterns.creationalpatterns.factorypatterns.abstractfactorypattern;

/**
 * 正方形实现类
 * @author Evan
 * @Date 2018/8/27
 */
public class Square implements Shape {
    /**
     * 实现画图方法
     */
    @Override
    public void draw() {
        System.out.println("画一个正方形");
    }
}
