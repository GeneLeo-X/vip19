package com.lovecoding.day13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Example02 {

    public static void main(String[] args) {

        ExecutorService es = Executors.newSingleThreadExecutor();//单线程池

        es =  Executors.newFixedThreadPool(5);//会创建5个线程的线程池 -- 推荐

        MyRunnable mr = new MyRunnable();
        es.execute(mr);//线程执行了

        es.execute(mr);

        es.shutdown();//线程归还到线程池

        ScheduledExecutorService ses = Executors.newScheduledThreadPool(3);

        //延迟线程池 - 等待3s之后执行 - 推荐使用
        ses.schedule(mr , 3000 , TimeUnit.MILLISECONDS);//时间单位自行定义



    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(int i = 0 ; i < 20 ; i++){
            System.out.println(Thread.currentThread().getName() + "-" + i);
        }
    }
}
