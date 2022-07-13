package com.lovecoding.day07;

/**
 * this.方法  -  super...方法  - this.方法(对象的父类..)  - super...方法(对象的父类..)
 */
public class Example09 {

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b1 = new B();
        C c1 = new C();
        D d1 = new D();
        System.out.println("--------------------");
        a1.show(b1);

        a1.show(c1);

        System.out.println("--------------------");

        a2.show(b1);

        a2.show(c1);

        a2.show(d1);

        System.out.println("--------------------");

        b1.show(c1);

        b1.show(d1);

    }
}
class A {
    public void show(B b){
        System.out.println("A and B");
    }
    public void show(C c) {
        System.out.println("A and C");
    }
}
class B extends A {
    public void show(B b){
        System.out.println("B and B");
    }
    public void show(A a){
        System.out.println("B and A");
    }
}

class D extends B{ }

class C extends B{ }
