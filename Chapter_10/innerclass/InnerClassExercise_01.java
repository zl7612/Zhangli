package innerclass;

public class InnerClassExercise_01{
    public static void main(String[] args) {
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("XXXXX1");
            }
        });


        //传统方式：类实现IL，需要专门写一个类重写show方法

    }

    public static void f1(IL il){
        il.show();
    }
}

interface IL{
    void show();
}