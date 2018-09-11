package com.hgy.designpatterns.structuralpatterns.facadepattern;

/**
 * 外观类
 * @author Evan
 * @Date 2018/9/11
 */
public class ShapeMaker {
    /**
     * 圆形
     */
    private Shape circle;
    /**
     * 矩形
     */
    private Shape rectangle;
    /**
     * 方形
     */
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
