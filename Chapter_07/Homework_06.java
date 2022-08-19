import java.util.Scanner;

public class Homework_06 {
    public static void main(String[] args){
        Scanner first = new Scanner(System.in);
        System.out.println("输入第一个数");
        double n1 = first.nextDouble();
        Scanner second = new Scanner(System.in);
        System.out.println("输入第二个数");
        double n2 = second.nextDouble();

        Cale cale = new Cale(n1,n2);
        System.out.println("和=" + cale.sum());
        System.out.println("差=" + cale.minus());
        System.out.println("乘积=" + cale.mul());
        System.out.println("商=" + cale.div());

//        double n1 = 4.2;
//        double n2 = 5.6;
//        Cale cale = new Cale();
//        cale.sum(n1 , n2)

    }
}
class Cale{
    double num1;
    double num2;
    public Cale(double num1 , double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public double sum(){
        return num1 + num2;
    }
    public double minus(){
        return num1 - num2;
    }
    public double mul(){
        return num1 * num2;
    }
    public Double div(){
        if(num2 == 0){
            return null;
        }
        else {
            return num1/num2;
        }

    }
}