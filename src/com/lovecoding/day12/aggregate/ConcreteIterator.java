package com.lovecoding.day12.aggregate;

public class ConcreteIterator implements Iterator {
    private Aggregate aggregate;

    private Integer index = 0;

    public ConcreteIterator(Aggregate aggregate){
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {
        if(index >= aggregate.size())
            return false;
        return true;
    }

    @Override
    public Object next() {
        return aggregate.get(index++);
    }
}
