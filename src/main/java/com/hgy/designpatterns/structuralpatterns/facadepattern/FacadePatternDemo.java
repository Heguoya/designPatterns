package com.hgy.designpatterns.structuralpatterns.facadepattern;

/**
 * 外观模式测试
 * @author Evan
 * @Date 2018/9/11
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
