package com.lovecoding.day04;

/**
 * 数据类型[] 数组名 = new 数据类型[长度];
 *
 * 几维就要有几对中括号
 * 数据类型[][] 数组名 = new 数据类型[长度][];
 * 数据类型[][] 数组名 = {{} , {}};
 */
public class Example06 {

    public static void main(String[] args) {
        /*int[][] arr1 = new int[3][];
        for(int i = 0 ; i < arr1.length ; i++){
            arr1[i] = new int[i + 3];
        }*/
        int[][] arr = {{11,55,77} , {44,66,88,99} , {44,39 , 55}};//班级 + 学员成绩的二维数组

        for(int i = 0 ; i < arr.length ; i ++){

            int totalScore = 0;
            for(int j = 0 ; j < arr[i].length ; j ++){
                totalScore += arr[i][j];//每个班级中的学员的每一个成绩
            }

            System.out.println("第"+(i + 1) + "班级的平均分: " + (totalScore / arr[i].length));
        }
    }
}
