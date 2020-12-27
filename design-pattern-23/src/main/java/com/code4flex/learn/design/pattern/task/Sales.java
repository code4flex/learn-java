package com.code4flex.learn.design.pattern.task;

import com.code4flex.learn.design.pattern.IExecute;

public class Sales implements IExecute {
    @Override
    public void execute(String cmd) {
        System.out.println(String.format("Sales执行%s任务。",cmd));
    }
}
