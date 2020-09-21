package com.wenjieyue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableEurekaServer
@ComponentScan(basePackages = {"com.definesys.mpaas","com.wenjieyue"})
public class kuwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(kuwoApplication.class,args);
    }
 }
