package com.wing.proxy.dynamicproxy.jdkproxy;


import com.wing.proxy.staticproxy.Person;

/**
 * Created by Tom on 2019/3/10.
 */
public class Girl implements Person {
    public int findLove() {
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("有6块腹肌");
        return 0;
    }
}
