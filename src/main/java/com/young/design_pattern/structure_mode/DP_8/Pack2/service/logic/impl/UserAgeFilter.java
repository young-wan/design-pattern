package com.young.design_pattern.structure_mode.DP_8.Pack2.service.logic.impl;

import java.util.Map;

/**
 * @Author young
 * @Date 2021/1/14 19:47
 * @Desc
 **/
public class UserAgeFilter extends BaseLogic {
    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("age");
    }
}
