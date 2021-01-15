package com.young.design_pattern.structure_mode.DP_6;

import lombok.Data;

import java.util.Date;

/**
 * @Author young
 * @Date 2021/1/14 15:17
 * @Desc
 **/
@Data
public class OrderMq {
    private String uid; // ⽤户ID
    private String sku; // 商品
    private String orderId; // 订单ID
    private Date createOrderTime; // 下单时间
}
