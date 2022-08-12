import java.util.Scanner;

public class multiple_exercise_01 {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        double totalscore = 0;
        int pass = 0;
        for (int j = 1; j <= 3; j++) {
            double sum = 0;
            for (int i = 1; i <= 5; i++) {
                System.out.println("输入第"+j+"个班第"+i+"个学生成绩");
                double score = myscanner.nextDouble();
                if(score>=60){
                    pass++;
                }
                sum += score;
                System.out.println("成绩为" + score);
            }
            totalscore += sum;
            System.out.println("sum=" + sum + "平均=" + (sum / 5));
        }
        System.out.println("三个班的总分为"+totalscore+"三个班的平均分为"+(totalscore/15));
        System.out.println("及格人数为"+pass);
    }
}
