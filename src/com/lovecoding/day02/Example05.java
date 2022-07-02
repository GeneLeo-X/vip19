package com.lovecoding.day02;

import java.util.Scanner;

/**
 * 求圆柱体的体积
 */
public class Example05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入圆柱体的高:");
        int h = sc.nextInt();

        System.out.println("请输入圆柱体的底面半径:");
        int r = sc.nextInt();

        int tj = (int)(3.14 * h * r * r);
        System.out.println("体积为：" + tj);
    }
}
