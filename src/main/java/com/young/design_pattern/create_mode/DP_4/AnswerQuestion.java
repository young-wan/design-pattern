package com.young.design_pattern.create_mode.DP_4;

import lombok.Data;

/**
 * @Author young
 * @Date 2021/1/14 10:10
 * @Desc
 **/
@Data
public class AnswerQuestion {
    private String name; // 问题
    private String key; // 答案
    public AnswerQuestion() {
    }
    public AnswerQuestion(String name, String key) {
        this.name = name;
        this.key = key;
    }
}
