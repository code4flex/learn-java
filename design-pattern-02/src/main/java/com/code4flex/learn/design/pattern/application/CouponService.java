package com.code4flex.learn.design.pattern.application;

import com.code4flex.learn.design.pattern.util.model.CouponResult;

/**
 * 优惠券服务
 */
public class CouponService {

    public CouponResult sendCoupon(String uId, String couponNumber, String uuid) {
        System.out.println("发放优惠券一张：" + uId + "," + couponNumber + "," + uuid);
        return new CouponResult("0000", "发放成功");
    }

}
