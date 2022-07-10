package com.lovecoding.day06;

import java.util.Arrays;

public class Example09 {

    public static void main(String[] args) {

        ChickenManager cm = new ChickenManager();

        cm.add(new Chicken(1 , "小花" , "公" , 3 , "花色"));//匿名创建对象
        cm.add(new Chicken(2 , "小白" , "母" , 5 , "白色"));
        cm.add(new Chicken(3 , "小黑" , "公" , 1 , "黑色"));
        cm.add(new Chicken(4 , "小黄" , "母" , 6 , "黄色"));
        cm.add(new Chicken(5 , "小花11" , "公" , 5 , "花色11"));
        cm.add(new Chicken(6, "小花22" , "公" , 2 , "花色22"));

        cm.printAll();

        System.out.println("----------------------");

        cm.update(new Chicken(2 , "新小白" , "母" , 8 , "黑白花色"));

        cm.printAll();

        System.out.println("----------------------");

        cm.delete(2);

        cm.printAll();

        System.out.println("-----------------------");

        System.out.println(cm.getChickenByCno(2));
    }
}

/**
 * 鸡舍管理：
 *
 * 增、删、改、查
 *
 * CURD
 */
class ChickenManager{
    private Chicken[] chickens = new Chicken[5];//初始化5个容量大小

    private int count;
    /**
     * 添加一只鸡
     * @param ck
     */
    public void add(Chicken ck){
        //进行鸡舍扩容处理 Arrays.copyof();
        if(count == chickens.length)
            chickens = Arrays.copyOf(chickens , chickens.length << 1);//扩容之后需要再次赋值
        chickens[count++] = ck;
    }

    /**
     * 查看、打印鸡舍中所有鸡的信息
     */
    public void printAll(){
        for(Chicken c : chickens){

            if(c != null)
                System.out.println(c);
            //c.printInfo();
        }
        /*for(int i = 0 ; i < chickens.length ; i ++){
            System.out.println(chickens[i]);
        }*/
    }


    /**
     * 根据传递过来的小鸡信息，修改掉原来鸡舍中的鸡的信息
     * @param newChicken
     */
    public void update(Chicken newChicken){
        for(Chicken c : chickens){
            if(c != null){
                if(newChicken.getCno() == c.getCno()){
                    //c = newChicken;
                    c.setCno(newChicken.getCno());
                    c.setName(newChicken.getName());
                    c.setMonth(newChicken.getMonth());
                    c.setColor(newChicken.getColor());
                }
            }
        }
        /*for(int i = 0 ; i < count ; i ++){
            if(chickens[i].getCno() == newChicken.getCno())
                chickens[i] = newChicken;
        }*/
    }

    /**
     * 删除一只鸡
     */
    public void delete(int cno){//根据编号删除一只鸡
        for(int i = 0 ; i < count ; i ++){
            if(chickens[i].getCno() == cno){

                for(int j = i + 1 ; j < count ; j++){
                    chickens[j - 1] = chickens[j];
                }
            }
        }
        chickens[--count] = null;//数组的下标位置是count - 1
    }

    /**
     * 根据编号获取一只鸡
     * @return
     */
    public Chicken getChickenByCno(int cno){
        for(Chicken c : chickens){
            if(null != c && c.getCno() == cno) return c;
        }
        return null;
    }
}

/**
 * 鸡类
 */
class Chicken{

    private int cno;//小鸡号码牌 - 唯一标识

    private String name;

    private String sex;

    private int month;

    private String color;

    public Chicken() {
    }

    public Chicken(int cno , String name, String sex, int month, String color) {
        this.name = name;
        this.sex = sex;
        this.month = month;
        this.color = color;
        this.cno = cno;
    }

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void printInfo(){

        System.out.println("name = " + this.name + " , month = " + this.month);
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", month=" + month +
                ", color='" + color + '\'' +
                '}';
    }
}