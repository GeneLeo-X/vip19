package com.lovecoding.day07;

public class Example07 {

    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.fly();
    }
}

/**
 * 普通类实现接口，必须重写接口中的抽象方法。
 * 抽象类实现接口，可以重写抽象方法，统一的交于 它的 子类去重写。
 *
 * 接口可以通过关键字 implements 去多实现，多个接口之间使用逗号分隔
 */
class Bird implements Fly , ZC{


    @Override
    public void fly() {
        System.out.println("鸟儿飞行，比较低");
    }

    @Override
    public void zc() {
        System.out.println("在田地里面捉虫子");
    }
}

class MaQ implements IBird{

    @Override
    public void sing() {

    }

    @Override
    public void zc() {

    }

    @Override
    public void fly() {

    }
}

class Plane implements Fly{

    @Override
    public void fly() {
        System.out.println("飞机飞行，比较高，很快...");
    }
}

//接口统一能力 , 接口可以多继承接口
interface IBird extends Fly , ZC{

    void sing();
}

interface ZC{


    void zc();
}

interface Fly {

    public static final int NUM = 100;

    void fly();
}

//针对于CURD能力的编写

interface ChickenService {

    void add();

    void update();

    void delete();

    void get();
}