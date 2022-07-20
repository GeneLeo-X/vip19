package com.lovecoding.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example06 {

    public static void main(String[] args) {
        List<Bird> birdList = new ArrayList<>();
        birdList.add(new Bird("黄鹂" , 1 , "黄色"));
        birdList.add(new Bird("麻雀" , 3 , "灰色"));
        birdList.add(new Bird("鹦鹉" , 2 , "绿色"));
        birdList.add(new Bird("信鸽" , 5 , "白色"));

        birdList.forEach(System.out::println);

        System.out.println("----------------------");

        List<Bird> filterResultList = birdList.stream().filter(bird -> bird.getAge() > 1).sorted(new BirdComparator()).collect(Collectors.toList());

        filterResultList.forEach(System.out::println);
    }
}


class Bird {

    private String name;

    private Integer age;

    private String color;

    public Bird() {
    }

    public Bird(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}