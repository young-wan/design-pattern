package com.young.design_pattern.create_mode.DP_5;

/**
 * @Author young
 * @Date 2021/1/14 13:45
 * @Desc
 **/
public class Singleton2 {
    private static Singleton2 instance = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
