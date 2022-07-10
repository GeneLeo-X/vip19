package com.lovecoding.day06;

public class Example06 {

    public static void main(String[] args) {

        System.out.println(args);//引用类型地址

        System.out.println("--------------" + args.length);
        for(String str : args){
            System.out.println(str);
        }
    }
}
