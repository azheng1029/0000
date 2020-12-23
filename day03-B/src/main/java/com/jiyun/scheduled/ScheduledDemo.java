package com.jiyun.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduledDemo {
    @Scheduled(cron = "0/2 * * * * ?")
    public void cacle(){
        System.out.println("关闭了"+new Date());

    }
}
