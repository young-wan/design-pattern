package com.young.design_pattern.structure_mode.DP_8.Pack2.service.engine;

import com.young.design_pattern.structure_mode.DP_8.Pack2.model.aggregates.TreeRich;
import com.young.design_pattern.structure_mode.DP_8.Pack2.model.vo.EngineResult;

import java.util.Map;

/**
 * @Author young
 * @Date 2021/1/14 19:29
 * @Desc
 **/
public interface IEngine {
    EngineResult process(final Long treeId, final String userId, TreeRich
            treeRich, final Map<String, String> decisionMatter);
}
