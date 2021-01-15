package com.young.design_pattern.structure_mode.DP_7.Pack2;

import java.math.BigDecimal;

/**
 * @Author young
 * @Date 2021/1/14 17:44
 * @Desc
 **/
public abstract class Pay {
    protected IPayMode iPayMode;

    public Pay(IPayMode iPayMode) {
        this.iPayMode = iPayMode;
    }

    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
