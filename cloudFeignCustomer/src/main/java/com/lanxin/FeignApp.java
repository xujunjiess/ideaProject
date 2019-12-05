package com.lanxin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2019/9/19.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.lanxin")
@EnableEurekaClient
@EnableFeignClients
public class FeignApp {

    public static void main(String[] args) {
        SpringApplication.run(FeignApp.class,args);
    }
}
