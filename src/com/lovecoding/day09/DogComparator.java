package com.lovecoding.day09;

import java.util.Comparator;

/**
 * <Dog> : 泛型操作，限制操作的对象类型
 *
 * 自定义比较器类：Java OO原则，对修改关闭，对扩展开放
 */
public class DogComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog d1, Dog d2) {
        return (int)(d1.getMonth() - d2.getMonth());
    }
}
