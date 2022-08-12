import java.util.Scanner;

public class ifexercise04 {
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        System.out.println("输入信用分：");
        int score = m.nextInt();
        if(score == 100){
            System.out.println("信用极好");
        }
        else if(score>80 && score<=99){
            System.out.println("信用优秀");
        }
        else if(score>=60 && score<=80){
            System.out.println("信用一般");
        }
        else {
            System.out.println("信用不好");
        }
    }
}
