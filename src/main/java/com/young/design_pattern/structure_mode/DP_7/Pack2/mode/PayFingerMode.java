package com.young.design_pattern.structure_mode.DP_7.Pack2.mode;

import com.young.design_pattern.structure_mode.DP_7.Pack2.IPayMode;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author young
 * @Date 2021/1/14 17:44
 * @Desc
 **/
@Slf4j
public class PayFingerMode implements IPayMode {
    @Override
    public boolean security(String uId) {
        log.info("指纹⽀付，⻛控校验指纹信息");
        return true;
    }
}
