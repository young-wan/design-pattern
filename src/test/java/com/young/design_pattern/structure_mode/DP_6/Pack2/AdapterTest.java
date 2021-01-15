package com.young.design_pattern.structure_mode.DP_6.Pack2;

import com.alibaba.fastjson.JSON;
import com.young.design_pattern.structure_mode.DP_6.OrderMq;
import com.young.design_pattern.structure_mode.DP_6.create_account;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.HashMap;

/**
 * @Author young
 * @Date 2021/1/14 16:05
 * @Desc
 **/
class AdapterTest {
    @Test
    public void test_MQAdapter() throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException {
        create_account create_account = new create_account();
        create_account.setNumber("100001");
        create_account.setAddress("河北省.廊坊市.⼴阳区.⼤学⾥职业技术学院");
        create_account.setAccountDate(new Date());
        create_account.setDesc("在校开户");
        HashMap<String, String> link01 = new HashMap<String, String>();
        link01.put("userId", "number");
        link01.put("bizId", "number");
        link01.put("bizTime", "accountDate");
        link01.put("desc", "desc");
        RebateInfo rebateInfo01 = MQAdapter.filter(JSON.toJSONString(create_account),
                link01);
        System.out.println("mq.create_account(适配前)" +
                create_account.toString());
        System.out.println("mq.create_account(适配后)" +
                JSON.toJSONString(rebateInfo01));
        System.out.println("");
        OrderMq orderMq = new OrderMq();
        orderMq.setUid("100001");
        orderMq.setSku("10928092093111123");
        orderMq.setOrderId("100000890193847111");
        orderMq.setCreateOrderTime(new Date());
        HashMap<String, String> link02 = new HashMap<String, String>();
        link02.put("userId", "uid");
        link02.put("bizId", "orderId");
        link02.put("bizTime", "createOrderTime");
        RebateInfo rebateInfo02 = MQAdapter.filter(JSON.toJSONString(orderMq),
                link02);
        System.out.println("mq.orderMq(适配前)" + orderMq.toString());
        System.out.println("mq.orderMq(适配后)" +
                JSON.toJSONString(rebateInfo02));
    }
}
