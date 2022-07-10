package com.lovecoding.day06;

public class Example02 {

    public static void main(String[] args) {
        Dog d1 = new Dog();

        Dog d2 = new Dog();

        //d1.Dog();

        Dog d3 = new Dog("小白");

        System.out.println(d3);

        Dog d4 = new Dog("小黑" , 11 , "黑色");

        System.out.println(d4.toString());
    }
}

/**
 * 类在定义时，隐藏无参的默认构造器。
 * 但一旦我们显示的写出来任何一种构造器，隐藏的无参的构造器就会被取缔。
 *
 * 构造方法互调的时候，一定要有出口。
 *
 * this - 代表调用者对象 ， 或者当前对象。
 *
 */
class Dog{

    private String name;

    private int month;

    private String color;

    /**
     * 之后学习技术栈，初始化对象使用的就是对象中的无参构造器 （反射）
     */
    public Dog(){//定义构造方法 - 无参的，默认调用的构造方法
        System.out.println("调用了无参构造器");
    }

    /**
     * 对外提供实例的方法 - 可以自行控制
     * @return
     */
    public Dog instance(){
        return new Dog();
    }

    /**
     * 构造方法重载 - 条件参数不同
     */
    public Dog(String name){

        this(name , 2 , "白色");//通过this关键词，调用自身的构造器，但该行代码必须写在构造方法中的第一行.
        System.out.println("name = " + name);
        this.name = name;
    }

    public Dog(String name, int month, String color) {

        this.name = name;
        this.month = month;
        this.color = color;

        this.method();
    }

    public void method(){
        System.out.println("method 测试...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", month=" + month +
                ", color='" + color + '\'' +
                '}';
    }
}