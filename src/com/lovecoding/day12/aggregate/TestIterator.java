package com.lovecoding.day12.aggregate;

public class TestIterator {

    public static void main(String[] args) {

        Aggregate agg = new ConcreteAggregate();

        agg.add("tom");
        agg.add("lily");
        agg.add(4365);

        System.out.println(agg.size());

        Iterator iterator = agg.iterator();

        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }
    }
}
