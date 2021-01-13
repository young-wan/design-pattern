package com.young.design_pattern.DP_2.Pack1;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author young
 * @Date 2021/1/13 14:10
 * @Desc
 **/
@Slf4j
public class IIR {
    private Map<String, String> dataMap = new ConcurrentHashMap<>();

    public String get(String key) {
        log.info("IIR get by key: {}", key);
        return dataMap.get(key);
    }

    public void setCache(String key, String value) {
        log.info("IIR setCache key: {}, value: {}", key, value);
        dataMap.put(key, value);
    }

    public void delete(String key) {
        log.info("IIR delete by key: {}", key);
        dataMap.remove(key);
    }
}
