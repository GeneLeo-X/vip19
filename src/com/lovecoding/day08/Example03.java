package com.lovecoding.day08;

public class Example03 {
    public static void main(String[] args) {
        /*Product phone =  new Phone();

        phone.work();

        Product computer = new Computer();

        computer.work();*/
        ProductFactory.product("computer").work();
    }
}

class ProductFactory {

    public static Product product(String type){
        if(type.equals("phone")) return new Phone();

        else if(type.equals("computer")) return new Computer();

        return null;
    }
}

abstract class Product {

    abstract protected void work();
}

class Phone extends Product{


    @Override
    protected void work() {
        System.out.println("手机开始工作，在打电话...");
    }
}

class Computer extends Product {

    @Override
    protected void work() {
        System.out.println("电脑开始工作，在写文件...");
    }
}