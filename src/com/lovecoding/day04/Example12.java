package com.lovecoding.day04;

import java.util.Arrays;

/**
 * 1、先创造球池 01~ 33
 */
public class Example12 {

    public static void main(String[] args) {
        String[] ballPool = createBallPool();

        System.out.println("--------欢迎来到双色球--------");

        System.out.println("球池为: " + Arrays.toString(ballPool));
    }


    /**
     * 生成球池的方法
     */
    public static String[] createBallPool(){
        String[] ballPool = new String[33];

        for(int i = 1 ; i <= ballPool.length ; i ++){

            if(i < 10) ballPool[i - 1] = "0" + i;
            else ballPool[i - 1] = i + "";//快速将一种数据类型转换成字符串的方式

        }
        return ballPool;
    }
}
