package com.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    //1.先完成显示菜单
    //2.完成零钱通明细
    //3.完成收益入账
    //4.完成消费

    public static void main(String[] args) {
        //定义相关变量
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";

        //2.完成零钱通明细
        String details = "--------------零钱通明细--------------";

        //3.完成收益入账
        double money = 0;
        double balance = 0;
        Date date = null;//date表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        //4.完成消费
        String note = "";

        do{
            System.out.println("\n==============零钱通菜单==============");
            System.out.println("\t\t\t1.零钱通明细");
            System.out.println("\t\t\t2.收益入账");
            System.out.println("\t\t\t3.消费");
            System.out.println("\t\t\t4.退出");
            System.out.println("==============零钱通菜单==============");

            System.out.println("请选择(1-4):");
            key = scanner.next();

            //使用switch分支控制
            switch (key){
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("收益入账金额:");
                    money = scanner.nextDouble();
                    //money的值范围校验
                    balance += money;
                    //拼接收益入账信息到details
                    date = new Date();//获取当前日期
//                    System.out.println(sdf.format(date));
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "3":
                    System.out.println("消费金额：");
                    money = scanner.nextDouble();
                    //money的值范围校验
                    System.out.println("消费说明：");
                    note = scanner.next();
                    balance -= money;
                    //拼接消费入账信息到details
                    date = new Date();//获取当前日期
//                    System.out.println(sdf.format(date));
                    details += "\n" + note + "\t-" +money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4":
                    System.out.println("4.退出系统");

                    String choice = "";
                    while (true){
                        System.out.println("确定退出？ y/n");
                        choice = scanner.next();
                        if("y".equals(choice) || "n".equals(choice)){
                            break;
                        }
                    }
                    if(choice.equals("y")) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }

        }while(loop);

        System.out.println("-----退出了零钱通系统-----");
    }
}
