package static_;

public class ChildGame {
    public static void main(String[] args) {
//        int conut = 0;
        Child child1 = new Child("01");
        child1.join();
//        conut++;
        child1.count++;
        Child child2 = new Child("02");
        child2.join();
        child2.count++;
        Child child3 = new Child("03");
        child3.join();
        child3.count++;

        System.out.println("共有" + Child.count);
    }
}
class Child{
    private String name;
    //定义一个类变量
    public static int count = 0;//该变量被child类所有实例对象共享
    public Child(String name){
        this.name = name;
    }
    public void join(){
        System.out.println(name + "加入");
    }
}