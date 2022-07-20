package com.lovecoding.day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example09 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(11, 22, 33,55,55,66, 5);

        Collections.reverse(list);

        list.forEach(System.out::println);

        System.out.println("---------shuffle洗牌---------");

        Collections.shuffle(list);

        list.forEach(System.out::println);

        System.out.println("---------排序---------");
        Collections.sort(list);
        list.forEach(System.out::println);

        System.out.println("-----------移位---------");
        Collections.rotate(list , list.size());
        list.forEach(System.out::println);

        System.out.println("-----------查找 - 返回元素次数---------");

        System.out.println("次数: " + Collections.frequency(list, 55));

        System.out.println("--------使用工具类进行集合的同步处理--------");
        List<Integer> list3 = new ArrayList<>();

        list3.add(3);
        list3.add(5);

        list3 = Collections.synchronizedList(list3);
        list3.add(8);

        list3.forEach(System.out::println);


        System.out.println("---------返回不可变的集合对象--------");

        List<Object> list1 = getMethod();

        if(list1.size() > 0){
            System.out.println("------业务操作------");
        }

        //list1.add("不可变集合添加元素操作");//java.lang.UnsupportedOperationException

        System.out.println("----------添加元素----------");


        Collections.addAll(list3 , 878,87,212,434);


        list3.forEach(System.out::println);
    }

    private static List<Object> getMethod(){
        //查询数据
        List<Object> list = null;

        return Collections.emptyList();
    }
}
