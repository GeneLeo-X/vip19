package com.lovecoding.day12;

public class Example04 {

    public static void main(String[] args) {

        MyRunnable1 mr1 = new MyRunnable1();

        Thread t1 = new Thread(mr1);

        t1.start();

        for(int i = 0 ; i < 50 ; i++){
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-" + i);

            if(i == 20)
                mr1.setFlag(true);
                //t1.interrupt();//中断mr1线程执行
        }
    }
}

/**
 * 借助于标志位来中断某个线程继续执行
 */
class MyRunnable1 implements  Runnable {

    private boolean flag;
    @Override
    public void run() {

        for(int i = 0 ; i < 50 ; i ++){

            /*if(Thread.currentThread().isInterrupted()){//处于中断状态了
                break;
            }*/
            if(flag) break;

            try {
                Thread.sleep(300);//抛出了java.lang.InterruptedException: sleep interrupted 当前线程的中断状态将被清除。

            } catch (InterruptedException e) {

                Thread.currentThread().interrupt();//让自己中断自身，sleep与join方法就不会再抛中断异常了，也不会清除中断标记了。
                //e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-" + i);
        }
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}