package com.tiany.jwsdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.tiany.jwsdemo.dao")
@EnableScheduling
@Configuration
public class JwsdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwsdemoApplication.class, args);
    }

}
