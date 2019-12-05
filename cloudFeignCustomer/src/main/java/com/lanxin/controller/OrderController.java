package com.lanxin.controller;

import com.lanxin.feignInterface.FeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/9/19.
 */
@RestController
public class OrderController {
    @Autowired
    private FeignClient feignClient;
    @RequestMapping(value = "/user")
    public String listmyorder(){
        return feignClient.myorder();
    }
}
