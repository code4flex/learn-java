package com.code4flex.learn.design.pattern.test;

import com.code4flex.learn.design.pattern.domain.ICommodity;
import com.code4flex.learn.design.pattern.domain.factory.StoreFactory;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ApiTest {

    @Test
    public void testCommodity()throws Exception {
        StoreFactory storeFactory = new StoreFactory();

        // 1. 优惠券
        ICommodity commodityService_1 = storeFactory.getCommodityService(1);
        commodityService_1.sendCommodity("1888888", "BID999999999999", "777777777777", null);

        // 2. 实物商品
        ICommodity commodityService_2 = storeFactory.getCommodityService(2);
        Map<String,String> extMap = new HashMap<String,String>();
        extMap.put("uName", "李爽");
        extMap.put("userPhone", "15800000000");
        extMap.put("userAddress", "上海市杨浦区区国定东路200号.#2-5f");

        commodityService_2.sendCommodity("2888888","SW99999999999","7777",new HashMap<String, String>() {{
            put("userName", "李爽");
            put("userPhone", "15800000000");
            put("userAddress", "上海市杨浦区区国定东路200号.#2-5f");
        }});

        // 3. 第三方兑换卡
        ICommodity commodityService_3 = storeFactory.getCommodityService(3);
        commodityService_3.sendCommodity("3888888","CD99999999999",null,null);

    }
}
