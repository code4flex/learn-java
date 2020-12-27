package com.code4flex.learn.design.pattern.test;

import com.code4flex.learn.design.pattern.controller.QuestionBankController;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_QuestionBank() throws CloneNotSupportedException {
        QuestionBankController questionBankController = new QuestionBankController();
        System.out.println(questionBankController.createPaper("lise", "1000008888888"));
        System.out.println(questionBankController.createPaper("lisa", "1000007777777"));
        System.out.println(questionBankController.createPaper("陈星", "1000009999999"));
    }

}
