package com.lovecoding.day07;

/**
 * 重写特点：
 *   若执行父类中的某一个方法被子类重写了，那会直接执行到子类重写的父类方法上。
 *
 *  对象 instanceof 类型（自定义）
 */
public class Example08 {

    public static void main(String[] args) {
        HomeChicken hc = new HomeChicken();

        hc.eat();

        YeChicken yc = new YeChicken();

        yc.eat();

        System.out.println("-------------------");

        method(yc);
    }

    public static void method(Chicken c){
        c.eat();

        //强制向下类型转换的时候 可能会发生异常 - java.lang.ClassCastException
        if(c instanceof HomeChicken){// 实例判断，若成立则返回true
            HomeChicken hc = (HomeChicken) c;
            hc.dm();
        }else if (c instanceof YeChicken){

            YeChicken yc = (YeChicken) c;

            yc.sing();
        }



    }
}

abstract class Chicken{

    protected String name;

    protected abstract void eat();
}


class HomeChicken extends Chicken{

    @Override
    protected void eat() {
        System.out.println("家鸡喜欢吃小米..");
    }

    /**
     * 打鸣
     */
    public void dm(){
        System.out.println("家鸡会打鸣....");
    }
}

class YeChicken extends Chicken {

    @Override
    protected void eat() {
        System.out.println("野鸡喜欢吃虫子..");
    }

    public void sing(){
        System.out.println("野鸡会唱歌..很好听..");
    }

}