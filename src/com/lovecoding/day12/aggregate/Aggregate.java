package com.lovecoding.day12.aggregate;

public interface Aggregate {

    Iterator iterator();

    void add(Object e);

    Integer size();

    Object get(Integer index);


}
