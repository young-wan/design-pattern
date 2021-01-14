package com.young.design_pattern.create_mode.DP_2;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author young
 * @Date 2021/1/13 14:09
 * @Desc
 **/
@Slf4j
public class RedisUtils {

    private Map<String, String> dataMap = new ConcurrentHashMap<>();

    public String get(String key) {
        log.info("get by key : {}", key);
        return dataMap.get(key);
    }

    public void set(String key, String value) {
        log.info("set key: {}, value: {}", key, value);
        dataMap.put(key, value);
    }

    public void del(String key) {
        log.info("del by key: {}", key);
        dataMap.remove(key);
    }
}
