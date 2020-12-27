package com.code4flex.learn.design.pattern.util;

import java.util.Map;

/**
 * 发放奖品接口
 */
public interface ICommodity {

    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;

}
