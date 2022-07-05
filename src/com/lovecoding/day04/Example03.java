package com.lovecoding.day04;

import org.junit.Test;

/**
 * 空指针异常 : java.lang.NullPointerException
 *
 * 数组下标越界异常： java.lang.ArrayIndexOutOfBoundsException: 2
 */
public class Example03 {


    public static void main(String[] args) {


        int[] arr = new int[3];

        System.out.println("----------------");

        arr = null;

        System.out.println(arr.length);

    }

    @Test
    public void testFn(){
        int[] arr = {33,22};

        for (int i = 0; i <= arr.length ; i++) {
            System.out.println(arr[ i]);
        }

    }
}
