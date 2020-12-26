package com.code4flex.learn.design.pattern;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 单例模式-原子类实现
 */
public class Singleton_7 {

    private static final AtomicReference<Singleton_7> INSTANCE = new AtomicReference<Singleton_7>();

    private static Singleton_7 instance;

    private Singleton_7() {
    }

    public static final Singleton_7 getInstance() {
        //自旋操作
        for (; ; ) {
            Singleton_7 instance = INSTANCE.get();
            if (null != instance) return instance;
            INSTANCE.compareAndSet(null, new Singleton_7());
            return INSTANCE.get();
        }
    }
}
