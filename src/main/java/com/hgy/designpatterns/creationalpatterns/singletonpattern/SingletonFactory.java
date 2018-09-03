package com.hgy.designpatterns.creationalpatterns.singletonpattern;

/**
 * @author Evan
 * @Date 2018/9/2
 */
public class SingletonFactory {
    /**
     * 创建私有枚举类
     */
    private enum MyEnumSingleton{
        /**
         *
         */
        singletonFactory;

        private MySingleton instance;

        /**
         * 枚举类的构造方法在类加载是被实例化
         * @return
         */
        MyEnumSingleton(){
            instance = new MySingleton();
        }

        public MySingleton getInstance(){
            return instance;
        }
    }

    public static MySingleton getInstance(){
        return MyEnumSingleton.singletonFactory.getInstance();
    }
}

