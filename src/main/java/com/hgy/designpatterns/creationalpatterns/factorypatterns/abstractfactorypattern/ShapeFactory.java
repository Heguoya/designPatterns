package com.hgy.designpatterns.creationalpatterns.factorypatterns.abstractfactorypattern;

/**
 * @author Evan
 * @Date 2018/8/27
 */
public class ShapeFactory extends AbstractFactory {
    /**
     * 圆形
     */
    public static final String CIRCLE ="circle";
    /**
     * 长方形
     */
    public static final String RECTANGLE ="rectangle";
    /**
     * 正方形
     */
    public static final String SQUARE ="square";
    /**
     * 获取color抽象类方法
     *
     * @param color
     * @return
     */
    @Override
    public Color getColor(String color) {
        return null;
    }

    /**
     * 获取shape抽象类方法
     *
     * @param shape
     * @return
     */
    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
        return null;
        }
        /**
         * 根据类型判断返回哪个对象,如果选择分支大于3的时候，
         * 选用switch...case结构效率会更高一些，而小于3时，选用if...else结构更好
         */
        switch (shape) {
            //返回圆形对象
            case CIRCLE: return new Circle();
            //返回长方形对象
            case RECTANGLE: return new Rectangle();
            //返回正方形对象
            case SQUARE: return new Square();
            //返回null
            default:return null;
        }
    }
}
