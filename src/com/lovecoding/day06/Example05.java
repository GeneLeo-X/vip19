package com.lovecoding.day06;

/**
 * 需求：统计一个类一共实例化了几次对象
 */
public class Example05 {

    public static void main(String[] args) {

        Cat c1 = new Cat();//实例化对象

        Cat c2 = new Cat();

        Cat c3 = new Cat();

        //静态的属性或者是方法可以直接使用类名进行调用Cat
        System.out.println(Cat.count);//能统计实例化的次数吗？

        Cat.method();
    }
}

/**
 * 1、static只能修饰成员变量，不能修饰局部变量
 */
class Cat{

    static String name;//静态成员变量，生命周期会提前，到类初始化完成即可声明

    int month;//晚出来的

    static int count;

    public Cat(){
        count++;
    }

    /**
     * static修饰方法 - 内部只能调用，static修饰的属性或方法.
     */
    public static void method(){
        //this.month = 5; : this是跟当前对象，或者调用者对象产生关系的。 而static修饰的是与类信息产生关系的。
        int num = 20;


        System.out.println(num);
    }
    //修饰内部类
    static class TestC{

    }
}