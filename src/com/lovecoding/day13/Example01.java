package com.lovecoding.day13;

public class Example01 {

    public static void main(String[] args) {
        Food food = new Food();

        Producer producer = new Producer(food);

        Thread t1 = new Thread(producer);
        t1.start();

        Consumer consumer = new Consumer(food);
        Thread t2 = new Thread(consumer);
        t2.start();

    }
}


class Producer implements Runnable{

    private Food food;

    public Producer(Food food){
        this.food = food;
    }


    @Override
    public void run() {
        for(int i = 0 ; i < 20 ; i++){//做菜
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i % 2 == 0)
                food.productFoot("酸菜鱼" , "酸甜口味，很好吃...");
            else food.productFoot("水煮肉片" , "麻辣口味，很下饭...");
        }
    }
}

class Consumer implements Runnable {

    private Food food;

    public Consumer(Food food){
        this.food = food;
    }
    @Override
    public void run() {
        for(int i = 0 ; i < 20 ; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            food.consumer();
        }
    }
}

/**
 * 标志位：flag - true代表允许消费 ， false - 生产
 */
class Food {

    private String name;

    private String desc;

    private boolean flag;//false

    public Food() {
    }

    public Food(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    /**
     * 生产食物
     * synchronized : 保证数据一致性
     * @param name
     * @param desc
     */
    public synchronized void productFoot(String name, String desc) {

        if(flag) {//要进行消费
            try {
                this.wait(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name = name;
        this.desc = desc;
        flag = true;//通知消费

        this.notifyAll();//唤醒等待线程
    }

    public synchronized void consumer() {
        if(!flag){//要进行生产
            try {
                this.wait(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("consumer name = " + name + " , desc = " + desc);
        flag = false;//通知生产

        this.notifyAll();//唤醒等待线程
    }
}