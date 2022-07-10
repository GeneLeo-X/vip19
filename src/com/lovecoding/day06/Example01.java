package com.lovecoding.day06;

public class Example01 {

    public static void main(String[] args) {
        Demo d1 = new Demo();

        //d1.name = "测试1";
        d1.setName("测试1");

        System.out.println(d1.getName());
        d1.setAge(11);

        d1.setColor("蓝色");

        d1.setSex(0);//0 - 男 1 - 女

        d1.printInfo();

        System.out.println("----------------------");

        Demo d2 = new Demo();

        d2.printInfo();

        System.out.println(d1.toString());

        d1 = null;

    }
}

/**
 * 将属性、方法、类等进行私有化的过程
 *
 * IDEA快捷生成 ： 对外访问的方法方式 alt + insert
 */
class Demo{

    private String name;

    private int age;

    private String color;

    private int sex;


    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void printInfo(){
        System.out.println("name = " + name + ", age = " + age
                + ", sex = " + sex + ", color = " + color);
    }

    /**
     * 快捷生成针对属性打印信息方法
     * @return
     */
    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", sex=" + sex +
                '}';
    }
}