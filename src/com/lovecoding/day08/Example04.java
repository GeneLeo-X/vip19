package com.lovecoding.day08;

public class Example04 {

    public static void main(String[] args) {
        Action actor = new Actor();
        Proxy proxy = new Proxy(actor);

        proxy.action();
    }
}

class Proxy implements Action {

    private Action at;

    public Proxy(Action at){
        this.at = at;
    }

    @Override
    public void action() {
        System.out.println("经纪人签约，谈片酬等....");

        at.action();

        System.out.println("收钱...");
    }
}

interface Action {

    void action();
}

/**
 * 演员类
 */
class Actor implements Action{


    @Override
    public void action() {
        System.out.println("我是演员，我正在演戏....");
    }
}