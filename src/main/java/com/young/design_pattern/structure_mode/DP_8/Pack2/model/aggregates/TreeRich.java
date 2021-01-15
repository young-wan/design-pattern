package com.young.design_pattern.structure_mode.DP_8.Pack2.model.aggregates;

import com.young.design_pattern.structure_mode.DP_8.Pack2.model.vo.TreeNode;
import com.young.design_pattern.structure_mode.DP_8.Pack2.model.vo.TreeRoot;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

/**
 * @Author young
 * @Date 2021/1/14 19:28
 * @Desc
 **/
@Data
@AllArgsConstructor
public class TreeRich {
    private TreeRoot treeRoot;
    private Map<Long, TreeNode> treeNodeMap;
}
