package com.hgy.designpatterns.creationalpatterns.factorypatterns.abstractfactorypattern;

/**
 * 工厂生产者
 *
 * @author Evan
 * @Date 2018/8/27
 */
public class FactoryProducer {
    /**
     * 图形实例
     */
    public static final String SHAPE = "shape";
    /**
     * 颜色实例
     */
    public static final String COLOR = "color";

    /**
     * 选择实例工厂
     *
     * @param choice
     * @return
     */
    public static AbstractFactory getFactory(String choice) {
        /**
         * 判断是否为空
         */
        if (choice == null) {
            return null;
        }
             //图形工厂
        if (SHAPE.equals(choice)) {
            return new ShapeFactory();
            //颜色工厂
        } else if (COLOR.equals(choice)) {
            return new ColorFactory();
        }
        return null;
    }
}
