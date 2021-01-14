package com.young.design_pattern.create_mode.DP_4;

import com.young.design_pattern.create_mode.DP_4.Pack1.QuestionBankController;
import org.junit.jupiter.api.Test;

/**
 * @Author young
 * @Date 2021/1/14 10:16
 * @Desc
 **/
class QuestionBankControllerTest {

    @Test
    void createPaper() {
        QuestionBankController questionBankController = new
                QuestionBankController();
        System.out.println(questionBankController.createPaper("花花",
                "1000001921032"));
        System.out.println(questionBankController.createPaper("⾖⾖",
                "1000001921051"));
        System.out.println(questionBankController.createPaper("⼤宝",
                "1000001921987"));
    }
}
