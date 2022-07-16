package com.lovecoding.day08;

import java.util.Random;

/**
 * 红点 - 断点 。debug执行时会停滞的点
 */
public class Example11 {

    public static void main(String[] args) {

        System.out.println("-------------");

        Random r = new Random();
        for(int i = 0 ; i < 20 ; i++){

            if(i == 8)
                method(i);

            if(i == 5){
                int j = r.nextInt(i);
                method(j);
            }
        }
    }

    public static void method(int num){

        int a = num;

        System.out.println(a);
    }
}
