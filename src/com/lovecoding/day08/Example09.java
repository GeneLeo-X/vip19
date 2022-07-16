package com.lovecoding.day08;

import java.io.IOException;

/**
 * 异常需要处理
 *
 *  finally : 代码块是一定会被执行的代码块
 *
 *  面试题： catch块中的return语句与finally块谁先执行。
 *
 *  finally块是优于 catch块中return语句先执行的。
 *
 *     若catch块捕获到异常，程序会先执行catch语句块中的代码，一旦遇到return语句，会立即去执行finally块，若finally中也存在return语句则直接返回
 *     否则会跳回catch块继续执行返回catch中的return语句。
 *
 */
public class Example09 {

    public static void main(String[] args) {

        int a = 5 , b = 10;

        a = 1;

        System.out.println(a + b);
        int[] arr = new int[5];
        try {
            System.out.println(arr.length);
            System.out.println( b / a);//java.lang.ArithmeticException : 算术异常 ， 被0除 (所有的异常抛出，是在单独的线程中执行的)
            arr = null;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        } finally {
            //通常用来统一释放资源
            System.out.println("最终一定会被执行的代码");
            arr = null;
        }

        System.out.println(a * b);

        System.out.println("-----------------");

        //try {} 不能独立存在，必须与 catch/ finally 块配合使用
        try {
            System.out.println("try块中可能发生异常代码上");
            Class.forName("com.lovecoding.day08.Example011");
            System.out.println("try块中可能发生异常代码下");
        } catch (ClassNotFoundException e){//catch 中写即将要处理的异常类信息
            System.out.println(e);
        }

        System.out.println("异常代码之后执行的语句...");


        System.out.println("--------------------");

        System.out.println(method());


        System.out.println("--------------------------");

        try {
            move();//调用的是抛出了异常的方法，此处需要处理异常
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int method(){

        try{
            int i = 0 ;

            System.out.println(10 / i);
        }catch (ArithmeticException e){

            System.out.println("catch中捕获到了异常");

            return 999;
        }finally {
            System.out.println("finally块被执行到");
        }

        return -1;
    }

    /**
     * throws : 放在方法上面进行方法抛出异常的，可以同时抛出多个异常，多个异常直接使用逗号分隔
     *
     * throw : 在功能性语句上面用来抛出某个异常信息的。
     * @throws ClassNotFoundException
     * @throws IOException
     */
    public static void move() throws ClassNotFoundException, IOException {
        Class.forName("com.lovecoding.day08.Example011");

        int i = 10;

        if(i > 5) throw new IOException();
    }
}
