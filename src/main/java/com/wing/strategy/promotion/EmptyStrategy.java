package com.wing.strategy.promotion;
/**
 * 无优惠
 * Created by wing
 */
public class EmptyStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
