import java.util.Scanner;

public class Homework_04 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("输入一个整数");
        int test_num = num.nextInt();
        int bai = test_num / 100;
        int shi = (test_num - 100 * bai) / 10;
        int ge = test_num % 10;
        if(test_num == bai*bai*bai + shi*shi*shi + ge*ge*ge){
            System.out.println("是水仙花数");
        }
        else {
            System.out.println("不是水仙花数");
        }
    }
}
