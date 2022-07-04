package com.lovecoding.day03;

public class Example10 {

    public static void main(String[] args) {
        // 1 ~ 100
        int i = 1;

        int sum = 0;
        while (i <= 100){
            sum += i++;
        }

        System.out.println("1~100的和为：" + sum);
    }
}
