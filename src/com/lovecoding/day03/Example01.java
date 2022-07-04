package com.lovecoding.day03;

public class Example01 {


    public static void main(String[] args) {

        int year = 2400;

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println(year + "是闰年");
        else System.out.println(year + "是平年");
    }
}
