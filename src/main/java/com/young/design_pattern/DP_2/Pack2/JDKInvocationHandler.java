package com.young.design_pattern.DP_2.Pack2;

import sun.misc.ClassLoaderUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author young
 * @Date 2021/1/13 14:55
 * @Desc
 **/
public class JDKInvocationHandler implements InvocationHandler {
    private ICacheAdapter iCacheAdapter;

    public JDKInvocationHandler(ICacheAdapter iCacheAdapter) {
        this.iCacheAdapter = iCacheAdapter;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return ICacheAdapter.class.getMethod(method.getName(), null);
    }
}
