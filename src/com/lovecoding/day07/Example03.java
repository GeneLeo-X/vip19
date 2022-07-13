package com.lovecoding.day07;

/**
 * 面试题：overloading与Overriding区别
 *
 * 1、多个方法之间都是方法名称一样，才会产生的。
 * 2、重载参数必须不同 ， 重写参数要一模一样
 * 3、重载返回值类型可以不同，重写必须一样
 * 4、重载修饰符没有显示，重写的子类的修饰符必须高于父类
 * 5、重载对于抛出异常没有限制，重写子类抛出异常必须低于父类
 */
public class Example03 {

    public static void main(String[] args) {
        Woman w = new Woman();

        w.say();
    }

}

class Person{

    String name;
    public void say() throws NullPointerException{
        name = "人";
        System.out.println("正常讲话");
    }
}

/**
 * 重写条件：
 * 1、方法名称必须相同 ， 返回值类型也要相同
 * 2、子类抛出的异常不能超过父类相应方法抛出的异常 （子类异常不能大于父类异常）
 * 3、访问修饰符权限，子类不能低于父类
 * 4、父类中的方法若使用private、static、final任意修饰符修饰，那么，不能被子类重写。

 */
class Woman extends Person{

    /**
     * @Override : 重复方法标记注解 ， 若想在子类中的某一个方法上加上该注解，
     * 就会限制该方法一定是重写了父类的某一个方法
     */
    //@Override
    public void say(){

        super.say();

        System.out.println("我是女人，我嗓门很高..." + name);
    }
}