package com.lanxin.controller;

import com.lanxin.Feign.FeignInterface;
import com.lanxin.bean.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2019/9/20.
 */
@RestController
public class TestController {
    @Autowired
    private FeignInterface feignInterface;
    @RequestMapping(value = "/findall")
    public List<Emp> findall(){
       return feignInterface.findall();
    }
}
