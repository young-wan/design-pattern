package com.young.design_pattern.structure_mode.DP_8.Pack2.service.engine.impl;

import com.young.design_pattern.structure_mode.DP_8.Pack2.model.aggregates.TreeRich;
import com.young.design_pattern.structure_mode.DP_8.Pack2.model.vo.EngineResult;
import com.young.design_pattern.structure_mode.DP_8.Pack2.model.vo.TreeNode;
import com.young.design_pattern.structure_mode.DP_8.Pack2.service.engine.EngineBase;

import java.util.Map;

/**
 * @Author young
 * @Date 2021/1/14 19:29
 * @Desc
 **/
public class TreeEngineHandle extends EngineBase {
    @Override
    public EngineResult process(Long treeId, String userId, TreeRich
            treeRich, Map<String, String> decisionMatter) {
        // 决策流程
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId,
                decisionMatter);
        // 决策结果
        return new EngineResult(userId, treeId, treeNode.getTreeNodeId(),
                treeNode.getNodeValue());
    }
}
