package com.homework.Homework_05;


public class Homework_05 {
    public static void main(String[] args) {
        Worker jack = new Worker("jack", 5000);
        jack.setSalmonth(12);
        jack.printSal();

        Farmer tom = new Farmer("tom", 3000);
        tom.setSalmonth(8);
        tom.printSal();

        Teacher zhang = new Teacher("zhang", 7000);
        zhang.setSalmonth(12);
        zhang.setClassday(50);
        zhang.setClasssal(500);
        zhang.printSal();

        Scientist li = new Scientist("li", 4000);
        li.setSalmonth(15);
        li.setBonus(50000);
        li.printSal();
    }
}
