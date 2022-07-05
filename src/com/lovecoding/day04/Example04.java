package com.lovecoding.day04;

import java.util.Random;
import java.util.Scanner;

public class Example04 {

    public static void main(String[] args) {
        int[] arr = {44, 55 ,1,3,66, 88};

        Scanner sc = new Scanner(System.in);

        System.out.println("请猜数: ");
        int num = sc.nextInt();

        /*boolean result = cs(arr, num);

        if(result) System.out.println("恭喜你猜对了!");

        else System.out.println("对不起，您猜错了!");*/


        System.out.println("------------第二种方式-----------");

        boolean flag = false;//标志位
        for(int x : arr){
            if(x == num) flag = true;
        }
        if(flag) System.out.println("您猜对了...");
        else System.out.println("猜错了...");

        System.out.println("---------------------");

        //随机生成数组中的元素
        //随机数 Random  - 伪随机数

        Random r = new Random();

        System.out.println(r.nextInt(100));//不包含边界值：0 ~ 99
    }

    /**
     * 猜数
     * @param arr - 已知数组
     * @param num - 即将要猜的数字
     * @return
     */
    public static boolean cs(int[] arr , int num){
        for ( int x : arr) {
            if(x == num) return true;
        }
        return false;
    }
}
