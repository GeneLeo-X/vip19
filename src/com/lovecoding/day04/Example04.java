package com.lovecoding.day04;

import org.junit.Test;

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

    /**
     * 测试数组是随机隐藏的
     */
    @Test
    public void testFn(){
        int[] initArr = getInitArr();//initArr : 要在该数组中进行猜数游戏

        int num = 22;

        boolean result = cs(initArr, num);

        if(result) System.out.println("您盲猜，猜对了");
        else System.out.println("您猜错了.");
    }

    public static int[] getInitArr(){
        Random r = new Random();

        int[] arr = new int[8];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = r.nextInt(30);
        }

        return arr;
    }
}
