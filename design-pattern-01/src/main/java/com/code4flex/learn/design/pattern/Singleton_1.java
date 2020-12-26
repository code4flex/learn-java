package com.code4flex.learn.design.pattern;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 单例模式-静态类实现
 */
public class Singleton_1 {

    public static Map<String,String> cache = new ConcurrentHashMap<String, String>();

}
