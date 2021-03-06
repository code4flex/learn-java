package com.code4flex.learn.design.pattern.application;

import com.alibaba.fastjson.JSON;
import com.code4flex.learn.design.pattern.util.model.DeliverReq;

/**
 * 实物商品服务
 */
public class GoodsService {

    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        return true;
    }

}
