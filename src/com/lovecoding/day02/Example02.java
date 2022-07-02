package com.lovecoding.day02;

import org.junit.Test;

/**
 * 8种基本数据类型
 *
 * 按整数划分:
 *   英文              名称       所占字节数     默认值
 *   byte              字节           1            0
 *   short            短整型          2            0
 *   int(系统默认的)   整型           4            0
 *   long              长整型         8            0
 * 按浮点数划分
 *   float                      单精度浮点型        4          0.0f
 *   double(系统默认的浮点数)   双精度浮点型        8          0.0d
 *  字符型
 *   char              字符型         2            '\u0000'
 *   真假型
 *   boolean           布尔型        不固定        false
 *
 *
 *
 *  类型的声明：
 *
 *  格式、方式：
 *   类型  变量 ;
 *   类型  变量 = 值 ;
 *   类型 变量 , 变量;
 *
 * 自动类型转换
 *   容量小的会自动向容量大的进行转换。
 */
public class Example02 {

    char c = '中';//ASCII码表  UTF GBK  ...

    byte b = 5;

    short s = 0;//成员变量 - 有默认值

    int x = 0x23;

    @Test
    public void testFn(){

        int i = 10;

        int a;//局部变量 - 没有默认值

        float f = 20.8F ;
        double d = 30.6;

        a = 30;
        System.out.println(a);

        int a1 = 10 + 10;
    }

    @Test
    public void testFn1(){
        short s = 10;

        int i = 20;

        //i = s;
        //s = i;

        short s1 = (short)(s + 20);//强制类型转换(强制向下转型)

        System.out.println(i);

        double d = 10.56f;

        //float f1 = 10.34f + 44.3;

        boolean b = false;

        //b = (boolean) s1; 不能参与任何类型转换的

    }
}
