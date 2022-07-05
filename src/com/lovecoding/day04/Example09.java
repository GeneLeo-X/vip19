package com.lovecoding.day04;

/**
 * 33 11 66 22 44 88 5
 *
 * 第一轮：
 *   minIndex = 0;
 *  中间过程:
 *   minIndex = 1;
 *   minIndex = 6;
 *   5 11 66 22 44 88 33
 * 第二轮:
 *  minIndex = 1;
 *  5 11 66 22 44 88 33
 * 第三轮:
 *   minIndex = 2;
 *   中间过程:
 *   minIndex = 3
 *  5 11 22 66 44 88 33
 *  第四轮：
 *  minIndex = 3;
 *  中间过程:
 *  minIndex = 4 ;
 *  minIndex = 6;
 *  5 11 22 33 44 88 66
 *  第五轮：
 *  minIndex = 4 ;
 * 5 11 22 33 44 88 66
 * 第六轮：
 * minIndex = 5 ;
 * 中间过程：
 *   minIndex = 6；
 *   5 11 22 33 44 66 88
 */
public class Example09 {


    public static void main(String[] args) {
        //int[] arr = {66 ,4 ,71 ,33 ,44 ,22 ,55};
        int[] arr = {33 ,11 ,66 ,22 ,44, 88, 5};
        int[] sortArr = getSortArrXZ(arr);
    }

    public static int[] getSortArrXZ(int[] arr){

        if(arr == null || arr.length == 1)
            return arr;

        for(int i = 0 ; i < arr.length - 1 ; i ++){//轮数
            int minIndex = i;

            for(int j = i+1 ; j < arr.length ; j ++){
                if(arr[j] < arr[minIndex]) minIndex = j;
            }

            if(minIndex != i){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }

            for(int x : arr)
                System.out.print(x + " ");

            System.out.println();
        }
        return arr;
    }
}
