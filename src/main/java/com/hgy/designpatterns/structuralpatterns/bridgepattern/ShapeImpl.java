package com.hgy.designpatterns.structuralpatterns.bridgepattern;

/**
 * Shape 接口的实体类
 *
 * @author Evan
 * @Date 2018/9/9
 */
public class ShapeImpl extends Shape {
    private int x, y, radius;

    public ShapeImpl(DrawApi drawApi, int x, int y, int radius) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /**
     * 画图形抽象方法
     */
    @Override
    public void drawShape() {
        drawApi.drawCircle(radius,x,y);
    }
}
