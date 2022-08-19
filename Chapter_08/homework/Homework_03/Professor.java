package com.homework.Homework_03;

public class Professor extends Teacher{
    public Professor(String name, int age, String post, double salsry, double rank) {
        super(name, age, post, salsry, rank);
    }


    @Override
    public void introduce() {
        System.out.println("这是教授的信息");
        super.introduce();
    }


}
