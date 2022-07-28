package com.lovecoding.day11;


import java.util.*;

public class Example07 {

    public static void main(String[] args) {
        //hashMap();
        //hashTable();
        treeMap();
    }

    /**
     * HashMap : 数据结构 哈希表 （数组 + 链表）（jdk1.7 之前）（jdk1.7之后 引入了一种平衡二叉树（红黑树））
     * 1、当第一次使用无参构造器构造对象时，会将加载因子loadFactor置为 0.75f
     * 2、当第一次添加元素，会申请16个内存大小的数组。将一个临界值threshold = 16 * 0.75 = 12
     *    当元素添加到临界值之后，会进行resize 扩容，重新设置数组大小。数组大小扩大为原数组的二倍，
     *    同时临界值也变为原数组的二倍。
     * 3、储存顺序不能保证恒久不变 - 扩容之后会从新计算hash位置 - 数组下标
     *
     *
     *
     * 重复的key，会进行值的覆盖
     */
    private static void hashMap(){

        Map<Integer , String> map = new HashMap<>();

        map.put(2 , "jack");
        map.put(1 , "tom");
        map.put(3 , "lily");
        map.put(1 , "ben");
        map.put(4 , null);

        /**
         * 遍历map的几种方法
         */
        {
            Set<Map.Entry<Integer, String>> entrySet = map.entrySet();//将map 转变为 set
            /*方法一*/
            Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();//获得迭代器

            while (iterator.hasNext()) {

                Map.Entry<Integer, String> entry = iterator.next();

                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }

            System.out.println("--------------------");
            /*方法二
             * 通过转化的set进行foreach遍历
             * */
            entrySet.forEach(entry -> System.out.println(entry.getKey() + "->" + entry.getValue()));

            System.out.println("--------------------");
            /*方法三
             * 获得map的key set集，遍历set集的同时对map进行get(key)，获得在map中key对应的value值，实现对map的遍历操作*/
            Set<Integer> keySet = map.keySet();

            for (Integer key : keySet) {

                System.out.println(key + "->" + map.get(key));//get : 通过一个key获取对应的值
            }

            System.out.println("--------------------------");
            /*方法四(最简单、最直接的方法)
             * 直接对map进行foreach*/
            map.forEach((k, v) -> System.out.println(k + "->" + v));
        }


        System.out.println("----------------------");

        System.out.println("是否存在：" + map.containsKey(8));

        System.out.println("----------------------");

        System.out.println(map.remove(1));

        map.forEach((k , v) -> System.out.println(k + "->" + v));


        System.out.println("-----------------------");

        String str = "dhjsh";
        System.out.println(str.hashCode());

        System.out.println("---------------");

        System.out.println(15 & 736291);//相当于 num % 16 = 0 ~ 15 之间的数
    }

    /**
     * Hashtable ： 哈希表
     * 1、键与值都不可以是null
     */
    private static void hashTable(){
        Map<Integer , String> map = new Hashtable<>();

        map.put(2 , "jack");
        map.put(3 , "lily");

        map.forEach((k , v) -> System.out.println(k + "->" + v));
    }

    /**
     * 与HashMap基本一致
     *  hashMap链表是单向、双端链表 （查找更快速）
     */
    private static void linkedHashMap(){
        Map<Integer , String> map = new LinkedHashMap<>();

        map.put(2 , "jack");
        map.put(3 , "lily");

        map.forEach((k , v) -> System.out.println(k + "->" + v));
    }

    /**
     * 与TreeSet类似可以根据key值进行排序（自然顺序或者指定比较器规则）
     *
     *  key值 也不允许存null值，因为它要根据key进行比较，调用compare方法。
     */
    private static void treeMap(){
        TreeMap<Integer , String> map1 = new TreeMap<>();
        map1.put(null , "sdsds");

        map1.forEach((k , v)-> System.out.println(k + "->" + v));

        System.out.println("----------------------");

        /*TreeMap<Dog , String> map = new TreeMap<>(new DogComparator());

        map.put(new Dog(11 ,"qqq") , "关关");
        //map.put(null , "张张");
        map.put(new Dog(5 ,"wwww") , "张张");
        map.put(new Dog(3 ,"rrrr") , "刘刘");

        map.forEach((k , v)-> System.out.println(k + "->" + v));*/
    }
}
class Dog {
    int age;
    String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
class DogComparator implements Comparator<Dog>{

    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.age - o2.age;
    }
}