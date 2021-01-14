package com.young.design_pattern.create_mode.DP_2.Pack1;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author young
 * @Date 2021/1/13 14:10
 * @Desc
 **/
@Slf4j
public class EGM {
    private Map<String, String> dataMap = new ConcurrentHashMap<>();

    public String gain(String key) {
        log.info("EGM gain by key: {}", key);
        return dataMap.get(key);
    }

    public void set(String key, String value) {
        log.info("EGM set key: {}, value: {}", key, value);
        dataMap.put(key, value);
    }

    public void delete(String key) {
        log.info("EGM delete by key: {}", key);
        dataMap.remove(key);
    }
}
