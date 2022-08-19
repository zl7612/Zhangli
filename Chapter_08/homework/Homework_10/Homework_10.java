package com.homework.Homework_10;

public class Homework_10 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("jack", 20, "ss", 'n', 200000);
        Doctor doctor2 = new Doctor("jack", 20, "ss", 'n', 200000);

        System.out.println(doctor1.equals(doctor2));
    }
}
