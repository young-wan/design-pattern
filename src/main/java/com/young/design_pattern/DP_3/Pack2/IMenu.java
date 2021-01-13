package com.young.design_pattern.DP_3.Pack2;

import com.young.design_pattern.DP_3.Matter;

/**
 * @Author young
 * @Date 2021/1/13 17:11
 * @Desc
 **/
public interface IMenu {
    IMenu appendCeiling(Matter matter); // 吊顶

    IMenu appendCoat(Matter matter); // 涂料

    IMenu appendFloor(Matter matter); // 地板

    IMenu appendTile(Matter matter); // 地砖

    String getDetail(); // 明细
}
