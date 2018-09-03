package com.hgy.designpatterns.creationalpatterns.singletonpattern;

/**
 * @author Evan
 * @Date 2018/9/2
 */
public enum EnumFactory {

    singletonFactory;

    private MySingleton instance;

    /**
     * 枚举类的构造方法在类加载是被实例化
     * @return
     */
    EnumFactory() {
        instance = new MySingleton();
    }


    public MySingleton getInstance() {
        return instance;
    }

}

/**
 * 需要获实现单例的类，比如数据库连接Connection
 */
class MySingleton {
    public MySingleton() {
    }
}


