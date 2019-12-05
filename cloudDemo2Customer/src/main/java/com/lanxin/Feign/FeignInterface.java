package com.lanxin.Feign;

import com.lanxin.bean.Emp;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2019/9/20.
 */
@Component
@FeignClient(value = "cloudDemo2Provider")
public interface FeignInterface {
    @RequestMapping(value = "/emp/findall")
    List<Emp> findall();
}
