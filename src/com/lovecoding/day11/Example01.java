package com.lovecoding.day11;

import java.util.TreeSet;

public class Example01 {

    public static void main(String[] args) {
        treeSet();
    }

    /**
     * TreeSet:
     *
     *  可以根据自然顺序排序.或者给定一个比较器规则
     */
    private static void treeSet(){
        TreeSet<Integer> ts = new TreeSet();

        ts.add(44);
        ts.add(33);
        ts.add(33);
        ts.add(66);
        ts.add(11);
        ts.add(22);

        /*for(int i = 0 ; i < ts.size() ; i ++){
            System.out.println(ts.pollFirst());
        }*/
        for(Integer i : ts){
            System.out.println(i);
        }

        System.out.println("---------------------------");

        TreeSet<Student> ts1 = new TreeSet(new StudentComparator());//为TreeSet设定了排序规则

        ts1.add(new Student(33 , "关羽"));
        ts1.add(new Student(22 , "张飞"));
        ts1.add(new Student(55 , "刘备"));

        for(Student s : ts1){
            System.out.println(s);
        }
    }
}

class Student {
    private Integer age;

    private String name;

    public Student() {
    }

    public Student(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


