package com.lovecoding.day03;

import java.util.Scanner;

public class Example03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数:");

        int n1 = sc.nextInt();


        System.out.println("请输入第二个数:");

        int n2 = sc.nextInt();

        if(n1 > n2) System.out.println("第一个数大于第二个数");

        else if(n1 == n2) System.out.println("第一个数等于第二个数");//基本数据类型判断数值是否相等 ==

        else System.out.println("第一个数小于第二个数");
    }
}
