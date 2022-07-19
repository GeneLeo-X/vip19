package com.lovecoding.day10;

import java.util.ArrayList;
import java.util.List;

/**
 * Collection
 *
 *  - List
 *      - ArrayList ： 数据结构 ，动态数组
 *          调用无参的构造器，初始化一个没有容量的空数组出来。
 *           当第一次添加元素时，数组会通过grow()方法扩容到长度10。当添加元素大于10时，
 *           数组长度会自动扩容到（原数组的长度 + 原数组长度 >> 1)
 *           通常情况下为了防止过多次数组扩容，可以进行初始化容量配置。
 *           线程不安全的，适合单线程下使用。
 *  - Set
 */
public class Example02 {

    public static void main(String[] args) {

        //泛型约束，该集合中仅能存某种数据类型
        List<String> list = new ArrayList<>(100);

        list.add("abc");

        //list.add(333);

        list.add("test");

        for(int i = 0 ; i < list.size() ; i++){
                System.out.println(list.get(i).toUpperCase());
        }

        System.out.println("----------删除------------");

        //System.out.println("删除的元素为 : " + list.remove(6));

        System.out.println("-----------更新元素------------");

        list.set(1 , "set方法测试");


        for(int i = 0 ; i < list.size() ; i++){
            System.out.println(list.get(i));
        }

        System.out.println("判空");

        System.out.println(list.isEmpty());

        System.out.println("---------------------");

        List<Integer> list1 = new ArrayList<>();

        list1.add(11);
        list1.add(5);
        list1.add(22);
        list1.add(5);
        list1.add(null);
        list1.add(18);

        for(int i = 0 ; i < list1.size() ; i++){
            System.out.println(list1.get(i));
        }

        System.out.println("------------------");
        for(Integer i1  : list1) {
            System.out.print(i1 + " ");
        }
        System.out.println("\n------------------");
        System.out.println(list1);
        //list1.s

    }
}
