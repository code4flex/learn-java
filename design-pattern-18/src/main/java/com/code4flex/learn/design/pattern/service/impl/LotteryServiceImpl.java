package com.code4flex.learn.design.pattern.service.impl;

import com.code4flex.learn.design.pattern.LotteryService;
import com.code4flex.learn.design.pattern.model.LotteryResult;
import com.code4flex.learn.design.pattern.service.MinibusTargetService;

import java.util.Date;

public class LotteryServiceImpl extends LotteryService {

    private MinibusTargetService minibusTargetService = new MinibusTargetService();

    @Override
    protected LotteryResult doDraw(String uId) {
        // 摇号
        String lottery = minibusTargetService.lottery(uId);
        // 结果
        return new LotteryResult(uId, lottery, new Date());
    }

}
