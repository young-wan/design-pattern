package com.young.design_pattern.structure_mode.DP_8.Pack1;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author young
 * @Date 2021/1/14 18:11
 * @Desc
 **/
@Slf4j
public class EngineController {
    public String process(final String userId, final String userSex, final
    int userAge) {
        log.info("ifelse实现⽅式判断⽤户结果。userId：{} userSex：{} userAge：{}", userId, userSex, userAge);
        if ("man".equals(userSex)) {
            if (userAge < 25) {
                return "果实A";
            }
            if (userAge >= 25) {
                return "果实B";
            }
        }
        if ("woman".equals(userSex)) {
            if (userAge < 25) {
                return "果实C";
            }
            if (userAge >= 25) {
                return "果实D";
            }
        }
        return null;
    }
}
