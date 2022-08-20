package final_;

public class FinalDetial {
    public static void main(String[] args) {
        new EE().cal();
    }
}


class AA{
    //1.定义时
    //2.构造器
    //3.代码块

    public final double TAX_RATE = 0.08;
    public final double TAX_RATE2;
    public final double TAX_RATE3;

    public AA() {
        TAX_RATE2 = 0.05;
    }

    {
        TAX_RATE3 = 3.2;
    }
}

class BB{
    //静态
    //1.定义时
    //2.静态代码块
    //3.不能用构造器
    public static final double TAX_RATE = 99;
    public static final double TAX_RATE2;

    static {
        TAX_RATE2 = 85;
    }
}


//final类不能继承，可以实例化对象
final class CC{ }
//类不是final类，含有final方法，该方法不能被重写，但可以被继承
class DD{
    public final void cal(){
        System.out.println("cal()方法");
    }
}

class EE extends DD{ }