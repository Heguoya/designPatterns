package com.hgy.designpatterns.creationalpatterns.prototypepattern;

/**
 * 原型模式demo
 *
 * @author Evan
 * @Date 2018/9/8
 */
public class PrototypePatternsDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        BaseShape clonedShape = (BaseShape) ShapeCache.getBaseShape("1");
        System.out.println("BaseShape : " + clonedShape.getType());
        BaseShape clonedShape2 = (BaseShape) ShapeCache.getBaseShape("2");
        System.out.println("BaseShape : " + clonedShape2.getType());
        BaseShape clonedShape3 = (BaseShape) ShapeCache.getBaseShape("3");
        System.out.println("BaseShape : " + clonedShape3.getType());
    }
}
