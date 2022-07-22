package com.lovecoding.day12;

public class Example03 {

    public static void main(String[] args) {

        Thread t1 = new MyThread();
        t1.setName("MyThread");
        t1.start();//让线程处于就绪状态。可以进行CPU资源抢占了。

        /*MyRunnable mr = new MyRunnable();
        Thread t2 = new Thread(mr);
        t2.setName("MyRunnable");
        t2.start();*/

        System.out.println("---------------------");
        //join(0) : 立即加入，另一个线程加入一个线程中去执行了，它会阻断该线程执行的。直到另一个线程结束执行。


        for(int i = 0 ; i < 50 ; i++){

            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-" + i);

            if(i == 20){
                try {
                    t1.join(0);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {//另一个任务

        for(int i = 0 ; i < 100 ; i++){
            try {
                Thread.sleep(400);//睡眠一下，毫秒值决定睡眠时间,若时间为负责报java.lang.IllegalArgumentException
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //Thread.currentThread(): 可以获取到当前线程
            System.out.println(Thread.currentThread().getName() + "-" + i);
        }
    }
}

class MyThread extends Thread {

    @Override
    public void run() {

        for(int i = 0 ; i < 50 ; i ++){
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}