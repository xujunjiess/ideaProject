package com.lanxin.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2019/9/19.
 */
@RestController
public class CustomerController {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping(value="/user")
    @HystrixCommand(fallbackMethod = "myorderFallback")
    public String myorder(){
        return restTemplate.getForObject("http://cloudProvider/myorder",String.class);
    }

    public String myorderFallback(){
        return "宕机了。。。";
    }
}
