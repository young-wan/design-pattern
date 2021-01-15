package com.young.design_pattern.structure_mode.DP_7.Pack2.mode;

import com.young.design_pattern.structure_mode.DP_7.Pack2.IPayMode;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author young
 * @Date 2021/1/14 17:42
 * @Desc
 **/
@Slf4j
public class PaySecretMode implements IPayMode {
    @Override
    public boolean security(String uId) {
        log.info("密码⽀付，⻛控校验环境安全");
        return true;
    }
}
