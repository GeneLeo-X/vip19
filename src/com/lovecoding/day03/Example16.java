package com.lovecoding.day03;

public class Example16 {

    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        //每次打印一对数字
        System.out.print(i + " " + j + " ");
        for(int k = 0 ; k < 5 ; k++){
            i = i + j;
            j = i + j;

            System.out.print(i + " " + j + " ");
        }

        //第二种
        
    }
}
