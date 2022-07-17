package com.lovecoding.day09;

import java.util.Scanner;

public class Example01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个字符串:");

        String s1 = sc.next();
        System.out.println("请输入第二个字符串:");

        String s2 = sc.next();

        String str = getStr(s1 , s2);

        System.out.println("两个字符串中重复的字符串为：" + str);
    }

    private static String getStr(String s1, String s2) {

        String str = "";
        char[] chars = s1.toCharArray();

        for(char c : chars){
            if(-1 != s2.indexOf(c)){//s2字符串中存在该字符
                if(!str.contains(c + ""))
                    str += c;
            }
        }
        return str;
    }
}
