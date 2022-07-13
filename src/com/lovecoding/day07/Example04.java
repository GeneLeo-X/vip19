package com.lovecoding.day07;

import java.util.Arrays;

public class Example04 {

    public static void main(String[] args) {
       /* CosmeticManager cm = new CosmeticManager();
        cm.add(new Cosmetic("大宝SOD密" , "国产" , 33.5));

        cm.add(new Cosmetic("雅诗兰黛" , "进口" , 80));

        cm.add(new Cosmetic("六神" , "国产" , 11));
        cm.printInfo();*/

        System.out.println("--------------------");

        SortManager sm = new SortManager();
        sm.add(new Cosmetic("大宝SOD密" , "国产" , 33.5));

        sm.add(new Cosmetic("雅诗兰黛" , "进口" , 80));

        sm.add(new Cosmetic("六神" , "国产" , 11));
        sm.printInfo();
    }
}

class SortManager extends CosmeticManager{

    @Override
    protected void printInfo() {

        Cosmetic[] cosmeticsNew = Arrays.copyOf(this.cosmetics, cosmetics.length);//定义临时用来排序化妆品数组

        for(int i = 0 ; i < count ; i++ ){
            int minIndex = i;

            for(int j = i; j < count ; j++){

                if(cosmeticsNew[j].getPrice() < cosmeticsNew[minIndex].getPrice()){
                    minIndex = j;
                }
            }

            if(minIndex != i){
                Cosmetic temp = cosmeticsNew[i];
                cosmeticsNew[i] = cosmeticsNew[minIndex];
                cosmeticsNew[minIndex] = temp;
            }
        }

        for(int i = 0 ; i < count ; i++)
            System.out.println(cosmeticsNew[i]);
    }
}

class CosmeticManager{
    protected Cosmetic[] cosmetics = new Cosmetic[5];
    protected int count = 0;
    protected void add(Cosmetic cosmetic){
        if(count == cosmetics.length)
            cosmetics = Arrays.copyOf(cosmetics , cosmetics.length << 1);

        cosmetics[count ++] = cosmetic;
    }

    protected void printInfo(){

        for(int i = 0 ; i < count ; i++)
            System.out.println(cosmetics[i]);
    }

}

class Cosmetic{
    private String name;

    private String type;//国产、进口

    private double price;

    public Cosmetic() {
    }

    public Cosmetic(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cosmetic{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}