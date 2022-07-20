package com.lovecoding.day11;

import java.util.Comparator;

public class BirdComparator implements Comparator<Bird> {
    @Override
    public int compare(Bird b1, Bird b2) {
        return b1.getAge() - b2.getAge();
    }
}
