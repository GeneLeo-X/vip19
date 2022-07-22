package com.lovecoding.day12;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Example01 {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("tom");

        queue.add("lily");

        //System.out.println(queue.peek());//查看队列的头元素，不会删除

        System.out.println(queue.poll());//获取元素，并从队列中移除
        System.out.println("---------------------");
        for(String s : queue){
            System.out.println(s);
        }


        System.out.println("---------------------");

        Deque<Integer> deque = new LinkedList<>();
        deque.add(11);

        deque.add(22);

        deque.add(33);

        //System.out.println(deque.getLast());//出口两端，也就是可以获取先进入队列或者后进入队列的

        deque.pollLast();
        Iterator<Integer> iterator = deque.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
