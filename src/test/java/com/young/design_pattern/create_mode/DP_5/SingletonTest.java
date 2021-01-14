package com.young.design_pattern.create_mode.DP_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author young
 * @Date 2021/1/14 13:47
 * @Desc
 **/
class SingletonTest {

    @Test
    public void test_s1() {
        Singleton1 s1 = Singleton1.getInstance();
        Singleton4 s4 = Singleton4.INSTANCE;
        System.out.println(s4.getClass());

    }
}
