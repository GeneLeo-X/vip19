package com.lovecoding.day03;

/**
 * switch(表达式 - int、byte、short、String等) {
 *     case 固定的值:
 *          break;
 *     case 固定的值:
 * }
 *
 * 应用场景： 有某些固定值需要匹配时使用
 */
public class Example05 {


    public static void main(String[] args) {

        int num = 40;

        final int a = 10;//final用它修饰的变量会变为常量
        switch (num){

            case 10: {
                int i = 5;
                System.out.println("匹配的数值为10" + i);
                break;//跳出switch语句块
            }
            case 20:
                System.out.println("匹配的数值为20");
                break;
            case 40:
            case 50:
                int i = 30;
                System.out.println("匹配40或者50  " + i);
                break;

            default:
                System.out.println("默认匹配...");
                break;
        }
    }
}
