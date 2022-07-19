package com.lovecoding.day10;

/**
 * 语法格式：
 * (参数...) -> {};
 *  变形：
 *  若是从写的方法体中，只有一行代码，{}可以省略不写
 *  若参数只有一个，参数类型与 ()都可以省略不写。若是多个参数，参数类型若有一个参数省去参数类型
 *    ，就要都省去，否则加都加，多个参数()不能省略
 *  若实现的方法有返回值， 方法体中若只有一行代码，{}可以省略不写，但同时省去return关键字
 *
 *  条件：
 *   接口中的抽象方法仅能有一个
 */
public class Example01 {

    public static void main(String[] args) {

        testFn();
    }

    private static void testFn(){

        /*Person p1 = new Person() {
            @Override
            public void eat(String thing) {
                System.out.println("人再吃"+thing+"东西...");
            }
        };

        p1.eat("肉");*/

        Person p2 = (name ,t)  ->{

                System.out.println("-----");
                return name + "再吃"+t+"东西...";
        };

        System.out.println(p2.eat("张三", "鱼"));
    }
}

/**
 * 用来标记函数式接口的 ， 限制了接口中仅能有一个抽象方法。默认、静态的方法不计算在内
 */
@FunctionalInterface
interface Person {

    String eat(String name ,final String thing);


    public default void move(){

    }
}