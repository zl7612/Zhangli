public class Homework_05 {
    public static void main(String[] args){
//        Circle circle = new Circle(2);
//        System.out.println("面积=" + circle.area());
//        System.out.println("周长=" + circle.len());

        Circle circle = new Circle();
        System.out.println("面积=" + circle.area(2));
        System.out.println("周长=" + circle.len(2));

    }
}
class Circle{
    double radius;
//    public Circle(double radius){
//        this.radius = radius;
//    }
//    public double area(){
//        return Math.PI * radius * radius;
//    }
//    public double len(){
//        return 2 * Math.PI * radius;
//    }
      public double area(double radius){
          return Math.PI * radius * radius;
}
      public double len(double radius){
          return 2 * Math.PI * radius;
    }
}

//0254