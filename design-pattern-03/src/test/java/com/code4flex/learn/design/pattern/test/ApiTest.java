package com.code4flex.learn.design.pattern.test;

import com.code4flex.learn.design.pattern.ICacheService;
import com.code4flex.learn.design.pattern.factory.JDKProxy;
import com.code4flex.learn.design.pattern.factory.impl.EGMCacheAdapter;
import com.code4flex.learn.design.pattern.factory.impl.IIRCacheAdapter;
import com.code4flex.learn.design.pattern.impl.CacheService;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_CacheService() throws Exception {

        ICacheService proxy_EGM = JDKProxy.getProxy(CacheService.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_888", "lise");
        String val01 = proxy_EGM.get("user_name_888");
        System.out.println("value：" + val01);

        ICacheService proxy_IIR = JDKProxy.getProxy(CacheService.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_888", "lise");
        String val02 = proxy_IIR.get("user_name_888");
        System.out.println("value：" + val02);
    }
}
