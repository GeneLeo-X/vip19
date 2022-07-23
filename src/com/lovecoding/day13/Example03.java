package com.lovecoding.day13;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Example03 {

    public static void main(String[] args) throws ClassNotFoundException {
        Dog dog = new Dog("旺财" , 1 , 0);
        //第一种
        Class dogClass = dog.getClass();

        //第二种
        Class dogClass1 = Dog.class;

        //第三种
        Class aClass = Class.forName("com.lovecoding.day13.Dog");

        System.out.println(dogClass == dogClass1);

        System.out.println("-----------------");
        method();

        System.out.println("---------反射调用类中方法----------");

        method1();

        Class<? extends Dog> aClass1 = dog.getClass();
    }

    private static void method(){
        Class dogClass = Dog.class;

        try {
            //反射帮们创建对象
            Dog dog = (Dog)dogClass.newInstance();//实例化、转换都可能发生异常 ,可以不使用new关键词进行对象创建了

            System.out.println(dog);

            System.out.println("---------使用带参数的构造器反射实例化对象--------");

            //所有的对象都具备Class类，8种基本数据类型 。void
            Constructor constructor = dogClass.getConstructor(String.class, Integer.class, int.class);

            Dog dog2 = (Dog)constructor.newInstance("小黄", 2, 1);

            System.out.println("dog2 = " + dog2);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    private static void method1(){
        Dog dog = new Dog();
        Class dogClass = dog.getClass();

        Method[] methods = dogClass.getMethods();

        for (Method method : methods){
            System.out.println(method.getName() + "-" + method.getParameterCount());
        }

        System.out.println("------------------");

        Method[] declaredMethods = dogClass.getDeclaredMethods();

        for (Method method : declaredMethods){
            System.out.println(method.getName() + "-" + method.getParameterCount());

            if(method.getName().equals("eat")){//访问的私有eat方法
                try {
                    method.setAccessible(true);//私有eat方法，反射调用时可见
                    method.invoke(dog , "骨头");//若为私有访问报 java.lang.IllegalAccessException:
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Dog {
    private String name;

    Integer age;

    int sno;

    private void eat(String thing){

        System.out.println("私有的eat方法被调用..." + "吃" + thing);
    }

    public Dog() {
    }

    public Dog(String name, Integer age, int sno) {
        this.name = name;
        this.age = age;
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sno=" + sno +
                '}';
    }
}
