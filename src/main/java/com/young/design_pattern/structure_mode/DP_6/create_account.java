package com.young.design_pattern.structure_mode.DP_6;

import lombok.Data;

import java.util.Date;

/**
 * @Author young
 * @Date 2021/1/14 15:16
 * @Desc
 **/
@Data
public class create_account {
    private String number; // 开户编号
    private String address; // 开户地
    private Date accountDate; // 开户时间
    private String desc; // 开户描述
}
