import java.util.Scanner;

public class Homework_02 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("输入一个整数");
        int num_int = num.nextInt();
        if(num_int > 0){
            System.out.println("大于0");
        }
        else if(num_int < 0){
            System.out.println("小于0");
        }
        else {
            System.out.println("等于0");
        }

    }
}
