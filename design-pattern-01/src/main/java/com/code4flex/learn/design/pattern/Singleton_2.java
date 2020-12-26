package com.code4flex.learn.design.pattern;

/**
 * 单例模式-懒汉模式，非线程安全
 */
public class Singleton_2 {

    private static Singleton_2 instance;

    private Singleton_2() {
    }

    public static Singleton_2 getInstance(){
        if (null != instance) return instance;
        return new Singleton_2();
    }

}
