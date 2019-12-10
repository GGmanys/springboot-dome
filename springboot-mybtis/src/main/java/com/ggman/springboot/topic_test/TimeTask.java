package com.ggman.springboot.topic_test;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 多线程实现定时任务
 */
public class TimeTask {
    // 第一种方法：设定指定任务task在指定时间time执行 schedule(TimerTask task, Date time)
    public void test1(){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("-------延时5秒钟后执行的任务--------");
            }
        },5000);
    }
    //第二种就是在第一种后面5000 后面多一个参数 为多久执行一次

    // 第三种方法：设定指定任务task在五秒后执行，每隔2秒执行一次
    // scheduleAtFixedRate(TimerTask task, long delay, long period)
    public static void test3() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                System.out.println("-------五秒后执行的任务，每隔两秒执行一次--------");
            }
        }, 5000, 2000);
    }


    // 第四种方法：安排指定的任务task在指定的时间firstTime开始进行重复的固定速率period执行．
    // Timer.scheduleAtFixedRate(TimerTask task,Date firstTime,long period)
    public static void test4() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 18); // 控制时
        calendar.set(Calendar.MINUTE, 0);       // 控制分
        calendar.set(Calendar.SECOND, 0);       // 控制秒
        Date time = calendar.getTime();         // 得出执行任务的时间,此处为今天的18：00：00
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                System.out.println("-------这是每天18点执行的任务--------");
            }
        }, time, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行
    }

}
