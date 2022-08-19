package com.homework.Homework_05;

public class Teacher extends Employee{
    private int classday;
    private double classsal;

    public Teacher(String name, double sal) {
        super(name, sal);
    }

    public int getClassday() {
        return classday;
    }

    public void setClassday(int classday) {
        this.classday = classday;
    }

    public double getClasssal() {
        return classsal;
    }

    public void setClasssal(double classsal) {
        this.classsal = classsal;
    }

    @Override
    public void printSal() {
//        super.printSal();
        System.out.print("教师 ");
        System.out.println(getName() + "年工资是:" + (getSal() * getSalmonth() + classday * classsal));
    }
}
