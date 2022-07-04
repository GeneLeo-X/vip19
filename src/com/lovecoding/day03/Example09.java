package com.lovecoding.day03;

import org.junit.Test;

/**
 * 循环：
 *
 * while 、
 *   while(表达式 - boolean) {}
 *   - 先判断条件是否成立，再去执行{}内部代码。
 * do while 、
 *   - 先执行再判断
 *
 * for(初始化变量 ; 判断 ; 改变变量值 ){}  -- 推荐的
 *
 *  - 初始化变量可以省略，拿到外面初始化。但后面的；不能省略
 *  - 判断条件可以省略，死循环 ，除非配合关键字 break : 跳出循环
 *  - 变量值改变可以省略不写，但需要放在循环体中
 *
 */
public class Example09 {

    public static void main(String[] args) {

        //while
        int i = 8;

        while (i <= 6){
            System.out.println(i++);
        }

    }

    @Test
    public void testFn(){
        //fori + enter
        int i = 0;
        for (; ; i++) {

            if(i == 2) continue;//跳过本次循环，下面的循环体中的代码将不再执行
            System.out.println(i);

            if(i == 5) break;
        }

    }
}
