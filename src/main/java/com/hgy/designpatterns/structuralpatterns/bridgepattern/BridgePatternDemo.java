package com.hgy.designpatterns.structuralpatterns.bridgepattern;

/**
 * @author Evan
 * @Date 2018/9/9
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new ShapeImpl(new RedCircle(), 100, 100, 10);
        Shape greenCircle = new ShapeImpl(new GreenCircle(), 100, 100, 10 );

        redCircle.drawShape();
        greenCircle.drawShape();
    }

}
