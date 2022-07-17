package com.lovecoding.day09;

//所有的静态方法都支持静态导入
import java.util.Random;

import static java.lang.Math.sqrt;

public class Example04 {

    public static void main(String[] args) {

        System.out.println(Math.abs(-6));

        System.out.println(Math.PI);

        System.out.println(Math.pow(2 , 3));

        int val = (int)(Math.random() * 100);
        System.out.println(val * 1.0 / 100);


        System.out.println("----------------");

        System.out.println(Math.round((Math.random() * 100)) * 1.0 / 100);


        System.out.println(sqrt(4));

        System.out.println("-------------------");

        System.out.println(Math.floor(19.88));//返回double类型的整数部分 向下取整数

        System.out.println("-------------------");

        System.out.println(Math.ceil(19.0)); // 向上取整数

        Random r = new Random();

        System.out.println(r.nextBoolean());
    }
}
