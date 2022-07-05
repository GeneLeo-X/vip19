package com.lovecoding.day04;

/**
 *   33 11 66 22 44 88 5
 *
 *   冒泡（上浮）
 *
 *   第一轮：
 *   中间过程
 *   33 11 66 22 44 5 88
 *   33 11 66 22 5 44 88
 *   33 11 66 5 22 44 88
 *   ...
 *   5 33 11 66 22 44 88
 *
 *   第二轮
 *   中间过程：
 *   5 33 11 66 22 44 88
 *   ..
 *   5 33 11 22 66 44 88
 *   5 11 33 22 66 44 88
 *
 *   第三轮
 *   中间过程
 *   5 11 33 22 44 66 88
 *   5 11 22 33 44 66 88
 *
 */
public class Example08 {

    public static void main(String[] args) {
        int[] arr = {66 ,4 ,71 ,33 ,44 ,22 ,55};

        int[] sortArr = getSortArr(arr);

    }

    public static int[] getSortArr(int[] arr){
        if(arr == null || arr.length == 1)
            return arr;
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {//轮数

            for(int j = arr.length - 1 ; j > i ; j --){

                if(arr[j] < arr[j - 1]){//交换两个元素的位置
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
            System.out.println("\n-------------------------");
            for(int x : arr){
                System.out.print(x + " ");
            }
        }
        return arr;
    }
}
