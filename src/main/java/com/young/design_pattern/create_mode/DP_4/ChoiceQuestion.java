package com.young.design_pattern.create_mode.DP_4;

import lombok.Data;

import java.util.Map;

/**
 * @Author young
 * @Date 2021/1/14 10:10
 * @Desc
 **/
@Data
public class ChoiceQuestion {
    private String name; // 题⽬
    private Map<String, String> option; // 选项；A、B、C、D
    private String key; // 答案；B
    public ChoiceQuestion() {
    }
    public ChoiceQuestion(String name, Map<String, String> option, String
            key) {
        this.name = name;
        this.option = option;
        this.key = key;
    }
}
