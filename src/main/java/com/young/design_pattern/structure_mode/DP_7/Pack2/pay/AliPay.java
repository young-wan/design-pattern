package com.young.design_pattern.structure_mode.DP_7.Pack2.pay;

import com.young.design_pattern.structure_mode.DP_7.Pack2.IPayMode;
import com.young.design_pattern.structure_mode.DP_7.Pack2.Pay;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @Author young
 * @Date 2021/1/14 17:46
 * @Desc
 **/
@Slf4j
public class AliPay extends Pay {
    public AliPay(IPayMode iPayMode) {
        super(iPayMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        log.info("模拟⽀付宝渠道⽀付划账开始。uId：{} tradeId：{} amount： {}", uId, tradeId, amount);
        boolean security = iPayMode.security(uId);
        log.info("模拟⽀付宝渠道⽀付⻛控校验。uId：{} tradeId：{} security： {}", uId, tradeId, security);
        if (!security) {
            log.info("模拟⽀付宝渠道⽀付划账拦截。uId：{} tradeId：{} amount：{}", uId, tradeId, amount);
            return "0001";
        }
        log.info("模拟⽀付宝渠道⽀付划账成功。uId：{} tradeId：{} amount： {}", uId, tradeId, amount);
        return "0000";
    }
}
