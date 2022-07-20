package com.lovecoding.day11;

import java.util.HashMap;
import java.util.Map;

public class Example08 {

    public static void main(String[] args) {
        Map<Integer , String> map = new HashMap<>();

        map.put(2 , "jack");
        map.put(1 , "tom");
        map.put(3 , "lily");

        System.out.println(map.getOrDefault(5, "new val"));

        map.putIfAbsent(2 , "new val");//若键值已经存在，则不进行操作。

        map.forEach((k , v) -> System.out.println(k + "->" +v));

        System.out.println("-------------");

        map.replace(1 , "tom1" , "test replace ");
        map.forEach((k , v) -> System.out.println(k + "->" +v));

        map.compute(3 , (k ,v)-> v.toUpperCase());

        System.out.println("-------------");

        map.forEach((k , v) -> System.out.println(k + "->" +v));


    }
}
