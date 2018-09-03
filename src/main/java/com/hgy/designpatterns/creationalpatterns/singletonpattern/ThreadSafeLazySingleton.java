package com.hgy.designpatterns.creationalpatterns.singletonpattern;

/**
 * 是否 Lazy 初始化：是
 *
 * 是否多线程安全：是
 *
 * 实现难度：易
 *
 * 描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 * 优点：第一次调用才初始化，避免内存浪费。
 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 * getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。
 * @author Evan
 * @Date 2018/9/2
 */
public class ThreadSafeLazySingleton {
    /**
     * 创建懒汉式单例对象
     */
    private static ThreadSafeLazySingleton lazySingleton;

    /**
     * 懒汉式单例模式私有化构造函数
     */
    private ThreadSafeLazySingleton() {

    }

//    /**
//     * 对外提供获取懒汉式单例对象的获取方法
//     *
//     * @return
//     */
//        public static synchronized ThreadSafeLazySingleton getInstance() {
//            if (lazySingleton == null) {
//                lazySingleton = new ThreadSafeLazySingleton();
//            }
//            return lazySingleton;
//        }
    /**
     * 对外提供获取懒汉式单例对象的获取方法
     *
     * @return
     */
    public static  ThreadSafeLazySingleton getInstance() {
        synchronized(ThreadSafeLazySingleton.class){
            if (lazySingleton == null) {
                lazySingleton = new ThreadSafeLazySingleton();
            }
            return lazySingleton;
        }

    }
}
