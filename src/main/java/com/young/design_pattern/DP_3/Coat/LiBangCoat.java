package com.young.design_pattern.DP_3.Coat;

import com.young.design_pattern.DP_3.Matter;

import java.math.BigDecimal;

/**
 * @Author young
 * @Date 2021/1/13 17:00
 * @Desc
 **/
public class LiBangCoat implements Matter {
    public String scene() {
        return "涂料";
    }

    public String brand() {
        return "⽴邦";
    }

    public String model() {
        return "默认级别";
    }

    public BigDecimal price() {
        return new BigDecimal(650);
    }

    public String desc() {
        return "⽴邦始终以开发绿⾊产品、注᯿⾼科技、⾼品质为⽬标，以技术⼒量不断推进科研和开发，满⾜消费者需求。";
    }
}
