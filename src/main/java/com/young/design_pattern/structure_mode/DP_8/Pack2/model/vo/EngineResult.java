package com.young.design_pattern.structure_mode.DP_8.Pack2.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author young
 * @Date 2021/1/14 19:28
 * @Desc
 **/
@Data
@AllArgsConstructor
public class EngineResult {
       private String userId;
       private Long treeId;
       private Long treeNodeId;
       private String nodeValue;
}
