package com.hgy.designpatterns.structuralpatterns.bridgepattern;

/**
 * 图形抽象类
 * @author Evan
 * @Date 2018/9/9
 */
public abstract class Shape {
    /**
     * 画图抽象类
     */
    protected DrawApi drawApi;

    protected Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    /**
     * 画图形抽象方法
     */
    public abstract void drawShape();
}
