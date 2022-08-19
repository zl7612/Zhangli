package com.homework.Homework_03;

public class Ass_Professor extends Teacher{
    public Ass_Professor(String name, int age, String post, double salsry, double rank) {
        super(name, age, post, salsry, rank);
    }

    @Override
    public void introduce() {
        System.out.println("这是副教授信息");
        super.introduce();
    }
}
