package com.young.design_pattern.structure_mode.DP_8.Pack2.service.logic.impl;

import com.young.design_pattern.structure_mode.DP_8.Pack2.model.vo.TreeNodeLink;
import com.young.design_pattern.structure_mode.DP_8.Pack2.service.logic.LogicFilter;

import java.util.List;
import java.util.Map;

/**
 * @Author young
 * @Date 2021/1/14 19:44
 * @Desc
 **/
public abstract class BaseLogic implements LogicFilter{
    @Override
    public Long filter(String matterValue, List<TreeNodeLink>
            treeNodeLinkList) {
        for (TreeNodeLink nodeLine : treeNodeLinkList) {
            if (decisionLogic(matterValue, nodeLine)) return
                    nodeLine.getNodeIdTo();
        }
        return 0L;
    }
    @Override
    public abstract String matterValue(Long treeId, String userId,
                                       Map<String, String> decisionMatter);
    private boolean decisionLogic(String matterValue, TreeNodeLink
            nodeLink) {
        switch (nodeLink.getRuleLimitType()) {
            case 1:
                return matterValue.equals(nodeLink.getRuleLimitValue());
            case 2:
                return Double.parseDouble(matterValue) >
                        Double.parseDouble(nodeLink.getRuleLimitValue());
            case 3:
                return Double.parseDouble(matterValue) <
                        Double.parseDouble(nodeLink.getRuleLimitValue());
            case 4:
                return Double.parseDouble(matterValue) <=
                        Double.parseDouble(nodeLink.getRuleLimitValue());
            case 5:
                return Double.parseDouble(matterValue) >=
                        Double.parseDouble(nodeLink.getRuleLimitValue());
            default:
                return false;
        }
    }
}
