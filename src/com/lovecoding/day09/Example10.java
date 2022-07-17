package com.lovecoding.day09;

import com.lovecoding.day09.util.DecimalUtil;

import java.text.DecimalFormat;

public class Example10 {

    public static void main(String[] args) {

        double pi = 3.1415926;

        DecimalFormat df = new DecimalFormat("0.00%");// % 、 0 、# 在格式化类中有特殊处理

        System.out.println(df.format(pi));

        DecimalFormat df1 = new DecimalFormat("#.####");

        System.out.println(df1.format(pi));


        System.out.println("---------------------");

        System.out.println(DecimalUtil.getTwoDecimal(pi));

        System.out.println(DecimalUtil.getFourDecimal(36574.4376274));

    }
}
