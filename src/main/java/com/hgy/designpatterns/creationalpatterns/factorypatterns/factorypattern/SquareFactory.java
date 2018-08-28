package com.hgy.designpatterns.creationalpatterns.factorypatterns.factorypattern;

/**
 * @author Evan
 * @Date 2018/8/28
 */
public class SquareFactory implements Factory {
    /**
     * 获取正方形对象
     *
     * @return
     */
    @Override
    public Shape getShape() {
        return new Square();
    }
}
