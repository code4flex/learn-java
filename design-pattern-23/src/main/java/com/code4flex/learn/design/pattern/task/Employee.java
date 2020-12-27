package com.code4flex.learn.design.pattern.task;

import com.code4flex.learn.design.pattern.IExecute;

public class Employee implements IExecute {

    @Override
    public void execute(String cmd) {
        System.out.println(String.format("Employee执行%s任务。",cmd));
    }
}
