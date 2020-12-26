package com.code4flex.learn.design.pattern.application;

public class IQiYiCardService {
    public void grantToken(String bindMobileNumber, String cardId) {
        System.out.println("发放爱奇艺会员卡一张：" + bindMobileNumber + "，" + cardId);
    }
}
