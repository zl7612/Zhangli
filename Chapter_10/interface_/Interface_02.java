package interface_;

public class Interface_02 {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
        a.ok();

    }
}

//需要将该接口所有抽象方法实现
class A implements A_Interface{
    @Override
    public void hi() {
        System.out.println("hi().....");
    }
}