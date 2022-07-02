package com.lovecoding.day02;

import java.util.Scanner;

public class Example08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("第一个数：");
        int n1 = sc.nextInt();

        System.out.println("第二个数：");
        int n2 = sc.nextInt();

        //空瓶子
        /*int temp = n1;
        n1 = n2;
        n2 = temp;*/

        System.out.println("交换后的：n1 = " + n1 + ",n2 = " + n2);

        //^按位异或方式
        n1 = n1 ^ n2;
        n2 = n1 ^ n2;
        n1 = n1 ^ n2;
        System.out.println("交换后的：n1 = " + n1 + ",n2 = " + n2);

        //+ - * /
        
    }
}
