package com.lovecoding.day11;

import java.util.*;

public class Example03 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(44);
        list.add(22);
        list.add(33);

        System.out.println("------------------------");

        Iterator<Integer> iterator = list.iterator();//获取迭代器对象

        while (iterator.hasNext()){//当元素迭代完毕后，会返回false，终止循环继续执行

            Integer val = iterator.next();//获取每一个元素 ,再获取元素之后光标会移动到下一个元素上面

            System.out.print(val + " ");
        }

        System.out.println("\n------------------------");

        LinkedList<String> list1 = new LinkedList();

        list1.add("tom");
        list1.add("lily");
        list1.add("lucy");
        list1.add("jack");

        ListIterator<String> listIterator = list1.listIterator();

        while (listIterator.hasNext()){
            String val = listIterator.next();

            //System.out.println("hasPrevious :" + listIterator.hasPrevious());
            System.out.println(val);
        }

        System.out.println("----------------------");

        Vector<String> vector = new Vector();

        vector.add("tom");
        vector.add("lily");
        vector.add("lucy");
        vector.add("jack");

        Enumeration<String> elements = vector.elements();

        while (elements.hasMoreElements()){//若没有元素返回false
            String val = elements.nextElement();

            System.out.println(val);
        }
    }
}
