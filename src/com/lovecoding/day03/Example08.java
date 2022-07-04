package com.lovecoding.day03;

import java.util.Scanner;

/**
 *
 * ctrl + alt + l : 自动格式化代码
 */
public class Example08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入运算符：(+、-、*、/)");

        int a = 33;
        int b = 11;
        String ysf = sc.next();
        switch (ysf){

            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            default:
                System.out.println(a / b);
                break;

        }
    }
}
