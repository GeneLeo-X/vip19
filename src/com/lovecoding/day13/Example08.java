package com.lovecoding.day13;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public class Example08 {

    static final int red = 10;

    static final int blue = 20;
    public static void main(String[] args) {

       /* int color = 30;*/
       Color color = Color.RED;
        switch (color){
            case BLUE:
                System.out.println("蓝色");
                break;
            case RED:
                System.out.println("红色");
                break;
            case YELLOW:
                System.out.println("黄色");
                break;
        }

        System.out.println("name = " + color.name() + " , ordinal = " + color.ordinal());

        Map<Color , String> map = new HashMap<>();

        EnumMap<Color , String> enumMap = new EnumMap<>(Color.class);

        enumMap.put(Color.RED , "红色");
        enumMap.put(Color.YELLOW , "黄色");

        enumMap.forEach((k , v) -> System.out.println(k + v));

        System.out.println("-------------------");
        EnumSet<Color> enumSet = EnumSet.allOf(Color.class);//返回枚举的全部元素

        enumSet.add(Color.YELLOW);
        enumSet.forEach(cor -> System.out.println(cor));
    }
}
