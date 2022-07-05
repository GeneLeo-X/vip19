package com.lovecoding.day04;

/**
 * 定义格式：
 * for(数据类型 变量 : 数组){
 *     通过变量获取数组中的每一个元素
 * }
 *
 * 可变参数：
 *    数据类型... 变量名 ,
 *
 *    可变参数可以与普通参数一同存在于方法中。但可变参数的位置一定是方法参数列表的最后面
 */
public class Example02 {

    public static void main(String[] args) {
        int[] arr = {11,22,33,44};
        System.out.print("数组中的元素: ");
        for (int x : arr) {
            if(x > 22)
                System.out.print( x + " ");
        }

        System.out.println("\n----------------");

        printInfo("张三" , 3 , 4, 5, 6);

    }

    public static void printInfo(String name , int... a){

        for(int x : a){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println(name + a.length);
    }
}
