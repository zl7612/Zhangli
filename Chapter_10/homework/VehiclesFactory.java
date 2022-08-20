package homework;

public class VehiclesFactory {
    public static Horse getHorse(){
        return new Horse();
    }

    public static Boat getBoat(){
        return new Boat();
    }

    public static Plane getPlane(){
        return new Plane();
    }
}
