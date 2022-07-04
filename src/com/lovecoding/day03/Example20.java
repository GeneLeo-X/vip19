package com.lovecoding.day03;

/**
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 */
public class Example20 {

    public static void main(String[] args) {
        int line = 5;

        for(int i = 1 ; i <= line ; i ++){

            for(int k = line ; k > i ; k--){
                System.out.print(" ");
            }

            for(int k = 1 ; k <= i * 2 - 1 ; k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
