package com.springclouddemo.stock;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.Time;
import java.util.concurrent.TimeUnit;


@SpringBootApplication
public class Application
{
    public static void main( String[] args ) throws InterruptedException {
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        while (true){
            String username = run.getEnvironment().getProperty("user.name");
            String userage = run.getEnvironment().getProperty("user.age");
            String usercfg = run.getEnvironment().getProperty("user.cfg");
            System.out.println("name:" + username+"; age:"+ userage+"; cfg:"+ usercfg);
            TimeUnit.SECONDS.sleep(1);
        }

    }
}
