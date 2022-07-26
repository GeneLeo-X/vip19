package com.lovecoding.day12;

import java.util.ArrayList;
import java.util.List;

/**
 * 1对多 : 解决方案，把多的一方存储于集合中，放置在一的一方中。
 *
 * 多对多关系： 课程与学生
 */
public class Example02 {

    public static void main(String[] args) {
        Student s1 = new Student("A同学" , "男" , 2);

        Student s2 = new Student("B同学" , "男" , 3);

        Student s3 = new Student("C同学" , "女" , 1);

        Teacher t1 = new Teacher("张老师" , 001 , "男");

        List<Student> studentList = new ArrayList<>();
        //Collections.addAll();
        studentList.add(s1);
        studentList.add(s2);

        t1.setStudentList(studentList);

        Teacher t2 = new Teacher("艾老师" , 002, "女");

        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(s2);
        studentList1.add(s3);

        t2.setStudentList(studentList1);


        System.out.println("t1 = " + t1 + ", t2 = " + t2);

        System.out.println("--------------------------");

        Course c1 = new Course("英语" , 3);

        Course c2 = new Course("语文" , 2);


        List<CourseAndStudent> casList = new ArrayList<>();//学生选课情况说明
        CourseAndStudent cas1 = new CourseAndStudent();
        cas1.setCname("英语");
        cas1.setSname(s1.getName());
        cas1.setScore(c1.getScore());

        CourseAndStudent cas2 = new CourseAndStudent();
        cas2.setCname("英语");
        cas2.setSname(s2.getName());
        cas2.setScore(c1.getScore());

        casList.add(cas2);
        casList.add(cas1);

        casList.forEach(System.out::println);
    }
}

class Student {
    private String name;

    private String sex;

    private Integer level;//年级



    public Student(String name, String sex, Integer level) {
        this.name = name;
        this.sex = sex;
        this.level = level;
    }

    public Student() {
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

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", level=" + level +
                '}';
    }
}

class Teacher {

    private String name;

    private Integer tno;

    private String sex;

    private List<Student> studentList;

    public Teacher() {
    }

    public Teacher(String name, Integer tno, String sex) {
        this.name = name;
        this.tno = tno;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTno() {
        return tno;
    }

    public void setTno(Integer tno) {
        this.tno = tno;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", tno=" + tno +
                ", sex='" + sex + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}


class Course {

    private String name;
    private double score;//学分

    public Course() {
    }

    public Course(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

class CourseAndStudent {
    private String cname;

    private String sex;

    private Integer level;//年级

    private String sname;
    private double score;//学分

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "CourseAndStudent{" +
                "cname='" + cname + '\'' +
                ", sex='" + sex + '\'' +
                ", level=" + level +
                ", sname='" + sname + '\'' +
                ", score=" + score +
                '}';
    }
}