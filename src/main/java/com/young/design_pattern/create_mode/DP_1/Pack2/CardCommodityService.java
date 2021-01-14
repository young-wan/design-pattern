package com.young.design_pattern.create_mode.DP_1.Pack2;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author young
 * @Date 2021/1/13 13:52
 * @Desc
 **/
@Slf4j
public class CardCommodityService implements ICommodity {
    @Override
    public void sendCommodity() {
        log.info("兑换卡发放。。。。。。");
    }
}
