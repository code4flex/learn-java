package com.code4flex.learn.design.pattern.application;

/**
 * 爱奇艺会员卡服务
 */
public class IQiYiCardService {
    public void grantToken(String bindMobileNumber, String cardId) {
        System.out.println("发放爱奇艺会员卡一张：" + bindMobileNumber + "，" + cardId);
    }
}
