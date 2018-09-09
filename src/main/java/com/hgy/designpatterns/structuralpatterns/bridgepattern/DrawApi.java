package com.hgy.designpatterns.structuralpatterns.bridgepattern;

/**
 * 桥接实现接口
 * @author Evan
 * @Date 2018/9/9
 */
public interface DrawApi {
    /**
     * 画圆的方法
     * @param radius
     * @param x
     * @param y
     */
    void drawCircle(int radius,int x, int y);
}
