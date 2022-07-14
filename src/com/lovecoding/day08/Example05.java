package com.lovecoding.day08;

public class Example05 {

    public static void main(String[] args) {
        //从外部声明实例化 内部类
        Outer out = new Outer();

        Outer.Inner inner = out.new Inner();

        System.out.println("------------------");

        inner.method();

        System.out.println("---------------------");

        out.print1();

        System.out.println("----------------------");

        out.print2();

        System.out.println("----------------------");

        Outer.Inner2 inner2 = new Outer.Inner2();

        inner2.method();

        System.out.println("------------------------");

        out.print3();

        System.out.println("------------------------");

        out.print4();

        System.out.println("-------------------------");

        out.print5(new Dog() {
            @Override
            public void move() {
                System.out.println("参数式的匿名内部类");
            }
        }, "测试", 0, new Cat() {

            @Override
            protected void move() {
                System.out.println("参数式匿名内部类2..");
            }
        });

    }
}


class Outer{

    /**
     * 静态内部类，类名直接访问了，无需外部类对象
     */
    static class Inner2{
        void method(){
            System.out.println("静态内部类执行..");
        }
    }

    //成员内部类
    class Inner{
        void method(){
            System.out.println("测试内部类执行....");
        }
    }

    /**
     * 外部类内部访问它自己的内部类
     */
    public void print1(){
        Inner inner = new Inner();
        inner.method();
    }

    /**
     * jdk 1.8之后 方法内部类中访问的 变量，可以不显示使用final关键字修饰了，但一旦使用，会自动的加上final
     */
    public void print2(){
        int x = 10;

        x++;

        final int y = 20;
        class Inner1 {

            void method(){
                System.out.println("方法内部类执行" + y);
            }
        }

        Inner1 inner1 = new Inner1();
        inner1.method();

        System.out.println("x = " + x);
    }

    /**
     * 使用继承式匿名内部类
     */
    public void print3(){
        //new Cat()
        Cat cat = new Cat() {//匿名一个子类的过程
            @Override
            protected void move() {
                System.out.println("继承式的匿名内部类调用");
            }
        };

        cat.move();
    }


    public void print4(){
        Dog dog = new Dog() {

            @Override
            public void move() {
                System.out.println("接口式的匿名内部类调用");
            }
        };

        dog.move();
    }

    public void print5(Dog dog , String name , int age , Cat cat){

        dog.move();
        System.out.println("--------" + name);
        cat.move();
    }
}

/**
 * 继承式的匿名内部类 - 应用
 */
abstract class Cat{

    public Cat(){

    }
    abstract protected void move();
}

/**
 * 测试接口式匿名内部类
 */
interface Dog {
    void move();
}

/**
 * 很好解决了，Java不能多继承，只能单继承的限制
 */
class A extends B {

    class D extends C {

    }
}
class B{
    protected int age;
}

class C{
    protected int sno;
}