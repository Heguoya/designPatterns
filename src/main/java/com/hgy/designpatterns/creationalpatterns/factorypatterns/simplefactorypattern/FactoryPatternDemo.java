package com.hgy.designpatterns.creationalpatterns.factorypatterns.simplefactorypattern;

/**
 * 简单工厂演示demo
 * @author Evan
 * @Date 2018/8/27
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        //获取circle对象,并调用它的draw方法
        Shape circle = shapeFactory.getShape(ShapeFactory.CIRCLE);
        circle.draw();

        //获取Rectangle对象,并调用它的draw方法
        Shape rectangle = shapeFactory.getShape(ShapeFactory.RECTANGLE);
        rectangle.draw();

        //获取Square对象,并调用它的draw方法
        Shape square = shapeFactory.getShape(ShapeFactory.SQUARE);
        square.draw();

        //利用反射的方式优化简单工厂
        Shape c = (Shape) ReflectFactory.getClass(Circle.class);
        c.draw();
    }
}
