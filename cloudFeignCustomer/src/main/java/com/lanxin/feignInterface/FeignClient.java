package com.lanxin.feignInterface;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2019/9/19.
 */
@Component
@org.springframework.cloud.netflix.feign.FeignClient(value = "cloudProvider",fallback = FeignFallback.class)
public interface FeignClient {
    @RequestMapping(value = "/myorder")
    String myorder();
}
