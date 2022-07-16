package com.lovecoding.day08;

public class Example12 {

    public static void main(String[] args) {

        String s1 = "小白";

        String s2 = new String("小白");

        String s3 = "小白";

        System.out.println(s1.equals(s2));

        System.out.println(s1 == s3);

        System.out.println("--------------------");
        //在编译期可以确定的值，参与内存储存，若编译期不能确定的或者在运行期才可以确定的不参与内存储存。

        String s4 = "1";

        String s5 = s4 + "a";

        String s6 = "1a";

        System.out.println(s5 == s6);

        System.out.println("--------------------");

        //final String s7 = "1";
        final String s7 = method();

        String s8 = s7 + "b";

        String s9 = "1b";

        System.out.println(s8 == s9);
        System.out.println("------------------------");
    }

    public static String method(){

        return "1";
    }
}
