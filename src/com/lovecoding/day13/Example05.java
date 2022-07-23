package com.lovecoding.day13;

public class Example05 {

    public static void main(String[] args) {
        SingleTon st = SingleTon.getSingleTon();

        SingleTon st1 = SingleTon.getSingleTon();

        System.out.println(st == st1);
    }
}


/**
 * 懒汉式
 */
class SingleTon {

    private SingleTon(){
        if(singleTon != null)
            throw new NullPointerException("该类为单例模式，禁止多次实例化操作");
    }

    //singleTon : volatile的作用就是让这个属性 被读取与使用时，每次从地址中获取。不从缓存中获取。
    volatile private static SingleTon singleTon = null;

    public static SingleTon getSingleTon() {

        synchronized (SingleTon.class){//同步代码块方式解决多线程下破坏单例模式
            if(singleTon == null)
                singleTon = new SingleTon();
        }


        return singleTon;
    }
}