package com.lovecoding.day12;

public class Example07 {

    public static void main(String[] args) {
        MyRunnable4 mr4 = new MyRunnable4();
        Thread t1 = new Thread(mr4);
        t1.start();
    }


}

class MyRunnable4 implements Runnable{
    Waiter w = new Waiter();
    User user = new User();

    public MyRunnable4(){
        user.say(w);
    }
    @Override
    public void run() {
        w.say(user);
    }
}
//服务员
class Waiter {

    public synchronized void say(User user){
        System.out.println("----先吃饭，再买单---");
        user.doThing();
    }

    public synchronized void doThing() {
        System.out.println("---------OK,先买单，再吃饭----------");
    }
}

//顾客类
class User {

    public synchronized void say(Waiter w){
        System.out.println("---------先买单，再吃饭--------");
        w.doThing();
    }

    public synchronized void doThing() {

        System.out.println("---------OK，先吃饭再买单----------");
    }
}