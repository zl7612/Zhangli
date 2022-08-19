import java.util.Scanner;

public class method_test {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.speak();//调用方法
        p1.cal01();
        p1.cal02(100);
        int returnRes = p1.getSum(2,3);
        System.out.println("returnRes = " + returnRes);
    }
}

class Person{
    String name;
    int age;
    //public代表方法公开
    //void表示方法没有返回值
    //speak方法名，（）形参列表
    //{}方法体
    public void speak(){
        System.out.println("我是一个好人");
    }
    public void cal01(){
        int sum = 0;
        for(int i = 1 ; i <= 1000 ; i++){
            sum += i;
        }
        System.out.println("计算结果为" + sum);
    }
    public void cal02(int n){
        int sum = 0;
        for(int i = 1 ; i <= n ; i++){
            sum += i;
        }
        System.out.println("计算结果为" + sum);
    }
    public int getSum(int num1, int num2){
        int res = num1 + num2;
        return res;
    }
}