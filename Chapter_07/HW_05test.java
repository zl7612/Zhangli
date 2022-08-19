public class HW_05test {
    public static void main(String[] args) {
        Circle2 circle2 = new Circle2(3);
        System.out.println(circle2.area());
    }
}
class Circle2{
    double r;

    public Circle2(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double area(){
        return Math.PI * r * r;
    }
}