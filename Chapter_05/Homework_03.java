import java.util.Scanner;

public class Homework_03 {
    public static void main(String[] args) {
//        int year = 2022;
        Scanner num = new Scanner(System.in);
        System.out.println("输入一个整数");
        int year = num.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("是闰年");
        }
        else{
            System.out.println("不是闰年");
        }
    }
}
