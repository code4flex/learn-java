package com.code4flex.learn.design.pattern;

/**
 * 单例模式-内部类
 */
public class Singleton_5 {

    private Singleton_5() {
    }

    private static class SingletonHolder {
        private static Singleton_5 instance = new Singleton_5();
    }

    public static Singleton_5 getInstance() {
        return SingletonHolder.instance;
    }

}
