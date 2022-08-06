import java.util.Scanner;

public class ifexercise05_qiantao {
        public static void main(String[] args){
            Scanner season = new Scanner(System.in);
            Scanner age = new Scanner(System.in);
            System.out.println("旺季1/淡季0");
            System.out.println("请输入年龄");
            int Sea = season.nextInt();
            int A = age.nextInt();
            if(Sea == 1){
                System.out.println("是旺季");
                if(A>=60){
                    System.out.println("老年，票价为20");
                }
                else if(A>=18 && A<60){
                    System.out.println("成人，票价为60");
                }
                else{
                    System.out.println("儿童，票价为30");
                }
            }
            else{
                System.out.println("是淡季");
                if(A>=18){
                    System.out.println("成人，票价为40");
                }
                else{
                    System.out.println("票价为20");
                }
            }
        }
}
