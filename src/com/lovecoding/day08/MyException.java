package com.lovecoding.day08;

/**
 * 自定义异常类
 */
public class MyException extends Exception{

    public MyException(){
        super();
    }

    public MyException(String s){
        super(s);
    }
}
