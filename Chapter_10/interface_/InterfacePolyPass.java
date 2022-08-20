package interface_;

public class InterfacePolyPass {
    public static void main(String[] args) {
        IG ig = new Teacher();//接口类型的变量可以指向，实现了该接口的类的对象实例
        IH ih = new Teacher();//IG继承IH,Teacher实现了IG，Teacher也实现了IH
    }
}


interface IH{

}
interface IG extends IH{

}

class Teacher implements IG{

}