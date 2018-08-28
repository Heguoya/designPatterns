package com.hgy.designpatterns.creationalpatterns.factorypatterns.factorypattern;

/**
 * @author Evan
 * @Date 2018/8/28
 */
public class CircleFactory implements Factory {

    /**
     * 获取圆形对象
     *
     * @return
     */
    @Override
    public Shape getShape() {
        return new Circle();
    }
}
