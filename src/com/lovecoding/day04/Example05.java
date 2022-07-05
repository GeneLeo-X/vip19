package com.lovecoding.day04;

public class Example05 {

    public static void main(String[] args) {
        //A B C D ....
        char[] arr = {'A' ,'B' , 'C' , 'D' , 'E' , 'F' , 'G'};

        printZJ(arr);

        System.out.println("---------------");

        char c = 'A';
        printZJ(c , 7);
    }
    public static void printZJ(char c , int line){
        for(int i = 1 ; i <= line ; i ++){
            for(int k = line ; k > i ; k--){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= i * 2 - 1 ; k++){
                System.out.print(c);
            }

            c++;//在该元素基础上自增一个单位
            System.out.println();
        }
    }

    public static void printZJ(char[] arr){
        for(int i = 1 ; i <= arr.length ; i ++){
            for(int k = arr.length ; k > i ; k--){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= i * 2 - 1 ; k++){
                System.out.print(arr[i - 1]);
            }

            System.out.println();
        }
    }
}
