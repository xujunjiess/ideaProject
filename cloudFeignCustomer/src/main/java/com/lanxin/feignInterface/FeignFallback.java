package com.lanxin.feignInterface;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/9/20.
 */
@Component
public class FeignFallback implements FeignClient{

    @Override
    public String myorder() {
        return "正在抢修。。。";
    }
}
