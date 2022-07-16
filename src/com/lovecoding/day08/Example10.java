package com.lovecoding.day08;

public class Example10 {

    public static void main(String[] args) {

        try {
            login("admin111" , "123456");
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    /**
     * 登录判断用户名与密码是否正确
     * @param username
     * @param password
     */
    private static void login(String username, String password) throws MyException {

        if("admin".equals(username) && "123456".equals(password)){
            System.out.println("用户正常，欢迎访问..");
        }else {
            throw new MyException("用户名或者密码错误!!!");
        }
    }
}
