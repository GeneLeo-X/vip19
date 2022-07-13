package com.lovecoding.day07;

/**
 * 类限制：
 * 1、只允许单继承
 * 2、可以多重继承 （多层继承）
 *
 */
public class Example01 {

    public static void main(String[] args) {
        HomeDog hd = new HomeDog();

        System.out.println(hd.name);

        hd.eat();

        System.out.println(hd.color);

    }
}


class Dog extends Animal {

    public Dog(String name ){

        System.out.println(name + "dog的构造器");
    }
    //protected : 专门为了继承中的子类去设计的 （受保护的）
    protected String name;

    public int age;

    void eat(){
        System.out.println("吃....");
    }
}

/**
 * HomeDog 是 Dog的子类
 */
class HomeDog extends Dog {

    public HomeDog(){
        super("家狗");

        System.out.println(super.name);
    }

    public HomeDog(String color){

        super("家狗");

    }
}

/**
 * 动物类
 */
class Animal {
    String color;
}