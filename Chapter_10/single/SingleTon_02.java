package single;


//单例模式-懒汉式
public class SingleTon_02 {
    public static void main(String[] args) {
        Cat instance = Cat.getInstance();
        System.out.println(instance);
    }
}


class Cat{
    private String name;

    //步骤
    //1.构造器私有化
    //2.定义一个静态属性对象
    private static Cat cat;
    //3.提供一个public的static方法，可以返回一个Cat对象


    private Cat(String name){
        System.out.println("构造器被调用");
        this.name = name;
    }
    public static Cat getInstance(){

        if(cat == null){
            cat = new Cat("xxx");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
