package com.lovecoding.day03;

import java.util.Scanner;

public class Example07 {

    public static void main(String[] args) {

        System.out.println("请输入月份（1 ~ 12）");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        switch (num){
            case 2:
                System.out.println("该月有28天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("本月有30天");
                break;
            default:
                System.out.println("本月有31天");
                break;
        }
    }
}
