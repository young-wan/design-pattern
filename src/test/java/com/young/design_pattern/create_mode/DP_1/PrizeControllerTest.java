package com.young.design_pattern.create_mode.DP_1;

import com.young.design_pattern.create_mode.DP_1.Pack2.ICommodity;
import com.young.design_pattern.create_mode.DP_1.Pack2.StoreFactory;
import org.junit.jupiter.api.Test;

/**
 * @Author young
 * @Date 2021/1/13 13:44
 * @Desc
 **/
class PrizeControllerTest {

    @Test
    void awardToUser() {
//        PrizeController prizeController = new PrizeController();
//        System.out.println("\r\n模拟发放优惠券测试\r\n");
//        // 模拟发放优惠券测试
//        AwardReq req01 = new AwardReq();
//        req01.setuId("10001");
//        req01.setAwardType(1);
//        req01.setAwardNumber("EGM1023938910232121323432");
//        req01.setBizId("791098764902132");
//        AwardRes awardRes01 = prizeController.awardToUser(req01);
//        log.info("请求参数：{}", JSON.toJSON(req01));
//        log.info("测试结果：{}", JSON.toJSON(awardRes01));
//        System.out.println("\r\n模拟⽅法实物商品\r\n");
//        // 模拟⽅法实物商品
//        AwardReq req02 = new AwardReq();
//        req02.setuId("10001");
//        req02.setAwardType(2);
//        req02.setAwardNumber("9820198721311");
//        req02.setBizId("1023000020112221113");
//        Map<String, String> extMap = new HashMap<String, String>();
//        extMap.put("consigneeUserName", "谢⻜机");
//        extMap.put("consigneeUserPhone", "15200292123");
//        extMap.put("consigneeUserAddress", "吉林省.⻓春市.双阳区.XX街道.檀溪苑⼩区.#18-2109");
//        req02.setExtMap(extMap);
//
//        commodityService_2.sendCommodity("10001", "9820198721311", "102300002011222
//                1113", extMap);
//                AwardRes awardRes02 = prizeController.awardToUser(req02);
//        log.info("请求参数：{}", JSON.toJSON(req02));
//        log.info("测试结果：{}", JSON.toJSON(awardRes02));
//        System.out.println("\r\n第三⽅兑换卡(爱奇艺)\r\n");
//        AwardReq req03 = new AwardReq();
//        req03.setuId("10001");
//        req03.setAwardType(3);
//        req03.setAwardNumber("AQY1xjkUodl8LO975GdfrYUio");
//        AwardRes awardRes03 = prizeController.awardToUser(req03);
//        log.info("请求参数：{}", JSON.toJSON(req03));
//        log.info("测试结果：{}", JSON.toJSON(awardRes03));
    }

    @Test
    public void test_factory() throws Exception {
        StoreFactory storeFactory = new StoreFactory();

        ICommodity iCommodity1 = storeFactory.getCommodityService(1);
        iCommodity1.sendCommodity();

        ICommodity iCommodity2 = storeFactory.getCommodityService(2);
        iCommodity2.sendCommodity();

        ICommodity iCommodity3 = storeFactory.getCommodityService(3);
        iCommodity3.sendCommodity();

//        ICommodity iCommodity = storeFactory.getCommodityService(4);
//        iCommodity.sendCommodity();
    }
}
