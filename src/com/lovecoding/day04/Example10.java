package com.lovecoding.day04;

/**
 * 5 11 22 33 44 66 88
 *
 * //查找第一次：
 *     N / 2 = 1;
 * //查找第二次:
 *    N / 2 / 2 = 1;
 *    ...
 *
 *    N / 2 ^ M = 1;
 *
 *    2 ^ M = N;
 *
 *    次数 m = log2底数N ==  O(logN)
 *
 *
 */
public class Example10 {


    public static void main(String[] args) {
        int[] arr = {5 ,11 ,22 ,33 ,44 ,66 ,88 };

        int result = findVal(arr , 66);//Alt + enter点击某个不存在的方法，可以进行快捷创建

        System.out.println(result);
    }

    public static int findVal(int[] arr , int num) {
        int sIndex = 0;
        int eIndex = arr.length - 1;

        while (sIndex <= eIndex){//在砍去一半的过程中，这两个值会发生变化，sIndex 会增加 eIndex 会减少
            int mIndex = (sIndex + eIndex) >>> 1;//更快速

            if(arr[mIndex] > num){
                eIndex = mIndex - 1;
            }else if(arr[mIndex] < num){
                sIndex = mIndex + 1;
            }else {
                return mIndex;
            }
        }

        return -1;
    }
}
