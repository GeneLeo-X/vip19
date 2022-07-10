package com.lovecoding.day06;

public class Example07 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("com.lovecoding.day06.CodeDemo"
                , true , ClassLoader.getSystemClassLoader());//initialize : 初始化阶段：false，未完成，true - 完成
        //CodeDemo.method();

        //CodeDemo cd = new CodeDemo();//构造代码块会优于构造方法执行
    }
}

/**
 * 普通代码块在方法中执行是存在顺序的。
 *
 * 执行时机
 * 静态代码块 > 构造代码块 > 构造方法 > 普通代码块 (区分定义于静态方法还是普通方法中)
 */
class CodeDemo{

    static {
        System.out.println("静态代码块...");
    }

    private int count;
    public CodeDemo(){
        System.out.println("构造方法" + count);
    }


    {
        count = 30;
        System.out.println("构造代码块");
    }

    public static void method(){
        int a = 5;
        {//普通代码块
            int num = 30;
            System.out.println(a + num);
        }

        System.out.println("method = " + a);
    }
}