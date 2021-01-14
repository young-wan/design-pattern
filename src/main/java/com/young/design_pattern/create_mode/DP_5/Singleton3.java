package com.young.design_pattern.create_mode.DP_5;

/**
 * @Author young
 * @Date 2021/1/14 13:46
 * @Desc
 **/
public class Singleton3 {

    private Singleton3() {

    }

    private static class Singleton3_Holder {
        private static Singleton3 instance = new Singleton3();
    }

    private static Singleton3 getInstance() {
        return Singleton3_Holder.instance;
    }
}
