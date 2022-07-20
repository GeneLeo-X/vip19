package com.lovecoding.day11;

import java.util.LinkedHashSet;

public class Example02 {

    public static void main(String[] args) {
        linkedHashSet();
    }

    /**
     * 按照添加的顺序进行输出打印
     *  1、兼具set的特点重复元素可以去除、
     *  2、List的特点，按照存储的顺序进行打印
     */
    public static void linkedHashSet(){

        LinkedHashSet<Integer> ts = new LinkedHashSet();

        ts.add(44);
        ts.add(33);
        ts.add(33);
        ts.add(66);
        ts.add(11);
        ts.add(22);

        for(Integer i : ts) {
            System.out.println(i);
        }
    }
}
