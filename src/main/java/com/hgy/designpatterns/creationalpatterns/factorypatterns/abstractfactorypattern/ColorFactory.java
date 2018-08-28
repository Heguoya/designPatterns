package com.hgy.designpatterns.creationalpatterns.factorypatterns.abstractfactorypattern;

/**
 * @author Evan
 * @Date 2018/8/27
 */
public class ColorFactory extends AbstractFactory {
    /**
     * 圆形
     */
    public static final String GREEN = "green";
    /**
     * 长方形
     */
    public static final String RED = "red";
    /**
     * 正方形
     */
    public static final String BULE = "bule";

    /**
     * 获取color抽象类方法
     *
     * @param color
     * @return
     */
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        /**
         * 根据类型判断返回哪个对象,如果选择分支大于3的时候，
         * 选用switch...case结构效率会更高一些，而小于3时，选用if...else结构更好
         */
        switch (color) {
            //返回绿色对象
            case GREEN:
                return new Green();
            //返回红色对象
            case RED:
                return new Red();
            //返回蓝色对象
            case BULE:
                return new Blue();
            //返回null
            default:
                return null;
        }
    }

    /**
     * 获取shape抽象类方法
     *
     * @param shape
     * @return
     */
    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
