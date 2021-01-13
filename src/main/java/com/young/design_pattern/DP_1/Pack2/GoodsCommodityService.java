package com.young.design_pattern.DP_1.Pack2;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author young
 * @Date 2021/1/13 13:51
 * @Desc
 **/
@Slf4j
public class GoodsCommodityService implements ICommodity{
    @Override
    public void sendCommodity() {
        log.info("实物发放。。。。。。");
    }
}