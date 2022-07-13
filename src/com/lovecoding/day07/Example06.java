package com.lovecoding.day07;

public class Example06 {

    public static void main(String[] args) {
        HomeHorse hh = new HomeHorse();

        hh.move();

        System.out.println("-----------------");

        //new Horse(); 抽象类不能被实例化操作。
    }
}

/**
 * 包含抽象方法的类，必须是抽象类。抽象类中可以不定义抽象方法
 */
abstract class Horse{

    public Horse(){}

    abstract protected void move();

    /*protected void move(){

    }*/
}

class HomeHorse extends Horse{

    @Override
    protected void move() {//必须让子类重写父类中的抽象方法，让抽象方法有实现体。
        System.out.println("跑得比较慢....");
    }
}

/**
 * 抽象类作为子类的时候，可以不重写父类中的方法
 */
abstract class YeHorse extends Horse{

    private String name;
    private int age;

    abstract protected void eat();

    protected void run(){

    }
}

class SubHorse extends YeHorse {

    @Override
    protected void move() {

    }

    @Override
    protected void eat() {

    }
}