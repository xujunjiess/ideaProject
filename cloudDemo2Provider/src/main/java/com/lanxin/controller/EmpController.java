package com.lanxin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanxin.bean.Emp;
import com.lanxin.bean.EmpExample;
import com.lanxin.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2019/8/16.
 */
@RestController
@RequestMapping(value = "/emp")
public class EmpController {
    @Autowired
    private EmpService empService;
    @RequestMapping(value = "/findone")
    public Emp findone(){
        return empService.selectByPrimaryKey(6);
    }

    @RequestMapping(value = "/findall")
    public List<Emp> findall(){
        EmpExample empExample=new EmpExample();
        EmpExample.Criteria criteria=empExample.createCriteria();
        criteria.andEnameLike("%张%");
        PageHelper.startPage(1,2);
        List<Emp> emps=empService.selectByExample(empExample);
        PageInfo<Emp> page=new PageInfo<>(emps);
        return page.getList();
    }
}
