package com.lovecoding.day11;

import java.util.ArrayList;
import java.util.List;

public class Example04 {

    /**
     * :: - Java引用，关键字new、和引用构造器，方法
     *
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(44);
        list.add(22);
        list.add(33);

        //Consumer
        list.forEach(val -> System.out.println(val));

        System.out.println("----------------");
        //System.out::println : 一个参数的打印值的lambda表达式
        list.forEach(System.out::println);

    }


}
