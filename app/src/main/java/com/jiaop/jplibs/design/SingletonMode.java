package com.jiaop.jplibs.design;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/18
 *     desc   : 单例模式
 *     version: 1.0.0
 * </pre>
 */
public class SingletonMode {

    private static SingletonMode instance;

    private SingletonMode() {

    }

    /**
     * 最简单的方式，将构造函数设置为私有的，防止其他类调用。
     * 优点：启动快，资源占用少，只有在使用时才被实例化，无锁
     * 缺点：非线程安全，如果有多个线程并行创建，就会创建多个实例。
     *
     * @return
     */
    public static SingletonMode getInstance() {
        if (instance == null) {
            instance = new SingletonMode();
        }
        return instance;
    }

    /**
     * 线程锁，如果多个线程同时执行，其中一个线程会得到同步锁，可以继续执行，其他线程则会等待，
     * 等到执行完成，等待的线程才会执行。因为已经创建了实例，所以后续线程就不会重复创建了。
     * 优点：保证了在多线程情况下只有一个实例
     * 缺点：synchronized 为独占排他锁，并发性能差，执行会很耗时。
     *
     * @return
     */
    public static synchronized SingletonMode getInstance_() {
        if (instance == null) {
            instance = new SingletonMode();
        }
        return instance;
    }

    /**
     * 双重检查锁
     * 首先判断只有在实例在为null时才会进行同步操作，因为如果两个线程都判断instance为null，一个线程加锁，对instance进行了实例化，释放锁，
     * 另外一个线程拿到锁后，不进行instance是否为null的再次判断，会再次进行instance的实例化。
     * 优点：线程安全
     * 缺点：使用了双重判断，容易出错
     *
     * @return
     */
    public static SingletonMode getInstance__() {
        if (instance == null) {
            synchronized (SingletonMode.class) {
                if (instance == null) {
                    instance = new SingletonMode();
                }
            }
        }
        return instance;
    }

    private static volatile SingletonMode instance_;

    /**
     * volatile双重检查锁
     * 我们在instance参数加上了volatile关键字，禁止指令重排序优化，这样对它的写操作产生一个内存屏障，
     * 在它赋值成功完成之前，不会调用读操作。
     * 推荐使用
     *
     * @return
     */
    public static SingletonMode getInstance___() {
        if (instance == null) {
            synchronized (SingletonMode.class) {
                if (instance == null) {
                    instance = new SingletonMode();
                }
            }
        }
        return instance;
    }

    /*****************************************************/

    private static final SingletonMode INSTANCE = new SingletonMode();

    /**
     * 饿汉式
     * 直接在声明参数时创建实例，它天生是线程安全的，使用没有延迟，降低了内存的使用率。
     * 缺点：初始化太早，造成了资源浪费，如果初始化本身依赖于一些其他数据，那么也就很难保证其他数据会在它初始化之前准备好。
     * 建议使用
     *
     * @return
     */
    public static SingletonMode getInstance_____() {
        return INSTANCE;
    }

    /*****************************************************/

    /**
     * 静态内部类
     * SingletonModeHolder是饿汉式，在SingletonModeHolder初始化的时候会由ClassLoader来保证同步，使instance是一个真·单例。
     * 由于是内部类，它被加载时也就是getInstance第一次被调用的时候。
     */
    private static class SingletonModeHolder {
        private final static SingletonMode instance = new SingletonMode();
    }

    public static SingletonMode getInstance______() {
        return SingletonModeHolder.instance;
    }

    /*****************************************************/

    /**
     * 将类设置为枚举类型
     * 创建枚举实例的过程是线程安全的，所以不存在同步问题。
     * 当然，它无法进行继承。
     */
    public enum SingletonModeInts {

        INSTANCE;

        public void fun() {

        }
    }

}
