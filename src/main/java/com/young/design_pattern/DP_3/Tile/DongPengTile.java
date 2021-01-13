package com.young.design_pattern.DP_3.Tile;

import com.young.design_pattern.DP_3.Matter;

import java.math.BigDecimal;

/**
 * @Author young
 * @Date 2021/1/13 17:02
 * @Desc
 **/
public class DongPengTile implements Matter {
    public String scene() {
        return "地砖";
    }

    public String brand() {
        return "东鹏瓷砖";
    }

    public String model() {
        return "10001";
    }

    public BigDecimal price() {
        return new BigDecimal(102);
    }

    public String desc() {
        return "东鹏瓷砖以品质铸就品牌，科技推动品牌，⼝碑传播品牌为宗旨，2014年品牌价值132.35亿元，位列建陶⾏业榜⾸。";
    }
}
