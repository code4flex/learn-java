package com.code4flex.learn.design.pattern.test;

import com.code4flex.learn.design.pattern.Leader;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_Execute(){

        new Leader().dispatch("员工考勤");
        new Leader().dispatch("销售计划");
    }
}
