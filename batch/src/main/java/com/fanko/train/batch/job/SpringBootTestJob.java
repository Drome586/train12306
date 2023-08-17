//package com.fanko.train.batch.job;
//
//import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
///*
//* 适合单体应用
//  不适合集群
//* 无法实时更改定时任务状态和策略
//*
// */
//@Component
//@EnableScheduling
//public class SpringBootTestJob {
//      从左到右，秒 分 时 ）月份中的日期 月份 星期中的月份
//    @Scheduled(cron = "0/5 * * * * ?")
//    private void test(){
//        // 增加分布式锁，解决集群问题
//        System.out.println("SpringBootTestJob Test");
//    }
//}
