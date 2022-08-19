package com.homework.Homework_08;

public class Homework_08 {
    public static void main(String[] args) {
//        CheckingAccount checkingAccount = new CheckingAccount(1000);
//        checkingAccount.deposit(10);
//        System.out.println(checkingAccount.getBalance());
//
//        checkingAccount.withdraw(10);
//        System.out.println(checkingAccount.getBalance());

        SavingAccount savingAccount = new SavingAccount(2000, 3 , 0.01);
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());
        System.out.println(savingAccount.getCount());
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());
        System.out.println(savingAccount.getCount());
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());
        System.out.println(savingAccount.getCount());
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());
        System.out.println(savingAccount.getCount());

        savingAccount.earnMonthlyInterest();
        System.out.println(savingAccount.getBalance());
    }
}
