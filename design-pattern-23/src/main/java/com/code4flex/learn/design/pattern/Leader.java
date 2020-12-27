package com.code4flex.learn.design.pattern;

import com.code4flex.learn.design.pattern.task.Employee;
import com.code4flex.learn.design.pattern.task.Sales;

import java.util.HashMap;
import java.util.Map;

public class Leader {

    private Map<String ,IExecute> execute = new HashMap<String ,IExecute>();

    public Leader(){
        execute.put("员工考勤",new Employee());
        execute.put("销售计划",new Sales());
    }

    public void dispatch(String command){
        execute.get(command).execute(command);
    }

}
