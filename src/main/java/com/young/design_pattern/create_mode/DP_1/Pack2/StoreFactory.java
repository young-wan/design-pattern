package com.young.design_pattern.create_mode.DP_1.Pack2;

/**
 * @Author young
 * @Date 2021/1/13 13:54
 * @Desc
 **/
public class StoreFactory {
    public ICommodity getCommodityService(Integer commodType) throws Exception {
        switch (commodType) {
            case 1:
                return new CouponCommodityService();
            case 2:
                return new GoodsCommodityService();
            case 3:
                return new CardCommodityService();
            default:
                throw new Exception("不存在的服务");
        }
    }
}
