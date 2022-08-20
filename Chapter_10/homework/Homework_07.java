package homework;

public class Homework_07 {
    public static void main(String[] args) {
        Car car = new Car(56);
        car.getAir().flow();
        Car car1 = new Car(14);
        car1.getAir().flow();
        Car car2 = new Car(-85);
        car2.getAir().flow();
    }
}

class Car{
    private double tem;

    public Car(double tem) {
        this.tem = tem;
    }

    class Air{
        public void flow(){
            if(tem > 40){
                System.out.println("吹冷气");
            }else if(tem < 0){
                System.out.println("吹暖气");
            }else {
                System.out.println("不开空调");
            }
        }
    }
    public Air getAir(){
        return new Air();
    }
}