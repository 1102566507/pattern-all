package com.wing.proxy.dynamicproxy.wingproxy;

import com.wing.proxy.dynamicproxy.jdkproxy.Girl;
import com.wing.proxy.staticproxy.Person;

/**
 * Created by Tom on 2019/3/10.
 */
public class WingProxyTest {

    public static void main(String[] args) {
        try {

            //JDK动态代理的实现原理
            Person obj = (Person) new WingMeipo().getInstance(new Girl());
            System.out.println(obj.getClass());
            obj.findLove();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
