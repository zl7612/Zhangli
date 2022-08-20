package innerclass;

public class AnonymousInnerCla {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}
class Outer04{
    private int n1 = 10;
    public void method(){
        //接口
        //传统方式：写一个类，实现该接口并创建对象
//        Tiger tiger = new Tiger();
//        tiger.cry();
        //使用匿名内部类
        IA tiger = new IA(){
            @Override
            public void cry() {
                System.out.println("老虎叫唤");
            }
        };
        tiger.cry();


        //基于类的匿名内部类
        Father father = new Father("jack"){
            @Override
            public void test() {
                System.out.println("匿名内部类重写了tset");
            }
        };
        System.out.println("father运行类型" + father.getClass());
        father.test();


    }
}

interface IA {
    public void cry();
}

//class Tiger implements IA{ //只用一次，定义啰嗦，复杂
//    @Override
//    public void cry() {
//        System.out.println("老虎叫");
//    }
//}

class Father{
    public Father(String name){
    }
    public void test(){

    }
}