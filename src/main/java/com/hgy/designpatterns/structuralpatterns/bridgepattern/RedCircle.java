package com.hgy.designpatterns.structuralpatterns.bridgepattern;

/**
 * 红色圆实现类
 * @author Evan
 * @Date 2018/9/9
 */
public class RedCircle implements DrawApi {
    /**
     * 画圆的方法
     *
     * @param radius
     * @param x
     * @param y
     */
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
