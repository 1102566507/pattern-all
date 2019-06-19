package com.wing.proxy.dynamicproxy.wingproxy;

import java.lang.reflect.Method;

public interface WingInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
