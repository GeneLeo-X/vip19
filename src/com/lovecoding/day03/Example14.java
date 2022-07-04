package com.lovecoding.day03;

import org.junit.Test;

/**
 * 阶乘和
 */
public class Example14 {

    public static void main(String[] args) {
        //1! + 2! + .... 10 !
        int i = 1;

        int sum = 0;//求和
        do {
            int num = 1;
            int j = 1;
            do {
                num *= j++;

            }while (j <= i);

            sum += num;//1! ~10!对应的数值
            i++;
        }while (i <= 10);

        System.out.println(sum);
    }

    /**
     * 第二种，当前阶乘 = 小于它的阶乘 * 自身
     */
    @Test
    public void testFn(){
        int i = 1;

        int num = 1;

        int sum = 0;
        do {
            num *= i++;
            sum += num;
        }while (i<= 10);

        System.out.println(sum);
    }
}
