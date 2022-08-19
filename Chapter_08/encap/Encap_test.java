package com.encap;

public class Encap_test {
    public static void main(String[] args) {
        Person person = new Person();
//        person.name = "jack";
        person.setName("jack");
        person.setAge(30);
        person.setSalary(30000);
        System.out.println(person.info());

    }
}
class Person{
    public String name;
    private int age;
    private double salary;

    //set和get快捷键 alt+insert
//    public void setName(String name){
//        this.name = name;
//    }
//    public String getName(){
//        return name;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        }else {
            System.out.println("姓名需要控制在2-6字符");
            this.name = "无名人";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 1 && age <= 120) {
            this.age = age;
        }else {
            System.out.println("年龄需要在1-120");
            this.age = 18;//给一个默认年龄
        }
    }

    public double getSalary() {
            return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //写一个方法，返回属性信息
    public String info(){
        return "信息为 name=" + name + " age=" + age + " salary=" + salary;
    }
}