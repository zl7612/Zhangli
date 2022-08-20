package innerclass;

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.m1();


        //外部其他类使用静态内部类
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();
    }
}

class Outer10{
    private int n1 = 10;
    private static String name = "XX";
    private static void cry(){}
    //Inner10静态内部类
    static class Inner10{
        public void say(){
            System.out.println(name);//n1报错
            cry();
        }
    }

    public void m1(){
        Inner10 inner10 = new Inner10();
        inner10.say();
    }
}