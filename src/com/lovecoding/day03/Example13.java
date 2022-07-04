package com.lovecoding.day03;

/**
 * do{} while(条件表达式 - boolean类型);
 *
 * 先执行一次，再进行判断。若条件不成立则退出循环
 */
public class Example13 {


    public static void main(String[] args) {

        //10~0
        int i = 10;
        do {
            System.out.println(i--);
        }while (i >= 0);
    }
}
