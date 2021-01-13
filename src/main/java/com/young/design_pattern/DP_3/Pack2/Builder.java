package com.young.design_pattern.DP_3.Pack2;

import com.young.design_pattern.DP_3.Celling.LevelOneCeiling;
import com.young.design_pattern.DP_3.Celling.LevelTwoCeiling;
import com.young.design_pattern.DP_3.Coat.DuluxCoat;
import com.young.design_pattern.DP_3.Coat.LiBangCoat;
import com.young.design_pattern.DP_3.Floor.ShengXiangFloor;
import com.young.design_pattern.DP_3.Tile.DongPengTile;
import com.young.design_pattern.DP_3.Tile.MarcoPoloTile;

/**
 * @Author young
 * @Date 2021/1/13 17:11
 * @Desc
 **/
public class Builder {
    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                .appendCeiling(new LevelTwoCeiling()) // 吊顶，⼆级顶
                .appendCoat(new DuluxCoat()) // 涂料，多乐⼠
                .appendFloor(new ShengXiangFloor()); // 地板，圣象
    }

    public IMenu levelTwo(Double area) {
        return new DecorationPackageMenu(area, "轻奢⽥园")
                .appendCeiling(new LevelTwoCeiling()) // 吊顶，⼆级顶
                .appendCoat(new LiBangCoat()) // 涂料，⽴邦
                .appendTile(new MarcoPoloTile()); // 地砖，⻢可波罗
    }

    public IMenu levelThree(Double area) {
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling()) // 吊顶，⼆级顶
                .appendCoat(new LiBangCoat()) // 涂料，⽴邦
                .appendTile(new DongPengTile()); // 地砖，东鹏
    }
}
