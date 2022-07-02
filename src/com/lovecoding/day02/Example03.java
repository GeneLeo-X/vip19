package com.lovecoding.day02;

/**
 *
 *  \n  : 换行转义字符
 */
public class Example03 {


    public static void main(String[] args) {
        String str = "aaaa\nbbbb\nccc";

        System.out.println(str);

        System.out.print("-------------------------\n");
        System.out.print("aaaaabb");

        System.out.println();
        System.out.println("cccc\\dddd");


        System.out.println("-------------------");

        System.out.println("aaaaaaaaaaaaaaa\rbbbbbbbbbbb");

        System.out.println("ccccccc\"dddddd");
    }
}
