package com.lovecoding.day05;

public class Example01 {

    public static void main(String[] args) {
        Person p1 = new Person();//实例化对象，也是为对象申请内存空间

        p1.name = "张三";//访问属性

        System.out.println("姓名：" + p1.name + "，年龄: " + p1.age);

        p1.eat();//使用对象调用方法

        Person p2 = new Person();

        System.out.println(p2.name + " , " + p2.age);

        /*Person p3 = null;

        System.out.println(p3.name);*///NullPointerException

        new Person().sleep();//匿名调用，快

        System.out.println("-------------------------");

        Horse h1 = new Horse();
        h1.name = "小白";
        h1.age = 3;
        System.out.println("H1信息：" + h1.name + ", " + h1.age);
        Horse h2 = new Horse();
        h2.name = "小黑";
        h2.age = 5;
        System.out.println("H2信息：" + h2.name + ", " + h2.age);

        h2 = h1;//对象之间的复制

        System.out.println("H2信息：" + h2.name + ", " + h2.age);

        h2.name = "小棕马";

        h2.age = 2;

        System.out.println("H1信息：" + h1.name + ", " + h1.age);

        //h1 = null;释放对象的空间
        //h2 = (Horse) p1;
    }
}

class Person {

    String name = "X先生";//默认值null

    int age;//默认值0

    int height;

    int weight;

    void eat(){
        System.out.println("eat()");
    }

    void sleep(){
        System.out.println("sleep()");
    }
}

class Horse{

    String name;

    int age;
}