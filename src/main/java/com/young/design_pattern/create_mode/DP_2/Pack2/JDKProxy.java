package com.young.design_pattern.create_mode.DP_2.Pack2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author young
 * @Date 2021/1/13 14:55
 * @Desc
 **/
public class JDKProxy {
    public static <T> T getProxy(Class<T> interfaceClass, ICacheAdapter
            cacheAdapter) throws Exception {
        InvocationHandler handler = new JDKInvocationHandler(cacheAdapter);
        ClassLoader classLoader =
                Thread.currentThread().getContextClassLoader();
        Class<?>[] classes = interfaceClass.getInterfaces();
        return (T) Proxy.newProxyInstance(classLoader, new Class[]{classes[0]},
                handler);
    }
}
