package homework;

public class Homework_04 {
    public static void main(String[] args) {
        cellphone cellphone = new cellphone();
        cellphone.testwork(new Calculate() {
            @Override
            public double work(double n1, double n2) {
                return n1 - n2;
            }
        } , 58 , 62);
    }
}

interface Calculate{
    public double work(double n1 , double n2);
}

class cellphone{
    public void testwork(Calculate calculate , double n1 , double n2){
        double res = calculate.work(n1 , n2);
        System.out.println("计算结果为" + res);
    }
}