package com.lovecoding.day02;

import com.lovecoding.day01.HelloWorld;
import org.junit.Test;

import java.util.Scanner;

/**
 * 算术运算符:
 *   + 、 - 、* 、 / 、 % 、 ++ 、--
 *
 *  ++ : 前加加、后加加
 *    前加加：会先自增一个单位，并赋予自身，再参与运算
 *    后加加: 会先参与运算，再自增一个单位并赋予自身
 *  -- : 前减减、后减减
 *
 *  接收键盘输入：
 *  注意：必须写在主函数中
 *  Scanner input=new Scanner(System.in);
 *
 *
 *  赋值运算符：
 *
 *  = 、 +=、-=、*=、/= 、%=
 *
 *  比较运算符：
 *  == 、!= 、<=
 *  、>=  等
 *  结果是boolean类型，真、假
 *
 *  逻辑运算符:
 *
 *  &、&&、| 、|| 、^ 、！
 *
 *  位运算符：
 *
 *  ~按位取反
 *  ^ : 按位异或
 *  & : 位数上有一个0则结果为0
 *  | : 位数上有一个1则结果为1
 *
 *  位移运算符：
 *
 *  注意：：尖方向向哪面就是向哪面移动
 *  左移：  左移2位，  10 << 2
 *  右移：
 *    无符号右移：
 *    带符号右移：
 *
 *  三目运算符:
 *  X ？ Y ： Z
 *  首先判断表达式 X 的结果，结果为真则执行Y ，否则执行Z
 */
public class Example04 {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println( a + b + 20);//表达式： a+b
        System.out.println("--------------------");
        System.out.println( a % b);

        System.out.println(b % a);
        System.out.println("----------------");
        int s = 33;
        System.out.println(s++ + a);

        System.out.println(s);

        System.out.println("----------------");
        System.out.println(b++ * (s % --a));


        System.out.println("-----------------------");

        Scanner sc = new Scanner(System.in);

        System.out.println("请从键盘输入一个值：");
        int num = sc.nextInt();//.var ：在调用某个方法的时候快速接收该方法的返回值的
        System.out.println(num);
        System.out.println("请从键盘输入一个字符串：");
        String next = sc.next();
        System.out.println("接收的字符串为:" + next);

    }

    /**
     * 赋值运算符测试
     */
    @Test
    public void testFn(){

        int a = 10;
        int b = 10;

        a += 30;// a = a + 30;

        short s = 5;

        s += 3;
        //s = s + 3;
        System.out.println(s);

        System.out.println("--------------------");
        System.out.println(a %= --s + b);
    }

    /**
     * 比较运算符
     */
    @Test
    public void testFn1(){

        System.out.println(10 != 3);

        int a = 5;

        int b = 3;
        System.out.println(--a >= ++b);

        boolean b1 = 33 > 22;

    }

    /**
     * 逻辑运算符
     * & : true & false false ： 只要有一方表达式的结果为假了，整体的结果就是假（一假则假）
     * && : 短路与，双与 ： （一假则假），当表达式前面一方已经确认是假了，则判断终止直接赋予假。
     *
     * | : 一真则真
     * || : 短路或，双杠或。当前面表达式为真了，则判断终止，结果就是真。
     *
     * ^ : 异或 ，相同则为假，不同则为真
     *
     * 写代码推荐使用：&& 、||
     */
    @Test
    public void testFn2(){
        int a = 15;

        int b = 12;

        System.out.println(a -- > 15 && b ++ > 12);

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("-----------------");

        System.out.println( true ^ false);
    }

    /**
     * 位运算
     */
    @Test
    public void testFn3(){


        System.out.println(~10);

        System.out.println("---------------");

        System.out.println(3 ^ 2);

        System.out.println("-----------------");

        System.out.println(5 & 10);
    }

    @Test
    public void testFn4(){

        System.out.println(10 << 2);// 10 * 2的位数次幂  (10 * 2的2次幂)

        System.out.println("---------------");

        System.out.println(8 >>> 2);//8除以2的2次幂
    }

    /**
     * 三目运算符
     * 仅建议一层 - 至多两层
     */
    @Test
    public void testFn5(){
        System.out.println(3 > 4 ? (3 + 2) : (1 - 2) > 0 ? "大于0" : "不大于0");//通常情况下判断一次即可

        int x = 33;
        System.out.println(x > 50 ? "超过半值了" : "未过半");

    }
}
