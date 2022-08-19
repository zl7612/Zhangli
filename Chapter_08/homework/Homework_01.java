package com.homework;

public class Homework_01 {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] =new Person("jack" , 44 , "aa");
        people[1] =new Person("yjdd" , 24 , "bb");
        people[2] =new Person("ujhg" , 34 , "cc");

        for(int i = 0 ; i < people.length ; i++){
            System.out.print(people[i].getAge() + " ");
            System.out.println(people[i].toString());
        }
        //冒泡排序
        for(int i = 0 ; i < people.length-1 ; i++){
            for(int j = 0 ; j < people.length-1-i ; j++){
                Person temp = null;
                if(people[i].getAge() < people[i+1].getAge()){
                    temp = people[i];
                    people[i] = people[i+1];
                    people[i+1] = temp;

                }
            }
        }
        System.out.println();
        for(int i = 0 ; i < people.length ; i++){
            System.out.print(people[i].getAge() + " ");
            System.out.println(people[i].toString());
        }
    }
}
class Person{
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}