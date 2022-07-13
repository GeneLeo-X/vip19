package com.lovecoding.day07;

/**
 * final 可以修饰 成员变量与局部变量，将其变为常量
 *
 */
public class Example05 {

    final static  int num = 20;

    public Example05(){
    }

    public static void main(String[] args) {
        //num = 20;

        final String url;
        url = "http://www.baidu.com";


        System.out.println(url);

        SubTestDemo std = new SubTestDemo();

        std.method();

        System.out.println(Constants.URL.ALIPAY_URL);
    }
}
class TestDemo{

    final int age;

    public TestDemo(){
        age = 20;

        System.out.println(Constants.URL.ALIPAY_URL);
    }

    final public void method(){
        System.out.println("method is called!!!");
    }
}

class SubTestDemo extends TestDemo{

}


final class Constants{

    public static final int NUM = 100;



    interface URL{
        String ALIPAY_URL = "https://alipay.com/pay/111";
        String BAIDU_URL = "https://www.baidu.com";
    }
}