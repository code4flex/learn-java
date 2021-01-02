package com.code4flex.design.module.sample;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author marvin
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class Application {

    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }
}
