package com.young.design_pattern.create_mode.DP_5;

/**
 * @Author young
 * @Date 2021/1/14 13:44
 * @Desc
 **/
public class Singleton1 {
    private static Singleton1 instance = null;

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
