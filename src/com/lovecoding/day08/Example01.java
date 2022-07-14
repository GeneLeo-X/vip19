package com.lovecoding.day08;


public class Example01 {

    public static void main(String[] args) {
        BaseManager bm = new UserManager();

        bm.check("test" , "add");
    }
}


abstract class BaseManager {

    public void check(String username , String desc){//校验
        if(username.equals("admin")){
            execute(desc);
        }else{
            System.out.println("您登陆的账户没有操作权限!!!");
        }
    }

    abstract protected void execute(String desc);
}

class UserManager extends BaseManager{

    @Override
    protected void execute(String desc) {
        if(desc.equals("add"))
            System.out.println("真正执行添加用户的操作");
        else if(desc.equals("delete"))
            System.out.println("真正执行删除用户的操作");
    }
}