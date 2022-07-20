package com.lovecoding.day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Example05 {

    public static void main(String[] args) {
        System.out.println(function("dhsgy126532", (str) -> str.toUpperCase()));//重写方法时，定义我们的功能

        System.out.println("---------------------");

        List<Integer> list = supplier(10, () -> (int) (Math.random() * 100));//向下取整数

        list.forEach(System.out::println);//打印集合元素

        System.out.println("------------------------");

        List<String> result = predicate(Arrays.asList("tom", "lilydsd", "lucydsd", "jack"), str -> str.length() > 4);//包含了l字母的就过滤出来

        result.forEach(System.out::println);

        System.out.println("---------------------------");

        List<String> asList = Arrays.asList("tom", "lilydsd", "", "jack" , "");

        List<String> resultList = asList.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());

        resultList.forEach(str-> System.out.println(str));

        //需求：定义一个小鸟Bird对象，创建一个集合ArrayList封装一组Bird。 过滤出来月份大于3个月的。正序排列输出。
    }

    //Function<T,R> 接口	表示接受一个参数并产生结果的函数。
    private static String function(String str , Function<String , String> fu){

        return fu.apply(str);
    }

    //Supplier<T>接口	代表结果供应商。 产生10个随机数
    private static List<Integer> supplier(int num , Supplier<Integer> su){
        List<Integer> result = new ArrayList<>();

        for(int i = 0 ; i < num ; i++){
            result.add(su.get());
        }

        return result;
    }

    //Predicate<T>接口  断言接口. 过滤集合中的元素，按照需求

    private static List<String> predicate(List<String> list , Predicate<String> pre ){
        List<String> result = new ArrayList();

        for(String str : list){

            if(pre.test(str)) result.add(str);
        }

        return result;
    }
}
