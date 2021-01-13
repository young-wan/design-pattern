package com.young.design_pattern.DP_2.Pack2;

import com.young.design_pattern.DP_2.Pack1.EGM;

/**
 * @Author young
 * @Date 2021/1/13 14:49
 * @Desc
 **/
public class EGMCacheAdapter implements ICacheAdapter {
    private EGM egm = new EGM();

    @Override
    public String get(String key) {
        return egm.gain(key);
    }

    @Override
    public void set(String key, String value) {
        egm.set(key, value);
    }

    @Override
    public void del(String key) {
        egm.delete(key);
    }
}
