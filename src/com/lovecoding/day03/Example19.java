package com.lovecoding.day03;

/**
 *     *
 *    **
 *   ***
 *  ****
 * *****
 */
public class Example19 {

    public static void main(String[] args) {
        int line = 8;
        for(int i = 1 ; i <= line ; i ++){
            for(int j = line ; j > 0 ; j--){
                if(j <= i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
