package com.lovecoding.day08.package2;

import com.lovecoding.day08.package1.Demo2;


public class Demo3 extends Demo2 {//不同包下面的子类，可以访问到父类中的受保护的方法

    public static void main(String[] args) {
        Demo3 d3 = new Demo3();

        Demo2 d2 = new Demo2();

        d3.run();

        System.out.println("---------------");

        d2.eat();

        System.out.println("------------------");

        com.lovecoding.day08.package2.Demo2 d2_1 = new com.lovecoding.day08.package2.Demo2();
        d2_1.sing();

    }
}
