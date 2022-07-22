package com.lovecoding.day12;

/**
 * yield : 它希望自己去暂停自己让出资源，让别的线程去执行。（回到抢占队列中）
 */
public class Example05 {

    public static void main(String[] args) {
        MyRunnable02 mr2 = new MyRunnable02();

        Thread t1 = new Thread(mr2);
        System.out.println(t1.isAlive());//当线程没有进入就绪状态的话，是未激活的
        t1.setDaemon(true);//将用户线程改为守护线程

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        System.out.println(t1.isAlive());//处于就绪状态的线程才是激活的
        //System.out.println(t1.isDaemon());

        for(int i = 0 ; i < 20 ; i++){
            try {
                //Thread.yield();
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-" + i);
        }

        System.out.println(Thread.activeCount());//激活的线程数 - GC线程随之启动执行
    }


}


class MyRunnable02 implements Runnable {

    @Override
    public void run() {
        for(int i = 0 ; i<100 ; i ++){

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-" + i);
        }
    }
}