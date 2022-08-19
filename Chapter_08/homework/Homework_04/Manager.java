package com.homework.Homework_04;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double daysal, int workdays, double grade) {
        super(name, daysal, workdays, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSalary() {
        System.out.println("经理" + getName() + "的工资为" + (bonus + getDaysal() * getWorkdays() * getGrade()));
//        super.printSalary();
    }
}
