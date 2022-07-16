package com.lovecoding.day08;
import java.util.Scanner;


public class Example07 {

    public static void main(String[] args) {

        //装箱
        int i = 10;
        Integer i1 = i; //自动装箱

        Integer i2 = new Integer(333);//手动装箱

        Integer i3 = new Integer("11991");

        System.out.println("i2 = " + i2 + " , i3 = "  + i3);
        //拆箱操作
        int i4 = i3.intValue();
        System.out.println(i4);

        System.out.println("------------------");

        byte b = i2.byteValue();

        System.out.println(b);

        System.out.println("--------------------");

        Long l1 = 5l;

        System.out.println(l1.intValue());


        System.out.println("-----------将String类型变为基本数据类型----------");

        //Integer i6 = new Integer(8888);

        System.out.println(Integer.parseInt("1736732"));

        double d1 = Double.parseDouble("666.333");

        System.out.println("double类型数据："+ d1);

        Double d2 = Double.valueOf("222.333");

        System.out.println(d2);

        System.out.println(Double.compare(11.22, 11.22));//-1 ：前者小于后者， 1 ： 前者大于后者


        System.out.println("-------------------");
        //享元模式设定 - 空间更小 ： 1b (字节)
        Integer i10 = 22;
        Integer i11 = 22;

        System.out.println(i10 == i11);

        Integer i12 = 188;

        Integer i13 = 188;

        System.out.println(i12 == i13);
        
        Integer i14 = new Integer(999);
        
        Integer i15 = new Integer(999);

        System.out.println(i14 == i15);

        Scanner sc = new Scanner(System.in);
    }
}
