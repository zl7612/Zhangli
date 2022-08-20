package abstract_;

public class Abstract_01 {
    public static void main(String[] args) {
        Fish ddd = new Fish("ddd");
        ddd.eat();
    }
}


abstract class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //没有意义，采用抽象方法
    //当一个类中存在抽象方法，该类需要声明为abstract类
//    private void eat(){
//        System.out.println("XXXXX");
//    }
    public abstract void eat();
}

class Fish extends Animal{

    public Fish(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("diaoyu");
    }
}