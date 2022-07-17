package com.lovecoding.day09;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

public class Example11 {

    public static void main(String[] args) {

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");//默认加密方式

            String pwd = "qwe123456";//pmq7VoTEWWLYh1ZPCDRujQ==

            byte[] bytes = pwd.getBytes();
            System.out.println(Arrays.toString(bytes));
            byte[] digest = md.digest(bytes);
            System.out.println(Arrays.toString(digest));

            //Base64 : a ~ z A ~ Z 0 ~ 9 + /
            String newStr = Base64.getEncoder().encodeToString(digest);//存入数据库或者文件中

            System.out.println("加密后的字符串为: " + newStr);

            //校验用户输入的密码是否正确
            if(newStr.equals("pmq7VoTEWWLYh1ZPCDRujQ==")){//MD5加密后都会带着串 ==
                System.out.println("密码正确");
            }else{
                System.out.println("密码错误");
            }

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
