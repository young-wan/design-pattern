package com.young.design_pattern.create_mode.DP_4.Pack2;

import com.young.design_pattern.create_mode.DP_4.AnswerQuestion;
import com.young.design_pattern.create_mode.DP_4.ChoiceQuestion;
import com.young.design_pattern.create_mode.DP_4.Pack2.util.Topic;
import com.young.design_pattern.create_mode.DP_4.Pack2.util.TopicRandomUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/**
 * @Author young
 * @Date 2021/1/14 10:49
 * @Desc
 **/
public class QuestionBank implements Cloneable{
    private String candidate; // 考⽣
    private String number; // 考号
    private ArrayList<ChoiceQuestion> choiceQuestionList = new
            ArrayList<ChoiceQuestion>();
    private ArrayList<AnswerQuestion> answerQuestionList = new
            ArrayList<AnswerQuestion>();

    public QuestionBank append(ChoiceQuestion choiceQuestion) {
        choiceQuestionList.add(choiceQuestion);
        return this;
    }

    public QuestionBank append(AnswerQuestion answerQuestion) {
        answerQuestionList.add(answerQuestion);
        return this;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        QuestionBank questionBank = (QuestionBank) super.clone();
        questionBank.choiceQuestionList = (ArrayList<ChoiceQuestion>)
                choiceQuestionList.clone();
        questionBank.answerQuestionList = (ArrayList<AnswerQuestion>)
                answerQuestionList.clone();
        // 题⽬乱序
        Collections.shuffle(questionBank.choiceQuestionList);
        Collections.shuffle(questionBank.answerQuestionList);
        // 答案乱序
        ArrayList<ChoiceQuestion> choiceQuestionList =
                questionBank.choiceQuestionList;
        for (ChoiceQuestion question : choiceQuestionList) {
            Topic random = TopicRandomUtil.random(question.getOption(),
                    question.getKey());
            question.setOption(random.getOption());
            question.setKey(random.getKey());
        }
        return questionBank;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        StringBuilder detail = new StringBuilder("考⽣：" + candidate +
                "\r\n" +
                "考号：" + number + "\r\n" +
                "--------------------------------------------\r\n" +
                "⼀、选择题" + "\r\n\n");
        for (int idx = 0; idx < choiceQuestionList.size(); idx++) {
            detail.append("第").append(idx + 1).append("题：").append(choiceQuestionList.get(idx).getName()).append("\r\n");
            Map<String, String> option =
                    choiceQuestionList.get(idx).getOption();
            for (String key : option.keySet()) {

                detail.append(key).append("：").append(option.get(key)).append("\r\n");
                ;
            }
            detail.append("答 案：").append(choiceQuestionList.get(idx).getKey()).append("\r\n\n");
        }
        detail.append("⼆、问答题" + "\r\n\n");
        for (int idx = 0; idx < answerQuestionList.size(); idx++) {
            detail.append("第").append(idx + 1).append("题：").append(answerQuestionList.get(idx).getName()).append("\r\n");
            detail.append("答 案：").append(answerQuestionList.get(idx).getKey()).append("\r\n\n");
        }
        return detail.toString();
    }
}
