package com.young.design_pattern.structure_mode.DP_8.Pack2.service.logic;

import com.young.design_pattern.structure_mode.DP_8.Pack2.model.vo.TreeNodeLink;

import java.util.List;
import java.util.Map;

/**
 * @Author young
 * @Date 2021/1/14 19:44
 * @Desc
 **/
public interface LogicFilter {
    /**
     * 逻辑决策器
     *
     * @param matterValue 决策值
     * @param treeNodeLineInfoList 决策节点
     * @return 下⼀个节点Id
     */
    Long filter(String matterValue, List<TreeNodeLink>
            treeNodeLineInfoList);
    /**
     * 获取决策值
     *
     * @param decisionMatter 决策物料
     * @return 决策值
     */
    String matterValue(Long treeId, String userId, Map<String, String>
            decisionMatter);
}
