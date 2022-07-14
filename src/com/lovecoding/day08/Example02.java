package com.lovecoding.day08;

/**
 * Object :
 *
 * clone()  : 复制一个对象出来。 - 之后讲解应用
 *
 * equals方法在非空对象引用上实现等价关系：
 *      自反性 ： x.equals(x) 永真  ，x非空
 *      对称的 :  x.equals(y) 成立，y.equals(x) 一定成立
 *      传递性 : x.equals(y)成立并且 y.equals(z) 成立，那么 x.equals(z) 一定成立
 *      一致性 : x.equals(y) 的结果，在没有人为干涉的情况下，始终不变。
 *
 * finalize()  : GC机制主动调用的，当认为某个对象为垃圾空间的时候。主动调用该方法释放对象、
 * final : 关键字
 * finally ： 异常里面使用的。
 * getClass()  - 反射时，或者类信息使用
 *
 * toString()  - 返回串
 *
 * 在打印对象的时候，默认执行Object中的toString()方法
 */
public class Example02 {

    public static void main(String[] args) {
        ObjTest ot = new ObjTest();

        System.out.println(ot.equals(ot));

        System.out.println("-----------------------");

        Student s1 = new Student("小王" , 11 , 2001002);
        Student s2 = new Student("小王" , 11 , 2001001);

        System.out.println(s1.equals(s2));

        System.out.println("-------------------");

        String s3 = new String("abcde");

        String s4 = new String("abcde");

        System.out.println(s3.equals(s4));

        System.out.println("-----------------------");

        System.out.println(s2.getClass());

        System.out.println(s4.hashCode());//int 类型串
        System.out.println(s3.hashCode());

        System.out.println(s1);
    }
}

class ObjTest{}

class Student{

    private String name;
    private int age;
    private int sno;

    public Student() {
    }

    public Student(String name, int age, int sno) {
        this.name = name;
        this.age = age;
        this.sno = sno;
    }

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

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }


    @Override
    public boolean equals(Object obj) {

        if(this == obj)
            return true;
        if(obj instanceof Student){
            Student s = (Student) obj;

            if(!this.getName().equals(s.getName())) return false;//调用的字符串的equals方法
            else if(this.getAge() != s.getAge()) return false;
            else if(this.getSno() != s.getSno()) return false;

            return true;
        }


        return false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sno=" + sno +
                '}';
    }
}