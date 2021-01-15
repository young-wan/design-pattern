package com.young.design_pattern.structure_mode.DP_6.Pack2;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.Map;

/**
 * @Author young
 * @Date 2021/1/14 16:03
 * @Desc
 **/
public class MQAdapter {
    public static RebateInfo filter(String strJson, Map<String, String> link) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        return filter(JSON.parseObject(strJson, Map.class), link);
    }

    public static RebateInfo filter(Map obj, Map<String, String> link) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        RebateInfo rebateInfo = new RebateInfo();
        for (String key : link.keySet()) {
            Object val = obj.get(link.get(key));
            Class invokeClass;
            if ("bizTime".equals(key)) {
                invokeClass = Date.class;
                val = new Date((Long) val);
            }else {
                invokeClass = String.class;
            }

            RebateInfo.class.getMethod("set" + key.substring(0, 1).toUpperCase() + key.substring(1), invokeClass)
                    .invoke(rebateInfo, val);
        }
        return rebateInfo;
    }
}
