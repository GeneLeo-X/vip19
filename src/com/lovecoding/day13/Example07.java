package com.lovecoding.day13;

import org.junit.Test;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example07 {

    public static void main(String[] args) {

        String str = "1";

        //判定这个字符串是否全部由数字组成
        char[] chars = str.toCharArray();
        boolean flag = true;
        for(char c : chars){

            if(c > '9' || c < '0') {
                flag = false;
            }
        }

        if(flag) System.out.println(str + "由数字组成.");


        System.out.println("-------------------");

        //a*b : 以 N（0~多）个a开始 ，必须以b结尾
        System.out.println(Pattern.matches("a*b", "aaaaab"));

        System.out.println("-----------判定是否全数字-------------");

        //至少有一个数字
        System.out.println(Pattern.matches("\\d+", str));

        System.out.println(str.matches("\\d{1,}"));
    }

    @Test
    public void method(){
        //010-38389438

        String str = "1112-38389438";

        if(str.matches("[0][0-9]{2,3}[-]\\d{8}"))
            System.out.println(str + "是电话号");
        else System.out.println(str + "不是一个电话号");

        //验证手机号码

        String str1 = "13104529746";

        System.out.println("------------------");
        System.out.println(str1.matches("^[1][0-9&&[^124]]\\d{9}$"));

        System.out.println("---------用户名校验------------");

        //验证用户名，只能是字母开头的，数字、字母或下划线的组合 12 ~ 18位

        String username = "a1dhsj_j323dsdsdsdsdsdsds2";

        System.out.println(username.matches("[a-zA-Z]\\w{11,17}"));

        //验证邮箱(如:zhangsan_wc@163.com)
        System.out.println("--------邮箱校验---------");

        //278937@qq.com
        String email = "278937@qq.com";

        System.out.println(email.matches("([1-9]\\d{4,9}[@][q]{2}[.]com)|([a-zA-Z]\\w{3,}[@]\\d{2,3}[.][a-z]{2,3})"));

        //验证金额（可以有小数位）
        String price = "110";

        System.out.println("验证金额");

        System.out.println(price.matches("([0][.][0-9]{2,3})|([1-9]\\d*([.&&[0-9]+]|\\d*))"));
    }

    /**
     * 76372dhsgh7362723hgdhs327832
     */
    @Test
    public void testFn(){

        Pattern pattern = Pattern.compile("\\d+");
        Matcher m = pattern.matcher("76372dhsgh7362723hgdhs327832");

        while (m.find()){//知道匹配的字符串中不再有满足的为止

            System.out.println(m.group());//获取匹配好的字符串
        }
    }

    /**
     * 给定一个字符串，找出字符串中包含的所有手机号，
     * 并且把所有手机号按照3,4,4 位分隔。输出新的字符串。
     */
    @Test
    public void testFn1(){

        String phoneStr = "接到活数据库或肯定是13109876542东黄山金花打开就是虎口夺食13576895427";

        Pattern p = Pattern.compile("[1][0-9&&[^124]]\\d{9}");

        Matcher m = p.matcher(phoneStr);

        while (m.find()){

            String group = m.group();
            System.out.println(group);

            DecimalFormat df = new DecimalFormat("###,####,####");
            String formatStr = df.format(Long.valueOf(group));

            phoneStr = phoneStr.replaceAll(group , formatStr);
        }

        System.out.println("格式化后的语句：" + phoneStr);

    }
}
