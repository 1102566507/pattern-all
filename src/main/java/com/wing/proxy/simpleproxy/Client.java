package com.wing.proxy.simpleproxy;

/**
 * Created by wing.
 */
public class Client {

    public static void main(String[] args) {

        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();

    }

}
