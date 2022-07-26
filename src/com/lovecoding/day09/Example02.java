package com.lovecoding.day09;

/**
 * StringBuffer : 是线程安全的，多个线程同时执行同一个串进行操作时，数据不会出现异常。
 */
public class Example02 {

    public static void main(String[] args) {
        String s1 = "aaa";

        String s2 = "bbbb";

        String s3 = s1 + s2;

        System.out.println(s3);

        //拼接更快速、高效
        StringBuffer buff = new StringBuffer("aaa");//线程安全的，多线程下面使用

        buff.append("bbbb").append("cccc");

        System.out.println(buff);

        System.out.println("--------------------");

        buff.delete(0 , 3);//删除字符串下标为0-3的元素

        System.out.println(buff);

        System.out.println("---------------------");

        System.out.println(buff.indexOf("cccc"));//返回出现指定字符串的首个元素的位置

        System.out.println("--------------------");

        String substring = buff.substring(0, 2);//获取并返回StringBuffer对象中下标从[0,2)的元素字符串

        System.out.println(substring);


        buff.reverse();//对字符串进行翻转
        //System.out.println(buff);

        System.out.println("-------------------------");
        StringBuffer buff1 = new StringBuffer("1233210");

        //System.out.println(buff1.reverse());

        System.out.println("---------判断一个字符串是否是回文数---------");
        String s6 = buff1.toString();
        String s5 = buff1.reverse().toString();

        if(s6.equals(s5)){
            System.out.println("是回文数");
        }else{
            System.out.println("不是回文数");
        }

        System.out.println("---------------------");

        StringBuilder builder = new StringBuilder();//线程不安全，单线程下使用

        builder.append("test111");

        System.out.println(builder);
    }
}
