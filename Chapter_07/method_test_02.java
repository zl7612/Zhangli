public class method_test_02 {
    //编写一个 main 方法
    public static void main(String[] args) {
        A a = new A();
        //a.sayOk();
        a.m1();
    }
}
class A {
    //同一个类中的方法调用：直接调用即可
    public void print(int n) {
        System.out.println("print()方法被调用 n=" + n);
    }
    public void sayOk() { //sayOk 调用 print(直接调用即可)
        print(10);
        System.out.println("继续执行 sayOK()~~~");
    }
    //跨类中的方法 A 类调用 B 类方法：需要通过对象名调用
    public void m1() {
        //创建 B 对象, 然后在调用方法即可
        System.out.println("m1() 方法被调用");
        B b = new B();
        b.hi();
        System.out.println("m1() 继续执行:)");
    }
}
class B {
    public void hi() {
        System.out.println("B 类中的 hi()被执行");
    }
}
