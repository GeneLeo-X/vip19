package com.lovecoding.day09;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

/**
 * java.version	Java 运行时环境版本
 * java.home	Java 安装目录
 * os.name	操作系统的名称
 * os.version	操作系统的版本
 * user.name	用户的账户名称
 * user.home	用户的主目录
 * user.dir	用户的当前工作目录
 */
public class Example08 {

    public static void main(String[] args) {

        System.err.println("这是一个错误打印日志");

        System.out.println("这是正常的打印日志");

        int[] arr = {11, 22, 33};
        int[] arr1 = new int[arr.length];
        System.arraycopy(arr, 0, arr1, 0, arr.length);//扩容方法

        System.out.println(Arrays.toString(arr1));//复制arr数组中的元素到arr1中（Arraycopy底层复制）


        System.out.println("---------------------");


        Date date = new Date(System.currentTimeMillis());

        System.out.println(date);

        long startTime = System.currentTimeMillis();
        method();
        long entTime = System.currentTimeMillis();

        System.out.println(entTime - startTime);//毫秒 ： 1000毫秒等于1s

        //System.exit(0);//正常退出

        System.out.println("-------------调用退出之后执行的代码------------");


        System.out.println(System.getProperty("java.version"));

        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.home"));

        System.out.println(System.getProperty("user.dir"));


        System.out.println("-------------------------");

        Runtime rt = Runtime.getRuntime();
        System.out.println("处理器数量：" + rt.availableProcessors() + " 个");

        System.out.println("Jvm总内存数 ：" + rt.totalMemory() / 1024 / 1024 + " MB");
        System.out.println("Jvm空闲内存数： " + (rt.freeMemory() / 1024) / 1024 + " MB");
        System.out.println("Jvm可用最大内存数： " + rt.maxMemory() / 1024 / 1024 + " MB");


        try {
            rt.exec("notepad");//打开系统内部文件
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void method() {
        int num = 0;
        for (int i = 0; i < 1000000; i++)
            num += i;

        System.out.println(num);
    }
}
