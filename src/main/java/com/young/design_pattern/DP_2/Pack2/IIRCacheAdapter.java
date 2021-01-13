package com.young.design_pattern.DP_2.Pack2;

import com.young.design_pattern.DP_2.Pack1.IIR;

/**
 * @Author young
 * @Date 2021/1/13 14:49
 * @Desc
 **/
public class IIRCacheAdapter implements ICacheAdapter {
    private IIR iir = new IIR();

    @Override
    public String get(String key) {
        return iir.get(key);
    }

    @Override
    public void set(String key, String value) {
        iir.setCache(key, value);
    }

    @Override
    public void del(String key) {
        iir.delete(key);
    }
}
