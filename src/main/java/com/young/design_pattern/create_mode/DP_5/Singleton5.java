package com.young.design_pattern.create_mode.DP_5;

/**
 * @Author young
 * @Date 2021/1/14 13:58
 * @Desc
 **/
public class Singleton5 {
    private static Singleton5 instance;

    private Singleton5() {

    }

    private static Singleton5 getInstance() {
        if (null == instance) {
            synchronized (Singleton5.class) {
                if (null == instance) {
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}
