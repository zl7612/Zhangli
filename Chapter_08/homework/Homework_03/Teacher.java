package com.homework.Homework_03;

public class Teacher {
    private String name;
    private int age;
    private String post;
    private double salsry;
    private double rank;//工资级别

    public Teacher(String name, int age, String post, double salsry, double rank) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salsry = salsry;
        this.rank = rank;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalsry() {
        return salsry;
    }

    public void setSalsry(double salsry) {
        this.salsry = salsry;
    }

    public double getRank() {
        return rank;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }

    public void introduce(){
        System.out.println("name:" + name + " age:" + age + " post:" + post + " salary:" + salsry + " rank:" + rank);
    }
}
