package com.young.design_pattern.create_mode.DP_1.Pack1;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author young
 * @Date 2021/1/13 13:37
 * @Desc
 **/
@Slf4j
public class PrizeController {
    public AwardRes awardToUser(AwardReq req) {
//        String reqJson = JSON.toJSONString(req);
//        AwardRes awardRes = null;
//        try {
//            log.info("奖品发放开始{}。req:{}", req.getuId(), reqJson);
//            // 按照不同类型⽅法商品[1优惠券、2实物商品、3第三⽅兑换卡(爱奇艺)]
//            if (req.getAwardType() == 1) {
//                CouponService couponService = new CouponService();
//                CouponResult couponResult =
//                        couponService.sendCoupon(req.getuId(), req.getAwardNumber(),
//                                req.getBizId());
//                if ("0000".equals(couponResult.getCode())) {
//                    awardRes = new AwardRes("0000", "发放成功");
//                } else {
//                    awardRes = new AwardRes("0001", couponResult.getInfo());
//                }
//            } else if (req.getAwardType() == 2) {
//                GoodsService goodsService = new GoodsService();
//                DeliverReq deliverReq = new DeliverReq();
//                deliverReq.setUserName(queryUserName(req.getuId()));
//
//                deliverReq.setUserPhone(queryUserPhoneNumber(req.getuId()));
//                deliverReq.setSku(req.getAwardNumber());
//                deliverReq.setOrderId(req.getBizId());
//
//                deliverReq.setConsigneeUserName(req.getExtMap().get("consigneeUserName"))
//                ;
//
//                deliverReq.setConsigneeUserPhone(req.getExtMap().get("consigneeUserPhone"
//                ));
//
//                deliverReq.setConsigneeUserAddress(req.getExtMap().get("consigneeUserAddr
//                        ess"));
//                        Boolean isSuccess = goodsService.deliverGoods(deliverReq);
//                if (isSuccess) {
//                    awardRes = new AwardRes("0000", "发放成功");
//                } else {
//                    awardRes = new AwardRes("0001", "发放失败");
//                }
//            } else if (req.getAwardType() == 3) {
//                String bindMobileNumber =
//                        queryUserPhoneNumber(req.getuId());
//                IQiYiCardService iQiYiCardService = new
//                        IQiYiCardService();
//                iQiYiCardService.grantToken(bindMobileNumber,
//                        req.getAwardNumber());
//                awardRes = new AwardRes("0000", "发放成功");
//            }
//            log.info("奖品发放完成{}。", req.getuId());
//        } catch (Exception e) {
//            log.error("奖品发放失败{}。req:{}", req.getuId(), reqJson, e);
//            awardRes = new AwardRes("0001", e.getMessage());
//        }
//        return awardRes;
        return null;
    }

    private String queryUserName(String uId) {
        return "花花";
    }

    private String queryUserPhoneNumber(String uId) {
        return "15200101232";
    }
}
