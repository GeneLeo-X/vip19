package com.lovecoding.day03;

public class Example22 {

    public static void main(String[] args) {

        System.out.println("-------------");

        printC(6);

        System.out.println("---------------");

        printC(8);
    }

    public static void printC(int line){
        for (int i = 1 ; i <= line ; i ++){
            for(int j = 1; j <= i ; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
