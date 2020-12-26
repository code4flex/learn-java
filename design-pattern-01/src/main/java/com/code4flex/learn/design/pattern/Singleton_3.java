package com.code4flex.learn.design.pattern;

/**
 * 单例模式-懒汉模式，线程安全
 */
public class Singleton_3 {

    private static Singleton_3 instance;

    private Singleton_3() {
    }

    public static synchronized Singleton_3 getInstance(){
        if (null != instance) return instance;
        return new Singleton_3();
    }

}
