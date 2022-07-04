package com.lovecoding.day03;

public class Example11 {


    public static void main(String[] args) {
        //10!

        int i = 1;

        int num = 1;

        while (i <= 10){
            num *= i ++;
        }

        System.out.println("10的阶乘和为:" + num);
    }
}
