package com.lovecoding.day03;

public class Example12 {


    public static void main(String[] args) {

        int i = 1;
        while (i < 100){

            if(i % 2 == 0) System.out.println(i + "是偶数.");
            else System.out.println(i + "是奇数.");

            if(i % 3 == 0) System.out.println(i + "是三的倍数.");

            i++;
        }
    }
}
