package homework;

import javax.xml.namespace.QName;

public class Homework_05 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();
    }
}


class A{
    private String name = "hello";
    public void f1(){
        class B{
            private final String NAME = "kk";
            public void show(){
                System.out.println("name = " + NAME + " 外部类 = " + name);
            }
        }
        B b = new B();
        b.show();
    }
}