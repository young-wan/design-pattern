package com.young.design_pattern.structure_mode.DP_7.Pack1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @Author young
 * @Date 2021/1/14 17:33
 * @Desc
 **/
public class PayController {
    private Logger logger = LoggerFactory.getLogger(PayController.class);

    public boolean doPay(String uId, String tradeId, BigDecimal amount,
                         int channelType, int modeType) {
        // 微信⽀付
        if (1 == channelType) {
            logger.info("模拟微信渠道⽀付划账开始。uId：{} tradeId：{} amount： {}", uId, tradeId, amount);
            if (1 == modeType) {
                logger.info("密码⽀付，⻛控校验环境安全");
            } else if (2 == modeType) {
                logger.info("⼈脸⽀付，⻛控校验脸部识别");
            } else if (3 == modeType) {
                logger.info("指纹⽀付，⻛控校验指纹信息");
            }
        }
        // ⽀付宝⽀付
        else if (2 == channelType) {
            logger.info("模拟⽀付宝渠道⽀付划账开始。uId：{} tradeId：{} amount：{}", uId, tradeId, amount);
            if (1 == modeType) {
                logger.info("密码⽀付，⻛控校验环境安全");
            } else if (2 == modeType) {
                logger.info("⼈脸⽀付，⻛控校验脸部识别");
            } else if (3 == modeType) {
                logger.info("指纹⽀付，⻛控校验指纹信息");
            }
        }
        return true;
    }
}
