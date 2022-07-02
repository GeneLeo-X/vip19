package com.lovecoding.day02;

import java.util.Scanner;

public class Example07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入天数：");

        int days = sc.nextInt();//46

        int week = 7;
        System.out.println("周数为:" + (days / week) + "，余下天数：" + (days % 7));
    }
}
