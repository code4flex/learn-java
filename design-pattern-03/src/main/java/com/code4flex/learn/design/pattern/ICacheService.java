package com.code4flex.learn.design.pattern;

import java.util.concurrent.TimeUnit;

public interface ICacheService {

    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
