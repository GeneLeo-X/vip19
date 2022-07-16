package com.lovecoding.day08.package1;

public class Demo2 {

    public void eat(){
        System.out.println("公有的方法被调用...");
    }

    protected void run(){

        System.out.println("受保护的方法被调用...");
    }


    public static void main(String[] args) {
        Demo2 d2 = new Demo2();

        Demo1 d1 = new Demo1();

        d1.eat();//默认修饰符


    }

}
