package com.lovecoding.day02;

import java.io.IOException;
import java.util.Scanner;

/**
 * if(boolean结果类型表达式){}else{}
 *
 * if --- else 语句的作用域 {} ，若里面仅有一行代码的情况下，该花括号可以省略不写
 */
public class Example09 {

    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        //char c = 'G';
        System.out.println("请输入字符:");
        int c = System.in.read();
        //a = 97  z = 122  A = 65 Z = 90
        System.out.println(c);

        //System.out.println("91字符是: " + (char)91);

        if(c >= 'a' && c <= 'z')
        System.out.println("小写字母");
        else if(c >= 'A' && c <= 'Z') System.out.println("大写字母");
        else System.out.println("其它字符");

    }
}
