package com.lixiuchun.demo01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test01 {


    public static void main(String[] args) {
        List<Bird> birdList = new ArrayList<>();
        birdList.add(new Bird("小白",11));
        birdList.add(new Bird("小红",10));
        birdList.add(new Bird("小黑",101));
        birdList.add(new Bird("小绿",1));
        birdList.add(new Bird("小紫",131));
        birdList.forEach(System.out::println);
        System.out.println("------------------------------");
        Stream<Bird> newBirdStream = birdList.stream().filter(bird -> bird.getAge() > 1); //筛选Bird对象中age大于1的对象
        Stream<Bird> Birdsorted = newBirdStream.sorted(new BirdComparator());//对Bird对象进行BirdComparator规则的排序
        Birdsorted.forEach(System.out::println);//对Bird对象进行foreach输出
        //可以简短改写为下面的一行代码
        //birdList.stream().filter((bird)->{return bird.getAge() > 1;}).sorted(new BirdComparator()).forEach(System.out::println);

    }
}
class Bird{
    private String name;
    private int age;

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Bird() {
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
