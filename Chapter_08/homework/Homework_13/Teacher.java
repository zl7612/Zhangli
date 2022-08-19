package com.homework.Homework_13;

public class Teacher extends Person{
//    private String name;
//    private char gender;
//    private int age;
    private int work_age;

    public Teacher(String name, char gender, int age, int work_age) {
        super(name , gender , age);
        this.work_age = work_age;
    }


    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public void teach(){
        System.out.println(getName() + "好好教学");
    }

    @Override
    public String play() {
        return super.play() + "象棋";
    }

    public void printinfo(){
        System.out.println("老师信息");
        System.out.println(basicinfo());
        System.out.println("工作时间:" + work_age);
        teach();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Teacher{" +

                "work_age=" + work_age +
                '}' + super.toString();
    }
}
