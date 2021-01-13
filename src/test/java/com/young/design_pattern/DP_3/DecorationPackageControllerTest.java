package com.young.design_pattern.DP_3;

import com.young.design_pattern.DP_3.Pack1.DecorationPackageController;
import com.young.design_pattern.DP_3.Pack2.Builder;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author young
 * @Date 2021/1/13 17:09
 * @Desc
 **/
class DecorationPackageControllerTest {

    @Test
    public void test_DecorationPackageController(){
        DecorationPackageController decoration = new
                DecorationPackageController();
        // 豪华欧式
        System.out.println(decoration.getMatterList(new
                BigDecimal("132.52"),1));
        // 轻奢⽥园
        System.out.println(decoration.getMatterList(new
                BigDecimal("98.25"),2));
        // 现代简约
        System.out.println(decoration.getMatterList(new
                BigDecimal("85.43"),3));
    }

    @Test
    public void test_builder() {
        Builder builder = new Builder();
        System.out.println(builder.levelOne(119.24).getDetail());
        System.out.println(builder.levelTwo(119.24).getDetail());
        System.out.println(builder.levelThree(119.24).getDetail());
    }
}
