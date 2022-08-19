package com.homework.Homework_04;

public class Employee {
    private String name;
    private double daysal;
    private int workdays;
    private double grade;

    public Employee(String name, double daysal, int workdays, double grade) {
        this.name = name;
        this.daysal = daysal;
        this.workdays = workdays;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaysal() {
        return daysal;
    }

    public void setDaysal(double daysal) {
        this.daysal = daysal;
    }

    public int getWorkdays() {
        return workdays;
    }

    public void setWorkdays(int workdays) {
        this.workdays = workdays;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    //打印工资方法
    public void printSalary(){
        System.out.println("工资情况是");
        System.out.println("员工" + name + "的工资为:" + daysal * workdays * grade);
    }
}
