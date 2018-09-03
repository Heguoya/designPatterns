package com.hgy.designpatterns.creationalpatterns.singletonpattern;

/**
 * 是否 Lazy 初始化：是
 * <p>
 * 是否多线程安全：否
 * <p>
 * 实现难度：易
 * <p>
 * 描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 * 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
 * 非线程安全的懒汉式单例模式
 *
 * @author Evan
 * @Date 2018/9/2
 */
public class LazySingleton {
    /**
     * 创建懒汉式单例对象
     */
    private static LazySingleton lazySingleton;

    /**
     * 懒汉式单例模式私有化构造函数
     */
    private LazySingleton() {

    }

    /**
     * 对外提供获取懒汉式单例对象的获取方法
     *
     * @return
     */
    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
