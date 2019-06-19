package com.wing.proxy.simpleproxy;

/**
 * Created by wing.
 */
public class RealSubject implements Subject{
//    @Override
    public void request() {
        System.out.println("real service is called.");
    }
}
