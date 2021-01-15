package com.young.design_pattern.structure_mode.DP_7.Pack2.mode;

import com.young.design_pattern.structure_mode.DP_7.Pack2.IPayMode;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author young
 * @Date 2021/1/14 17:43
 * @Desc
 **/
@Slf4j
public class PayFaceMode implements IPayMode {
    @Override
    public boolean security(String uId) {
        log.info("⼈脸⽀付，⻛控校验脸部识别");
        return true;
    }
}
