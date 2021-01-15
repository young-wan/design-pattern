package com.young.design_pattern.structure_mode.DP_6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author young
 * @Date 2021/1/14 15:38
 * @Desc
 **/
public class OrderService {
    private Logger logger =
            LoggerFactory.getLogger(OrderService.class);

    public long queryUserOrderCount(String userId) {
        logger.info("⾃营商家，查询⽤户的订单是否为⾸单：{}", userId);
        return 10L;
    }
}
