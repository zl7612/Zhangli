package single;

public class SingleTon_01 {
    public static void main(String[] args) {
        GireFriend instance = GireFriend.getInstance();
        System.out.println(instance);
    }
}



//有一个类GireFriend
//只能有一个女朋友

class GireFriend{
    private String name;

    //如何保证只能创建一个GireFriend对象
    //单例模式-饿汉式
    //1.将构造器私有化
    //2.在类的内部直接创建
    //3.提供一个公共的静态方法

    private static GireFriend gf = new GireFriend("xxx");//为了能在静态方法中使用gf对象，修饰static

    private GireFriend(String name) {
        this.name = name;
    }

    public static GireFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GireFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}