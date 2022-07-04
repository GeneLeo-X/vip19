package com.lovecoding.day03;

import java.util.Scanner;

/**
 * 注意范围条件要框定明确，尽量不落下值，也不重复判断
 *
 * 成组的分支语句，仅会有一个分支进入执行
 */
public class Example02 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        if(score >= 90 && score <= 100){
            System.out.println("该成绩为A等级");
        }else if(score >= 80 && score < 90){
            System.out.println("该成绩为B等级");
        }else if(score >= 70 && score < 80){
            System.out.println("该成绩为C等级");
        }else{
            System.out.println("该成绩为D等级");
        }

    }
}
