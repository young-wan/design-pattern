package com.young.design_pattern.structure_mode.DP_8.Pack2.service.engine;

import com.young.design_pattern.structure_mode.DP_8.Pack2.service.logic.LogicFilter;
import com.young.design_pattern.structure_mode.DP_8.Pack2.service.logic.impl.UserAgeFilter;
import com.young.design_pattern.structure_mode.DP_8.Pack2.service.logic.impl.UserGenderFilter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author young
 * @Date 2021/1/14 19:28
 * @Desc
 **/
public class EngineConfig {
    static Map<String, LogicFilter> logicFilterMap;
    static {
        logicFilterMap = new ConcurrentHashMap<>();
        logicFilterMap.put("userAge", new UserAgeFilter());
        logicFilterMap.put("userGender", new UserGenderFilter());
    }
    public Map<String, LogicFilter> getLogicFilterMap() {
        return logicFilterMap;
    }
    public void setLogicFilterMap(Map<String, LogicFilter> logicFilterMap) {
        this.logicFilterMap = logicFilterMap;
    }
}
