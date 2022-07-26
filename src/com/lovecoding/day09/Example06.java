package com.lovecoding.day09;

import java.util.Arrays;

public class Example06 {

    public static void main(String[] args) {

        String[] strArr = {"tom" , "abo" , "lily" , "iban"};
        Arrays.sort(strArr);

        System.out.println(Arrays.toString(strArr));

        Dog[] dogs = {new Dog("小花" , 3 , "花色") , new Dog("旺财" , 1 , "黄色")
                , new Dog("阿福" , 6 , "白色")};

        Arrays.sort(dogs , new DogComparator());

        System.out.println(Arrays.toString(dogs));


    }
}


class Dog {//implements Comparable{

    private String name;

    private double month;

    private String color;

    public Dog() {
    }

    public Dog(String name, int month, String color) {
        this.name = name;
        this.month = month;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getMonth() {
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

    /**
     * 比较方法 - 告诉Arrays.sort 排序规则的。
     * @param o
     * @return
     */
    /*@Override
    public int compareTo(Object o) {
        if(o instanceof Dog){
            Dog dog = (Dog) o;

            *//*if(this.month - dog.getMonth() > 0) return 1;
            else if(this.month - dog.getMonth() < 0) return -1;*//*
            return this.month - dog.getMonth();
        }
        return 0;
    }*/
}