package com.lovecoding.day04;

public class Example07 {

    public static void main(String[] args) {
        int[] arr = {33,66,7,8,999,11,-1};

        System.out.println("最大值为: " + findMaxVal(arr));
    }


    public static int findMaxVal(int[] arr){
        //int maxVal = arr[0];//将数组中的第一个元素当成最大数.
        int maxVal = Integer.MIN_VALUE;//整数中的最小值
        for(int x : arr){//x :遍历数组中的每一个元素
            if(x > maxVal) maxVal = x;
        }
        return maxVal;
    }
}
