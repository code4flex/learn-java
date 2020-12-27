package com.code4flex.learn.design.pattern.impl;

import com.code4flex.learn.design.pattern.ICacheService;
import com.code4flex.learn.design.pattern.util.RedisUtils;

import java.util.concurrent.TimeUnit;

public class CacheService implements ICacheService {

    private RedisUtils redisUtils = new RedisUtils();

    public String get(String key) {
        return redisUtils.get(key);
    }

    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        redisUtils.del(key);
    }

}