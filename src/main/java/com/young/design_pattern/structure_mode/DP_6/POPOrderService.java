package com.young.design_pattern.structure_mode.DP_6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author young
 * @Date 2021/1/14 15:39
 * @Desc
 **/
public class POPOrderService {
    private Logger logger =
            LoggerFactory.getLogger(POPOrderService.class);

    public boolean isFirstOrder(String uId) {
        logger.info("POP商家，查询⽤户的订单是否为⾸单：{}", uId);
        return true;
    }
}
