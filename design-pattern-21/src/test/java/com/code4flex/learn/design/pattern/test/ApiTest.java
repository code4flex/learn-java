package com.code4flex.learn.design.pattern.test;

import com.code4flex.learn.design.pattern.NetMall;
import com.code4flex.learn.design.pattern.impl.JDNetMall;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiTest {

    public Logger logger = LoggerFactory.getLogger(ApiTest.class);

    /**
     * 测试链接
     * 京东；https://item.jd.com/100008348542.html
     * 淘宝；https://detail.tmall.com/item.htm
     * 当当；http://product.dangdang.com/1509704171.html
     */
    @Test
    public void test_NetMall() {
        NetMall netMall = new JDNetMall("888888","*******");
        String base64 = netMall.generateGoodsPoster("https://detail.tmall.com/item.htm");
        logger.info("测试结果：{}", base64);
    }

}
