package com.code4flex.learn.design.pattern;

/**
 * 单例模式-饿汉模式
 */
public class Singleton_4 {

    private Singleton_4() {
    }

    private static Singleton_4 instance = new Singleton_4();


    public static Singleton_4 getInstance() {
        return instance;
    }

}
