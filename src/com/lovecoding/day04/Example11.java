package com.lovecoding.day04;

import java.util.Arrays;

public class Example11 {

    public static void main(String[] args) {
        int[] arr = {5 ,11 ,22 ,33 ,44 ,66 ,88 };

        System.out.println(Arrays.binarySearch(arr, 55));

        //规定起始、结束位置的
        System.out.println(Arrays.binarySearch(arr , 2 , 4 , 5));

        System.out.println("---------------------");

        System.out.println(Arrays.toString(arr));

        System.out.println("---------------------");

        int[] arr1 = {66 ,4 ,71 ,33 ,44 ,22 ,55};
        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

        System.out.println("----------------------");

        int[] newArr = Arrays.copyOf(arr1, 3);

        //应用场景：
        //数组的扩容
        arr1 = Arrays.copyOf(arr1 , 10);

        System.out.println(Arrays.toString(newArr));

        System.out.println("扩容后的数组：" + Arrays.toString(arr1));


        System.out.println("--------------------");

        int[] arr2 = {11 , 22 ,33};
        arr2 = Arrays.copyOfRange(arr2 , 1 , 2);//不包含边界值 Java中几乎所有的东西，函数API都是不包括边界值

        System.out.println(Arrays.toString(arr2));


        System.out.println("-------------------");

        int[] arr3 = {11 , 22 ,33};

        System.out.println(Arrays.equals(arr2, arr3));


        System.out.println("---------------------");

        int[] arr4 = new int[7];
        Arrays.fill(arr4 , 0 , 2 , 6);

        System.out.println(Arrays.toString(arr4));
    }
}
