package com.lovecoding.day06;

/**
 * 英雄与兵器产生关系（一对一）
 * 1、单向绑定 -- 推荐
 * 2、双向绑定
 *
 */
public class Example04 {

    public static void main(String[] args) {
        Weapon w = new Weapon();
        w.setNo(3);
        w.setName("方天画戟");
        w.setColor("绿色");

        Hero hero = new Hero();

        hero.setName("吕布");
        hero.setAge(100);
        hero.setNo(1);

        hero.setWeapon(w);

        w.setHero(hero);

        System.out.println(hero.toString());

        //从任何一方都可以获取到绑定的内容
        System.out.println("兵器出发:" + "，名称为 : " + w.getName() + "，兵器排名为: " + w.getNo() +
          ",兵器属于: "+ w.getHero().getName());
    }
}

class Hero{

    private String name;

    private int age;

    private int no;//排名

    private Weapon weapon;

    private String country;//国家

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", no=" + no +
                ", weapon=" + weapon +
                ", country='" + country + '\'' +
                '}';
    }
}

/**
 * 兵器类
 */
class Weapon{

    private String name;

    private String color;

    private int no;

    private Hero hero;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }


}