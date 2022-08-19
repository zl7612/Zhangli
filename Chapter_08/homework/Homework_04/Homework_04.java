package com.homework.Homework_04;

public class Homework_04 {
    public static void main(String[] args) {
        Manager zhang = new Manager("zhang", 100, 25, 1.2);
        zhang.setBonus(5000);
        zhang.printSalary();

        Worker li = new Worker("li", 80, 25, 1.0);
        li.printSalary();
    }
}
