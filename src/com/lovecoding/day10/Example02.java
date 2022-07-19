package com.lovecoding.day10;

import java.util.*;

/**
 * Collection
 *
 *  - List
 *      - ArrayList ： 数据结构 ，动态数组
 *          调用无参的构造器，初始化一个没有容量的空数组出来。
 *           当第一次添加元素时，数组会通过grow()方法扩容到长度10。当添加元素大于10时，
 *           数组长度会自动扩容到（原数组的长度 + 原数组长度 >> 1)
 *           通常情况下为了防止过多次数组扩容，可以进行初始化容量配置。
 *           线程不安全的，适合单线程下使用。
 *           适合添加与更新操作，查询
 *      - Vector ：
 *            适合添加与更新操作，查询
 *            多线程下建议使用
 *      - LinkedList :
 *          插入与删除操作
 *          方法非线程安全的，建议单线程下使用。
 *  - Set
 *     - HashSet :
 *          数据结构 哈希表 （HashMap） ，不允许存储重复元素的，单元素可以为null
 *          。与存储顺序无关的。
 */
public class Example02 {

    public static void main(String[] args) {

        //泛型约束，该集合中仅能存某种数据类型
        List<String> list = new ArrayList<>(100);

        list.add("abc");

        //list.add(333);

        list.add("test");

        for(int i = 0 ; i < list.size() ; i++){
                System.out.println(list.get(i).toUpperCase());
        }

        System.out.println("----------删除------------");

        //System.out.println("删除的元素为 : " + list.remove(6));

        System.out.println("-----------更新元素------------");

        list.set(1 , "set方法测试");


        for(int i = 0 ; i < list.size() ; i++){
            System.out.println(list.get(i));
        }

        System.out.println("判空");

        System.out.println(list.isEmpty());

        System.out.println("---------------------");

        List<Integer> list1 = new ArrayList<>();

        list1.add(11);
        list1.add(5);
        list1.add(22);
        list1.add(5);
        list1.add(null);
        list1.add(18);

        for(int i = 0 ; i < list1.size() ; i++){
            System.out.println(list1.get(i));
        }

        System.out.println("------------------");
        for(Integer i1  : list1) {
            System.out.print(i1 + " ");
        }
        System.out.println("\n------------------");
        System.out.println(list1);
        //list1.s

        System.out.println("------------向量应用-----------");

        vector();

        System.out.println("----------LinkedList应用----------");

        linkedList();

        System.out.println("-------------hashSet------------");

        hashSet();
    }


    /**
     * Vector : 动态数组
     *   1、初始化时数组容量大小10 ， 增量0
     *   2、扩容，若增量大于0 ，扩容到 原数组长度 + 增量大小。否则 扩容到 ，原数组长度 * 2
     *   3、线程安全的，多线程下建议使用。
     *
     */
    private static void vector(){

        List<Integer> vector = new Vector<>(20 , 5);

        vector.add(11);
        vector.add(22);
        vector.add(5);
        vector.add(33);

        System.out.println(vector.size());

        System.out.println(vector);
    }

    /**
     * 数据结构：双端链表
     *  适合插入与删除操作
     */
    private static void linkedList(){

        LinkedList<String> list = new LinkedList<>();
        list.add("tom");
        list.add("lily");

        for(String str : list) {
            System.out.println(str);
        }

        System.out.println("-----------------");

        String first = list.getLast();

        System.out.println(first);

        System.out.println(list.poll());//获取并移除第一个元素

        System.out.println("--------poll--------");
        for(String str : list) {
            System.out.println(str);
        }

    }

    /**
     * HashSet
     *  - 不保证顺序恒久不变， 涉及到扩容的时候，会从新排列哈希表。
     *  - 底层使用HashMap结构。map的key值使用的是元素值，val使用的 new Object() 进行占位.
     *  - 根据HashCode值进行重复判定的。若想要达到重复的项不添加进去的话，必须保证hashCode值一致
     *  - 判定元素值：排除重复元素，是先判断hashCode是否相同，再判断equals是否相等
     */
    private static void hashSet(){

        HashSet<String> set = new HashSet();

        set.add("tom");
        System.out.println("tom".hashCode());
        set.add("lucy");
        set.add("lily");
        System.out.println("abe".hashCode());
        set.add("abe");
        System.out.println("tom".hashCode());
        set.add("tom");

        for(String s : set) {
            System.out.println(s);
        }

        System.out.println("--------------------");
        set.remove("tom");

        for(String s : set) {
            System.out.println(s);
        }

        System.out.println("--------set中存储自定义对象----------");

        HashSet<Student> hs = new HashSet<>();

        Student s1 = new Student("小王", 11);
        hs.add(s1);

        System.out.println("s1 = " +s1.hashCode());

        Student s2 = new Student("小张", 22);
        hs.add(s2);

        System.out.println("s2 = " + s2.hashCode());

        Student s3 = new Student("小王", 11);

        hs.add(new Student("小王" , 11));
        System.out.println("s3 = " + s3.hashCode());

        hs.add(new Student("小关" , 33));

        Student[] students = hs.toArray(new Student[]{});

        for(Student s : students){
            System.out.println(s);
        }

    }
}

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
