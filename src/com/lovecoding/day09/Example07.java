package com.lovecoding.day09;

/**
 * 克隆 - 在原有的对象基础上，克隆一份新的一模的内容出来。
 *
 * 应用：玩游戏，相同的道具 ， 子弹、小车...
 */
public class Example07 {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.setName("小猫");
        cat.setAge(2);
        try {
            Cat cat1 = (Cat)cat.clone();//没有使用new关键字的，申请内存空间的。

            System.out.println(cat1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

/**
 * Cloneable : 标记接口，用来标记某个类是否允许被克隆
 */
class Cat implements Cloneable{//java.lang.CloneNotSupportedException

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
