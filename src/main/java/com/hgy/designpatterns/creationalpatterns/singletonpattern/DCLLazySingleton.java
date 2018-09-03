package com.hgy.designpatterns.creationalpatterns.singletonpattern;

/**
 * 双检锁/双重校验锁懒汉式单例
 *JDK 版本：JDK1.5 起
 *
 * 是否 Lazy 初始化：是
 *
 * 是否多线程安全：是
 *
 * 实现难度：较复杂
 *
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 * @author Evan
 * @Date 2018/9/2
 */
public class DCLLazySingleton {
    /**
     * 双检锁懒汉式单例属性
     */
    private volatile static DCLLazySingleton dclLazySingleton;

    /**
     * 私有构造方法
     */
    private DCLLazySingleton() {

    }

    public static DCLLazySingleton getInstance() {
        synchronized (DCLLazySingleton.class) {
            if (dclLazySingleton == null) {
                dclLazySingleton = new DCLLazySingleton();
            }
        }
        return dclLazySingleton;

    }

}
