package com.lovecoding.day03;

/**
 * 方法定义：
 *
 * 访问修饰符  关键字(可省) 返回值 方法名(形参(* : 0 ~ N)){ 方法体 }
 */
public class Example21 {

    public static void main(String[] args) {
        //餐馆点菜
        //顾客1 ，服务员报菜名

       /* System.out.println("宫爆鸡丁");

        System.out.println("锅包肉");

        System.out.println("家常凉菜");

        System.out.println("杀猪菜");*/

        //方法的调用 - 真实传入的参数称之为实参
        System.out.println("张三点了:" + menu("张三", 3));

        System.out.println("------------------");

        //顾客2 , 服务员报菜名

        /*System.out.println("宫爆鸡丁");

        System.out.println("锅包肉");

        System.out.println("家常凉菜");

        System.out.println("杀猪菜");*/

        System.out.println("李四点了：" + menu("李四", 2));


        System.out.println("--------------------------------");

        //实参的名称可以与形参相同或不同
        long a = 5;
        method((int)a);
    }


    /**
     * 菜单
     *
     * 定义在方法()中的参数称为方法形参
     *
     *  return ： 在一个方法中可以存在多个，但仅会有一个被执行到。
     * @param name - 顾客名称
     * @param no - 菜的编号
     */
    public static String menu(String name , int no){

        System.out.println("1、宫爆鸡丁");
        System.out.println("2、锅包肉");
        System.out.println("3、家常凉菜");
        System.out.println("4、杀猪菜");

        String oc = "";
        switch (no){
            case 1:
                return  "宫爆鸡丁";//return : 终结整个方法继续执行
               // break;
            case 2:
                return "锅包肉";
            case 3:
                return "家常凉菜";
            case 4:
                return "杀猪菜";
        }

        return oc;
    }


    public void testFn(int num){
        if(num == 0)
            return;//当判断某些无意义参数时使用，终结方法继续执行。冗错处理.

        System.out.println(num);
    }

    /**
     * 实参的取值范围要小于等于形参的取值范围
     */
    public static int method(int a){

        //System.out.println(a);

        return a;
    }
}
