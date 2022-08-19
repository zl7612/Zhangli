package com.homework.Homework_05;

public class Farmer extends Employee{
    public Farmer(String name, double sal) {
        super(name, sal);
    }

    @Override
    public void printSal() {
        System.out.print("农民 ");
        super.printSal();
    }
}
