package com.lovecoding.day06;

public class Example03 {

    public static void main(String[] args) {
        
        int x = 10;
        
        method(x);

        System.out.println("x = " + x);

        System.out.println("-------------------");

        Duck d = new Duck();

        d.age = 10;

        method(d);

        System.out.println("Duck age = " + d.age);


        System.out.println("------------------------");

        String name = "小飞";

        method(name);

        System.out.println("name = " + name);

        System.out.println("----------------------------");

        Person p = new Person();

        p.name = "备备";

        method(p);

        System.out.println("p name =" + p.name);
    }

    private static void method(Person p1) {
        p1.name = "关关";
    }

    private static void method(int mx) {

        mx = 20;
    }


    private static void method(Duck duck){
        duck.age = 20;
    }

    private static void method(String sname){
        sname = "小备";
    }

}

class Duck{
    int age;
}

class Person{
    String name;
}
