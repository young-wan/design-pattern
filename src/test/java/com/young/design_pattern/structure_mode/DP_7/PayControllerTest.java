package com.young.design_pattern.structure_mode.DP_7;

import com.young.design_pattern.structure_mode.DP_7.Pack1.PayController;
import com.young.design_pattern.structure_mode.DP_7.Pack2.Pay;
import com.young.design_pattern.structure_mode.DP_7.Pack2.mode.PayFaceMode;
import com.young.design_pattern.structure_mode.DP_7.Pack2.mode.PayFingerMode;
import com.young.design_pattern.structure_mode.DP_7.Pack2.pay.AliPay;
import com.young.design_pattern.structure_mode.DP_7.Pack2.pay.WxPay;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/**
 * @Author young
 * @Date 2021/1/14 17:33
 * @Desc
 **/
class PayControllerTest {

    @Test
    void doPay() {
        PayController pay = new PayController();
        System.out.println("\r\n模拟测试场景；微信⽀付、⼈脸⽅式。");
        pay.doPay("weixin_1092033111", "100000109893", new BigDecimal(100), 1, 2);

        System.out.println("\r\n模拟测试场景；⽀付宝⽀付、指纹⽅式。");
        pay.doPay("jlu19dlxo111", "100000109894", new BigDecimal(100), 2, 3);
    }

    @Test
    public void test_pay() {
        System.out.println("\r\n模拟测试场景；微信⽀付、⼈脸⽅式。");
        Pay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("weixin_1092033111", "100000109893", new
                BigDecimal(100));
        System.out.println("\r\n模拟测试场景；⽀付宝⽀付、指纹⽅式。");
        Pay zfbPay = new AliPay(new PayFingerMode());
        zfbPay.transfer("jlu19dlxo111", "100000109894", new BigDecimal(100));
    }
}
