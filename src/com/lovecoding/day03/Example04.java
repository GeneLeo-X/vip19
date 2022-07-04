package com.lovecoding.day03;

import java.util.Scanner;

/**
 * 场景： 范围区间判断时使用
 */
public class Example04 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("天气情况（1）晴天 （外出） （2）阴天 (在家)");
        int tq = sc.nextInt();

        if(tq == 1){//晴天
            System.out.println("(1)逛街 (2)逛公园");
            int method = sc.nextInt();
            if(method == 1){
                System.out.println("我出来逛街了");
            }else{
                System.out.println("我们去逛公园了");
            }
        }else if(tq == 2){//阴天
            System.out.println("(1)看电影 (2)玩游戏");

            int w = sc.nextInt();

            if(w == 1){
                System.out.println("看一部电影");
            }else{
                System.out.println("玩一把游戏...");
            }
        }
    }
}
