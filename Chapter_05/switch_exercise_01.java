import java.util.Scanner;

public class switch_exercise_01 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("输入a-c");
        char A = a.next().charAt(0);
        switch (A){
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            default:
                System.out.println("other");
                break;
        }
    }
}
