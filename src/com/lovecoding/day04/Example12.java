package com.lovecoding.day04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 1、先创造球池 01~ 33
 */
public class Example12 {

    static String[] ballPool = new String[33];

    public static void main(String[] args) {
        //String[] ballPool = createBallPool();

        createBallPool();//初始化球池

        System.out.println("--------欢迎来到双色球--------");

        System.out.println("球池为: " + Arrays.toString(ballPool));

        System.out.println("*************系统进行开奖*************");

        String[] sysRedBalls = getRdRedBalls();//系统随机抽取的红球

        Arrays.sort(sysRedBalls);
        System.out.println("随机抽取的6个红球为: " + Arrays.toString(sysRedBalls));

        Random r = new Random();
        int pIndex = r.nextInt(16);// 0 ~ 15的索引位置

        String sysBlueBall = ballPool[pIndex];//系统随机抽取的篮球
        System.out.println("随机抽取的1个篮球为: " + sysBlueBall);

        System.out.println("***************用户选号环节**************");

        System.out.println("请选择选号方式(1) 机选 (2) 人选");
        Scanner sc = new Scanner(System.in);

        int type = sc.nextInt();

        String[] userRedBalls = new String[6];//用户获取的红球
        String userBlueBall = ""; //用户获取的篮球
        boolean flag = true;
        while (flag){
            switch (type){
                case 1: //机选
                    flag = false;
                    userRedBalls = getRdRedBalls();
                    userBlueBall = ballPool[r.nextInt(16)];
                    break;
                case 2: //人选
                    flag = false;
                    break;

                default:
                    System.out.println("请选择选号方式(1) 机选 (2) 人选");
                    type = sc.nextInt();
                    break;
            }
        }

        Arrays.sort(userRedBalls);
        System.out.println("用户选择的红球为: " + Arrays.toString(userRedBalls));

        System.out.println("用户选择的篮球为: " + userBlueBall);
    }

    /**
     * 随机获取不重复的6个红球
     * @return
     */
    public static String[] getRdRedBalls() {
        String[] redBalls = new String[6];

        int count = 0;
        Random r = new Random();

        boolean[] flag = new boolean[ballPool.length];

        while (true){
            int pIndex = r.nextInt(33);//随机取的整数 0 ~ 32
            //猜数游戏的查找某数列中是否存在某元素
            String redBall = ballPool[pIndex];
            /*if(isExit(redBalls , redBall))
                continue;*/
            if(flag[pIndex]) continue;

            flag[pIndex] = true;
            redBalls[count ++] = redBall;

            if(count == redBalls.length)
                break;
        }


        return redBalls;
    }

    /**
     * 判断数组中是否已经存在某元素了
     *  -- 去重使用
     * @param redBalls
     * @param redBall
     * @return
     */
    public static boolean isExit(String[] redBalls, String redBall) {

        for(String rb : redBalls){

            if(null != rb && rb.equals(redBall)){//字符串判断两个元素是否相等的方法 equals()
                return true;
            }
        }

        return false;
    }


    /**
     * 生成球池的方法
     */
    public static String[] createBallPool(){
        //String[] ballPool = new String[33];

        for(int i = 1 ; i <= ballPool.length ; i ++){

            if(i < 10) ballPool[i - 1] = "0" + i;
            else ballPool[i - 1] = i + "";//快速将一种数据类型转换成字符串的方式

        }
        return ballPool;
    }
}
