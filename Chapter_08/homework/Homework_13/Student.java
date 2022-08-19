package com.homework.Homework_13;

public class Student extends Person{
//    private String name;
//    private char gender;
//    private int age;
    private String stu_num;

    public Student(String name, char gender, int age, String stu_num) {
        super(name , gender , age);
        this.stu_num = stu_num;
    }



    public String getStu_num() {
        return stu_num;
    }

    public void setStu_num(String stu_num) {
        this.stu_num = stu_num;
    }

    public void study(){
        System.out.println(getName() + "好好学习");
    }

    @Override
    public String play() {
        return super.play() + "足球";
    }


    public void printinfo(){
        System.out.println("学生信息");
        System.out.println(basicinfo());
        System.out.println("学号:" + stu_num);
        study();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Student{" +

                "stu_num='" + stu_num + '\'' +
                '}' + super.toString();
    }
}
