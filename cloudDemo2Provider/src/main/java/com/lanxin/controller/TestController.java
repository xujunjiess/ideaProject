package com.lanxin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanxin.bean.Emp;
import com.lanxin.bean.EmpExample;
import com.lanxin.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Administrator on 2019/8/16.
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    private EmpService empService;
    @RequestMapping(value = "/findall")
    public ModelAndView selectall(){
        ModelAndView mv=new ModelAndView();
        EmpExample empExample=new EmpExample();
        PageHelper.startPage(1, 2);
        List<Emp> emps=empService.selectByExample(empExample);
        PageInfo<Emp> page=new PageInfo<>(emps);
        mv.addObject("emps",page.getList());
        mv.setViewName("listemp");
        return mv;
    }
}
