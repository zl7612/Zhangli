package innerclass;

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();

    }
}

class Outer02{
    private int n1 = 100;
    private void m2(){
        System.out.println("Outer02 m2");
    }
    public void m1(){
        class Inner02{//局部内部类
            public void f1(){
                System.out.println("n1=" + n1); //直接访问外部类成员
                m2();
            }
        }
        class Inner03 extends Inner02{ //内部类继承

        }
        //外部类，创建对象后使用，调用
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }


    {
        class Inner03{} //代码块内也能定义内部类
    }
}