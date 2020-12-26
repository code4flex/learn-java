package com.code4flex.learn.design.pattern.domain.factory;

import com.code4flex.learn.design.pattern.domain.ICommodity;
import com.code4flex.learn.design.pattern.domain.service.CardCommodityService;
import com.code4flex.learn.design.pattern.domain.service.CouponCommodityService;
import com.code4flex.learn.design.pattern.domain.service.GoodsCommodityService;

/**
 * 商品工厂
 */
public class StoreFactory {

    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;

        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();

        throw new RuntimeException("不存在的商品服务类型");
    }

}
