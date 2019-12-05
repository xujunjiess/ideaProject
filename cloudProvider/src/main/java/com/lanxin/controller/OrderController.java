package com.lanxin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/9/19.
 */
@RestController
public class OrderController {
    @RequestMapping(value = "/myorder")
    public String selectorder(){
        return "我的订单";
    }
}
