package com.lovecoding.day02;

import java.util.Scanner;

public class Example06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入五位数值：");

        int num = sc.nextInt();

        int w = num / 10000 ;

        int q = num / 1000 % 10;

        int b = num / 100 % 10;

        int s = num / 10 % 10;

        int g = num % 10;

        System.out.println("各个位数上面的和为： " + (w + q + b + s + g));

    }
}
