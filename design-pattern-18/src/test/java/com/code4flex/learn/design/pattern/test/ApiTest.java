package com.code4flex.learn.design.pattern.test;

import com.alibaba.fastjson.JSON;
import com.code4flex.learn.design.pattern.LotteryService;
import com.code4flex.learn.design.pattern.model.LotteryResult;
import com.code4flex.learn.design.pattern.service.impl.LotteryServiceImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test() {
        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult result = lotteryService.draw("8888888888");
        logger.info("测试结果：{}", JSON.toJSONString(result));
    }
}
