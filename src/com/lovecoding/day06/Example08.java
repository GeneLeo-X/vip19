package com.lovecoding.day06;

public class Example08 {

    public static void main(String[] args) {
        SingleTonEH s1 = SingleTonEH.getSingleTonEH();

        SingleTonEH s2 = SingleTonEH.getSingleTonEH();

        System.out.println(s1 == s2);//比较的是地址

        System.out.println("-------------------");

        SingleTonLH s3 = SingleTonLH.getSingleTonLH();

        SingleTonLH s4 = SingleTonLH.getSingleTonLH();

        System.out.println(s3 == s4);
    }
}

/**
 * 单例设计模式 - 饿汉式
 */
class SingleTonEH{

    //声明私有的类成员变量
    private static SingleTonEH singleTonEH = new SingleTonEH();

    //私有化构造器
    private SingleTonEH(){}

    //对外暴露访问接口
    public static SingleTonEH getSingleTonEH(){

        return singleTonEH;
    }

}

/**
 * 懒汉式 - 什么时候用再进行实例化操作
 */
class SingleTonLH{
    //声明私有的类成员变量
    private static SingleTonLH singleTonLH;
    //私有化构造器
    private SingleTonLH(){}

    public static SingleTonLH getSingleTonLH(){
        if(singleTonLH == null)
            singleTonLH = new SingleTonLH();

        return singleTonLH;
    }
}