package com.lovecoding.day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example07 {

    public static void main(String[] args) {
        hashMap();
    }

    /**
     * HashMap : 数据结构 哈希表 （数组 + 链表）（jdk1.7 之前）（jdk1.7之后 引入了一种平衡二叉树（红黑树））
     * 1、当第一次使用无参构造器构造对象时，会将加载因子loadFactor置为 0.75f
     * 2、当第一次添加元素，会申请16个内存大小的数组。将一个临界值threshold = 16 * 0.75 = 12
     *    当元素添加到临界值之后，会进行resize 扩容，重新设置数组大小。数组大小扩大为原数组的二倍，
     *    同时临界值也变为原数组的二倍。
     * 3、储存顺序不能保证恒久不变 - 扩容之后会从新计算hash位置 - 数组下标
     *
     *
     *
     * 重复的key，会进行值的覆盖
     */
    private static void hashMap(){

        Map<Integer , String> map = new HashMap<>();

        map.put(2 , "jack");
        map.put(1 , "tom");
        map.put(3 , "lily");
        map.put(1 , "ben");

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();

        Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();

        while (iterator.hasNext()){

            Map.Entry<Integer, String> entry = iterator.next();

            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("--------------------");

        entrySet.forEach(entry -> System.out.println(entry.getKey() + "->" + entry.getValue()));

        System.out.println("--------------------");

        Set<Integer> keySet = map.keySet();

        for(Integer key : keySet){

            System.out.println(key + "->" + map.get(key));//get : 通过一个key获取对应的值
        }

        System.out.println("--------------------------");

        map.forEach((k , v) -> System.out.println(k + "->" + v));

        System.out.println("----------------------");

        System.out.println("是否存在：" + map.containsKey(8));

        System.out.println("----------------------");

        System.out.println(map.remove(1));

        map.forEach((k , v) -> System.out.println(k + "->" + v));


        System.out.println("-----------------------");

        String str = "dhjsh";
        System.out.println(str.hashCode());

        System.out.println("---------------");

        System.out.println(15 & 76372);//相当于 num % 16 = 0 ~ 15 之间的数
    }
}
