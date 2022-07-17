package com.lovecoding.day09;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class Example09 {


    public static void main(String[] args) {
        Integer num = 13437676;

        BigInteger bi = new BigInteger("362715621565135721538152381");

        BigInteger bi1 = new BigInteger("362715621565135721538152381");

        System.out.println("--------大整数求和--------");

        System.out.println(bi.add(bi1));

        System.out.println(bi1.subtract(bi));

        System.out.println(Arrays.toString(bi.divideAndRemainder(bi1)));

        if(bi.compareTo(bi1) > 0){
            System.out.println("前者大于后者");
        }else if(bi.compareTo(bi1) == 0){
            System.out.println("相等");
        }else {
            System.out.println("小于");
        }

        System.out.println("-----------------------------");

        BigDecimal bd = new BigDecimal("566.3876");

        BigDecimal bd1 = new BigDecimal("566.3876");

        System.out.println(bd.subtract(bd1));

        System.out.println(bd.divide(bd1));//必须能除开

       /* if(bd.subtract(bd1).doubleValue() > 0){

        }*/
    }
}
