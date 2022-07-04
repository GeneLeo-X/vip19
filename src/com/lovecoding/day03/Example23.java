package com.lovecoding.day03;

import java.util.Scanner;

/**
 * overloading method - 方法的重载
 *
 * 条件：
 * 1、方法名称必须相同
 * 2、方法的参数不同。
 *    - 参数的类型
 *    - 参数数量不同
 *    - 参数定义位置不同
 * 3、返回值类型不同不能作为方法重载的条件
 *
 * idea 方法未被调用使用时，会被置灰。调用会高亮
 *
 */
public class Example23 {

    public static void main(String[] args) {
        add(50.6 , 100);//alt + enter快速提示

        Scanner sc = new Scanner(System.in);


    }



    public static void add(){
        int a = 10;
        System.out.println(a + 20);
    }

    /**
     * 上浮20幅度
     * @param a
     */
    public static void add(int a){
        System.out.println(a + 20);
    }

    /**
     * 基数与上浮幅度都可以由调用者传递
     * @param a
     * @param fd
     */
    public static void add(int a , int fd){
        System.out.println(a + fd);
    }


    public static void add(int a , double fd){
        System.out.println(a + fd);
    }


    private static void add(double a, int fd) {

        System.out.println(a + fd);
    }

    /*public static double add(double a, int fd){

        return a + fd;
    }*/
}
