package com.lovecoding.day09;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Example03 {


    public static void main(String[] args) {

        Locale l_zh = new Locale("zh" , "CN");//中文语言环境

        Locale l_en = new Locale("en" , "US");

        Locale defLocale = Locale.getDefault();//获取系统默认的语言环境

        ResourceBundle rb = null;

        Scanner sc = new Scanner(System.in);

        System.out.println("请选择语言环境: (1) 中文 (2) 英文");

        int type = sc.nextInt();

        switch (type){
            case 1://中文
                //默认去src下寻找文件。传递一个相对路径就会按照传递的查找
                rb = ResourceBundle.getBundle("com.lovecoding.day09.info",defLocale);
                break;
            case 2:
                rb = ResourceBundle.getBundle("com.lovecoding.day09.info",l_en);
                break;
        }

        if(rb != null){
            System.out.println("               "+ rb.getString("sysname"));
            System.out.println(rb.getString("username"));
            String username = sc.next();
            System.out.println(rb.getString("password"));
            String password = sc.next();

            if(username.equals("zhangsan") && password.equals("123456")){
                System.out.println(rb.getString("login.tips") + username);
            }else{
                System.out.println("------------------");
            }
        }

    }
}
