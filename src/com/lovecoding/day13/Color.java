package com.lovecoding.day13;

/**
 * 继承了Enum
 *
 * 序号 ： 从0开始
 *
 * 枚举是不允许重复定义的
 */
public enum Color {
    //默认调用无参的构造器
    RED("红色") , BLUE("蓝色") , YELLOW;//若有其它代码存在，则分号不能省略

    String color;
    Color(String color){
        this.color = color;
    }

    Color(){ }

    @Override
    public String toString() {
        return "Color{" +
                "color='" + color + '\'' +
                '}';
    }
}
