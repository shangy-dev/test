package com.shangy.springbootdubboapi;

import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfig
public class SpringbootDubboApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDubboApiApplication.class, args);
    }

}
