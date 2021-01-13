package com.young.design_pattern.DP_3.Coat;

import com.young.design_pattern.DP_3.Matter;

import java.math.BigDecimal;

/**
 * @Author young
 * @Date 2021/1/13 16:59
 * @Desc
 **/
public class DuluxCoat implements Matter {
    public String scene() {
        return "涂料";
    }

    public String brand() {
        return "多乐⼠(Dulux)";
    }

    public String model() {
        return "第⼆代";
    }

    public BigDecimal price() {
        return new BigDecimal(719);
    }

    public String desc() {
        return "多乐⼠是阿克苏诺⻉尔旗下的著名建筑装饰油漆品牌，产品畅销于全球100个国家，每年全球有5000万户家庭使⽤多乐⼠油漆。";
    }
}
