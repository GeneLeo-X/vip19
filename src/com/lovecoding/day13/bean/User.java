package com.lovecoding.day13.bean;

/**
 * JavaBean类：默认放在固定的包下面，bean  pojo dto vo domain 等
 *
 * 属性与前端传递的参数保持一致、与数据库或文件中的字段保持一致
 */
public class User {

    private String name;

    private Integer age;

    private String email;

    private boolean flag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", flag=" + flag +
                '}';
    }
}
