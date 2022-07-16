package com.lovecoding.day08;

import java.util.Arrays;

public class Example13 {


    public static void main(String[] args) {

        String str = "1aabbjhdsghteytaaewy1273627327";

        System.out.println("------根据索引获取字符--------");
        System.out.println(str.charAt(5));

        System.out.println("------获取字符串对应的字符数组--------");
        char[] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars));
        int count = 0;
        for(char c : chars){
            if(c == 'a') count ++;
        }
        System.out.println(count);

        System.out.println("------------------判断字符串以指定的内容从0位置开始-----------------");

        System.out.println(str.startsWith("aabb" , 1));

        String str1 = "http://wx.tencent.com/pay/url....";


        System.out.println("---------------------");

        String str2 = str.replace("a" , "x");

        System.out.println(str2);

        System.out.println(str.replaceAll("2" , "8"));//推荐使用

        System.out.println(str.replaceFirst("2" , "8"));

        System.out.println("--------------裁剪字符串-------------");
        //三个元素，不包含边界值3
        System.out.println(str.substring(0, 3));

        System.out.println("------------分割字符串-----------");
        String str3 = "ydgysgdh1s,hjDDFDFdsghjds,dkjskdhjsAsjkds";

        String[] strings = str3.split("h");

       //System.out.println(Arrays.toString(strings));
        for(String s : strings){
            System.out.println(s);
        }

        System.out.println("---------判断某个字符串是否存在-----------");

        System.out.println(str3.contains("&"));

        int indexOf = str3.indexOf("1s,", 0);
        if(indexOf != -1){//若存在则返回该字符串在某个串中的索引位置
            System.out.println("存在" + indexOf);
        }else {
            System.out.println("不存在");
        }

        System.out.println(str3.substring(indexOf));


        System.out.println("--------从字符串的最后面向前面查找某个字符是否存在--------");

        System.out.println(str3.lastIndexOf(77));

        System.out.println("----------判空-----------");

        String str4 = null;
        //System.out.println(str4.isEmpty());

        System.out.println(str3.length());

        System.out.println("------------转小写------------");

        System.out.println(str3.toLowerCase());

        System.out.println("------------转大写------------");


        System.out.println(str3.toUpperCase());

        System.out.println("--------判断开头或者结尾是否存在空格---------");

        String username = " zhangs  an123 ";
        String user1 = "zhangsan123";

        if(!username.trim().equals(user1)){
            System.out.println("不存在该用户");
        }

    }
}
