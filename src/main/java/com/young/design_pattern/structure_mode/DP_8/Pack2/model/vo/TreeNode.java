package com.young.design_pattern.structure_mode.DP_8.Pack2.model.vo;

import lombok.Data;

import java.util.List;

/**
 * @Author young
 * @Date 2021/1/14 19:28
 * @Desc
 **/
@Data
public class TreeNode {
    private Long treeId;
    private Long treeNodeId;

    private Integer nodeType;

    private String nodeValue;

    private String ruleKey;

    private String ruleDesc;
    private List<TreeNodeLink> treeNodeLinkList;
}
