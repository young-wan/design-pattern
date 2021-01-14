package com.young.design_pattern.create_mode.DP_4.Pack2.util;

import java.util.*;

/**
 * @Author young
 * @Date 2021/1/14 10:48
 * @Desc
 **/
public class TopicRandomUtil {
    /**
     * 乱序Map元素，记录对应答案key
     *
     * @param option 题⽬
     * @param key    答案
     * @return Topic 乱序后 {A=c., B=d., C=a., D=b.}
     */
    static public Topic random(Map<String, String> option, String key) {
        Set<String> keySet = option.keySet();
        ArrayList<String> keyList = new ArrayList<String>(keySet);
        Collections.shuffle(keyList);
        HashMap<String, String> optionNew = new HashMap<String, String>();
        int idx = 0;
        String keyNew = "";
        for (String next : keySet) {
            String randomKey = keyList.get(idx++);
            if (key.equals(next)) {
                keyNew = randomKey;
            }
            optionNew.put(randomKey, option.get(next));
        }
        return new Topic(optionNew, keyNew);
    }
}
