package com.homework.Homework_05;

public class Employee {
    private String name;
    private double sal;
    private int salmonth = 12;

    public Employee(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getSalmonth() {
        return salmonth;
    }

    public void setSalmonth(int salmonth) {
        this.salmonth = salmonth;
    }

    public void printSal(){
        System.out.println(name + "年工资是:" + (sal * salmonth));
    }
}
