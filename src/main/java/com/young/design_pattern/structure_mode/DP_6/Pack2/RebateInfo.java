package com.young.design_pattern.structure_mode.DP_6.Pack2;

import lombok.Data;

import java.util.Date;

/**
 * @Author young
 * @Date 2021/1/14 16:03
 * @Desc
 **/
@Data
public class RebateInfo {
    private String userId; // ⽤户ID
    private String bizId; // 业务ID
    private Date bizTime; // 业务时间
    private String desc; // 业务描述
}
