package com.lovecoding.day09;

//日期工具类目录
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example05 {

    public static void main(String[] args) {

        Date date = new Date();
//
//        System.out.println(date.toString());
//
//        System.out.println(date.getHours());//带横线的方法代表已弃用了 - 不建议使用了
//
//
//        Calendar calendar = Calendar.getInstance();
//
//        System.out.println("年: " + calendar.get(Calendar.YEAR) +
//                //月份是从0 开始的 范围 0 ~ 11
//                ", 月: " + (calendar.get(Calendar.MONTH) + 1) + ",日:" + calendar.get(Calendar.DAY_OF_MONTH));
//
//        System.out.println("------------------------");
//
//        System.out.println(calendar.get(Calendar.YEAR) + "年" + (calendar.get(Calendar.MONTH) + 1) + "月" + calendar.get(Calendar.DAY_OF_MONTH) + "日 "
//                //24小时制的  HOUR - 12小时制
//                + calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND)
//        );


        System.out.println("------------格式化日期--------------");

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

        System.out.println(df.format(date));
    }
}
