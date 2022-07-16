package com.lovecoding.day08.package1;

public class Example08 {

    public static void main(String[] args) {
        Demo1 d1 = new Demo1();

    }
}

class Demo1{

    private int age;

    void eat(){
        System.out.println("默认的方法被执行到..");
    }

    private void method(){
        System.out.println("私有的方法被调用" + age);

        eat();
    }

}