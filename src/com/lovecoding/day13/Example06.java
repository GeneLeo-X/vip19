package com.lovecoding.day13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example06 {

    public static void main(String[] args) {

        Node<String> node = new Node<>("array");

        System.out.println(node.getData());

        System.out.println("-----------------");

        Node<Integer> n1 = new Node<>(33);

        Node<Number> n2 = new Node<>(55);

        Integer i1 = 15;
        Number n3 = 22;

        method(node);

        method1(n1);

        method2(n1);

        System.out.println("----------------------");

        printMsg(11,"hdghs" , new Dog() , new Node<>(555));

        Integer[] arr = {22,33,44,55};

        String[] arr1 = {"dsh","dhjhu","tom","lily"};

        System.out.println(Arrays.toString(func(arr1 , 2 , 3)));

        System.out.println("-------------泛型嵌套-------------");

        Map<String , String> map = new HashMap<>();

        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        entrySet.forEach(entry -> System.out.println(entry.getKey() + "->" + entry.getValue()));


    }

    /**
     * ? : 通配符，泛型任意
     * @param node
     */
    private static void method(Node<?> node){
        System.out.println(node.getData());
    }

    /**
     * 泛型范围：Number及其子类  类型作为上限
     * @param node
     */
    private static void method1(Node<? extends Number> node){
        System.out.println(node.getData());
    }

    /**
     * Integer及其父类 : 泛型里面类型下限
     * @param node
     */
    private static void method2(Node<? super Integer> node){
        System.out.println(node.getData());
    }

    /**
     * 泛型方法应用
     * @param args
     * @param <T>
     */
    public static  <T> void printMsg( T... args){
        for(T t : args){
            System.out.println("t is " + t);
        }
    }

    /**
     * 任意数组类型 中的两个位置值都可以做到互换
     * @param array
     * @param i
     * @param t
     * @param <T>
     * @return
     */
    public static <T> T[] func(T[] array,int i,int t){
        T temp = array[i];
        array[i] = array[t];
        array[t] = temp;
        return array;
    }


}

/**
 * T不是强制
 *   T - type E  - element  K - key  V - value  - 通常定义泛型规定的字符
 * @param
 */
class Node<T> {
    T data;

    public Node(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

interface Shopping<T>{

    T getData();
}