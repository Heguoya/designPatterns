package com.hgy.designpatterns.creationalpatterns.factorypatterns.simplefactorypattern;

/**
 * 利用反射解决简单工厂每次增加新了产品类都要修改产品工厂的弊端
 * @author Evan
 * @Date 2018/8/28
 */
public class ReflectFactory {

        public static Object getClass(Class<? extends Shape> clazz) {
            Object obj = null;

            try {
                obj = Class.forName(clazz.getName()).newInstance();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

            return obj;
        }
}
