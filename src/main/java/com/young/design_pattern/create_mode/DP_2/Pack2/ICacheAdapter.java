package com.young.design_pattern.create_mode.DP_2.Pack2;

/**
 * @Author young
 * @Date 2021/1/13 14:48
 * @Desc
 **/
public interface ICacheAdapter {
    public String get(String key);

    public void set(String key, String value);

    public void del(String key);
}
