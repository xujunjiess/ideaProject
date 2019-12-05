package com.lanxin.until;


import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by Administrator on 2019/8/17.
 */
@Configuration
@EnableScheduling
public class SchedulingConfig {
   // @Scheduled(fixedDelay = 3000)
    //秒 分 时 日期 月份 星期 年份可为空 ?表示日期和星期只能写一个另一个用？互斥
    @Scheduled(cron="0 51 10 * * ?")
    public void scheduler(){
        System.out.println("滴滴滴滴");
    }
}
