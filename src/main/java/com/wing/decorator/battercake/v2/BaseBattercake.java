package com.wing.decorator.battercake.v2;

/**
 * Created by wing on 2019/3/17.
 */
public class BaseBattercake extends Battercake {
    protected String getMsg(){
        return "煎饼";
    }

    public int getPrice(){
        return 5;
    }
}
