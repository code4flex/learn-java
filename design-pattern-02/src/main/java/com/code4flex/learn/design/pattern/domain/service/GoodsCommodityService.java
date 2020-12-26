package com.code4flex.learn.design.pattern.domain.service;

import com.alibaba.fastjson.JSON;
import com.code4flex.learn.design.pattern.application.GoodsService;
import com.code4flex.learn.design.pattern.domain.ICommodity;
import com.code4flex.learn.design.pattern.domain.model.DeliverReq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class GoodsCommodityService implements ICommodity {

    private Logger logger = LoggerFactory.getLogger(GoodsCommodityService.class);

    private GoodsService goodsService = new GoodsService();

    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        DeliverReq deliverReq = new DeliverReq();
        deliverReq.setUserName(queryUserName(uId));
        deliverReq.setUserPhone(queryUserPhoneNumber(uId));
        deliverReq.setSku(commodityId);
        deliverReq.setOrderId(bizId);
        deliverReq.setConsigneeUserName(extMap.get("userName"));
        deliverReq.setConsigneeUserPhone(extMap.get("userPhone"));
        deliverReq.setConsigneeUserAddress(extMap.get("userAddress"));

        Boolean isSuccess = goodsService.deliverGoods(deliverReq);

        logger.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]：{}", isSuccess);

        if (!isSuccess) throw new RuntimeException("实物商品发放失败");
    }

    private String queryUserName(String uId) {
        return "小四";
    }

    private String queryUserPhoneNumber(String uId) {
        return "18000000000";
    }

}
