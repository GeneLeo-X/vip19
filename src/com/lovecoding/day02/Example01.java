package com.lovecoding.day02;

/**
 * 变量按类型划分：
 *   1) 基本数据类型 8种
 *   2) 引用数据类型  - String 、 Example01、第三方提供jar包里面的类、JDK源码中的工具类、常用的类
 * 按位置划分:
 *   1) 定义在类里面的，所属于类 - 成员变量  (类中所有方法都可以访问到)
 *   2) 定义在方法里面或者方法参数 - 局部变量 (只有本方法可以访问)
 *
 * 标识符： Java用来命名 - 类、包、方法、变量等
 *   要求：
 *     1、特殊字符仅包含 $ _  （字母、数字 、$、 _组成）
 *     2、数字不允许开头
 *     3、要符合规范 （驼峰命名法 -
 *          1) 命名方法、变量时 - 首个单词首字母小写，其余单词首字母大写。
 *          2) 命名的类 - 所有单词首字母大写
 *          3) 命名包 - 所有字母全部小写，多个单词之间使用 . 分隔
 *          4) 不能是Java中的关键字和保留关键字(goto ，const)
 *     ）
 */
public class Example01 {

    int z = 100;// z - 成员变量
    public static void main(String[] args) {
        int a = 10;//a - 基本数据类型变量

        String str = "zhangsan"; // str - 引用数据类型变量

        int az1 = 11;

        int class1 = 11;

        String 威哥 = "test汉字";

        System.out.println(威哥);
    }

    public void getProductInfo(){
        System.out.println(z);
    }
}

/**
 * 驼峰命名类
 */
class ProductInfo{

}