package com.wing.strategy.pay.payport;


/**
 * Created by wing.
 */
public class AliPay extends Payment {

    public String getName() {
        return "支付宝";
    }

    protected double queryBalance(String uid) {
        return 900;
    }

}
