package com.lovecoding.day12;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 多个线程共享某个数据（同时操作某个数据）ticket ，可能造成数据紊乱
 */
public class Example06 {

    public static void main(String[] args) {
        MyRunnable3 mr3 = new MyRunnable3();
        Thread t1 = new Thread(mr3);

        t1.start();

        Thread t2 = new Thread(mr3);

        t2.start();
    }
}

/**
 * 售票的窗口 - 售票ticket
 */
class MyRunnable3 implements Runnable {

    int ticket = 15;
    Object obj = new Object();//让所有线程操作同一个对象（锁）
    @Override
    public void run() {

        for(int i = 0 ; i < 50 ; i ++){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //同步对象 - 同步代码块
            /*synchronized (obj) {
                if (ticket <= 0)
                    break;
                ticket--;
                System.out.println("剩余的票数为: " + ticket);
            }*/
            //method();
            method1();
        }
    }
    //同步方法
    public synchronized void method(){
        if(ticket > 0 ){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            ticket--;
            System.out.println("剩余的票数为: " + ticket);
        }

    }

    //ReentrantLock : lock对象锁
    ReentrantLock lock = new ReentrantLock();
    public void method1(){

        lock.lock();
        if(ticket > 0 ){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            ticket--;
            System.out.println("剩余的票数为: " + ticket);
        }
        //System.out.println(lock.getHoldCount());
        System.out.println("--------释放锁--------");
        lock.unlock();
    }
}
