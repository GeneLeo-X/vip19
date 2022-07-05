package com.lovecoding.day04;

/**
 *
 * 划分：
 *  动态初始化
 *    数据类型[] 数组名称 = new 数据类型[长度];
 *    数据类型[] 数组名称;
 *    数组名称 = new 数据类型[长度];
 *  静态初始化 - 数组长度/开辟内存空间大小 ，初始化时元素的个数有关。
 *    数据类型[] 数组名称 = new 数据类型[]{元素...};
 *    数据类型[] 数组名称 = {元素...};
 */
public class Example01 {


    public static void main(String[] args) {

        int[] arr = new int[5];
        //索引来操作数组 - 起始位置 0 开始
        arr[0] = 3;
        arr[1] = 2;

        //length : 获取某个数组长度的属性
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n--------------------");

        arr = new int[3];

        arr[0] = 6;

        for (int i = 0; i <  arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n-----------------");

        int[] arr1 = new int[]{11, 22, 33};

        int[] arr2 = {15,22,44};//50学生学号没有任何规律可循可以静态初始化

        System.out.println(arr1.length);

        System.out.println("--------------------------");

        //循环初始化具有规律的学生学号

        int[] snoArr = new int[50];

        //0 ~ 49  20220100
        for (int i = 0; i < snoArr.length; i++) {
            snoArr[i] = 20220101 + i;
        }

        int len = snoArr.length;
        for (int i = 0; i <  len ; i++) {
            System.out.print(snoArr[i] + " ");
        }

    }
}
