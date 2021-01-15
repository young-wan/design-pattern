package com.young.design_pattern.structure_mode.DP_8.Pack2.model.vo;

import lombok.Data;

/**
 * @Author young
 * @Date 2021/1/14 19:28
 * @Desc
 **/
@Data
public class TreeNodeLink {
 private Long nodeIdFrom;

 private Long nodeIdTo;
 private Integer ruleLimitType;
 private String ruleLimitValue;
}
