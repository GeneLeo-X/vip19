package com.lovecoding.day07;


public class Example02 {

    public static void main(String[] args) {
        TestB b = new TestB();
    }
}

class TestA{

    public TestA(){
        System.out.println("A类的信息...");
    }
}

class TestB extends TestA{

    public TestB(){

        System.out.println("B类被执行..");
    }

    private TestC testC = new TestC();
}

class TestC{
    public TestC(){
        System.out.println("C类被执行");
    }
}