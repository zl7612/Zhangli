package interface_;

public interface A_Interface {
    //写属性
    public int n1 = 10;
    //写方法，在接口中，抽象方法可以省略abstract关键字
    public void hi();//抽象方法
    //jdk8之后，可以有默认方法，需要使用default关键字修饰
    default public void ok(){
        System.out.println("ok...");
    }
    //jdk8之后，有静态方法
    public static void cry(){
        System.out.println("cry()...");
    }
}
