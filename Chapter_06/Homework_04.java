import java.util.Scanner;

public class Homework_04 {
    public static void main(String[] args) {
        int index = -1;
        int a[] = {10, 12, 45, 90};
        int a_length = a.length;
        Scanner insert = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int insert_num = insert.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (insert_num <= a[i]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            index = a.length + 1;
        }
        int b[] = new int[a.length + 1];
        int b_length = b.length;
        if (index != a.length + 1) {
            for (int i = 0; i < index; i++) {
                b[i] = a[i];
            }
            for (int i = index + 1; i < b.length; i++) {
                b[i] = a[i - 1];
            }
            b[index] = insert_num;
            for (int i = 0; i < b_length; i++) {
                System.out.print(b[i] + " ");
            }
        } else {
//            for (int i = 0; i < a.length; i++) {
//                b[i] = a[i];
//            }
//            b[b_length] = insert_num;
//            for (int i = 0; i < b.length; i++) {
//                System.out.print(b[i] + " ");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println(insert_num);
        }
    }
}
