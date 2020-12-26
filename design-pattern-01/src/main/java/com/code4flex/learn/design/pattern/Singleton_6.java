package com.code4flex.learn.design.pattern;

/**
 * 单例模式-双重锁校验
 */
public class Singleton_6 {

    private Singleton_6() {
    }

    private static Singleton_6 instance;


    public static Singleton_6 getInstance(){
       if(null != instance) return instance;
       synchronized (Singleton_6.class){
           if (null == instance){
               instance = new Singleton_6();
           }
       }
       return instance;
    }

}
