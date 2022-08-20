package final_;

public class Final_Exercise {
    public static void main(String[] args) {
        Circle circle = new Circle(3.6);
        System.out.println(circle.calArea());
    }
}


class Circle{
    private double radius;
    private final double PI = 3.14;

    //构造器

//    private final double PI;
    public Circle(double radius) {
        this.radius = radius;
//        PI = 3.14;
    }

    //代码块
//    {
//        PI = 3.4;
//    }
    public double calArea(){
        return PI * radius * radius;
    }
}