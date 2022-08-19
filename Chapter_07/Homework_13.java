public class Homework_13 {
    public static void main(String[] args){
        Circ circ = new Circ(2);
        PassObject passObject = new PassObject();
        passObject.printAreas(circ , 5);
    }
}
class Circ{
    double r;
//    public Circ(){
//
//    }
    public Circ(double r){
        this.r = r;
    }
    public double findArea(){
        return Math.PI * r *r;
    }
    public void setRadius(double r){
        this.r = r;
    }
}
class PassObject{
    public void printAreas(Circ c , int times){
        System.out.println("radius\tareas");
        for(int i = 1 ; i <= times ; i++){
            c.setRadius(i);
            System.out.println(i + "\t" + c.findArea());
        }
    }
}