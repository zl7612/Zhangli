package homework;

public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void Guohe(){
//        Boat boat = VehiclesFactory.getBoat();
//        boat.work();
        if(!(vehicles instanceof Boat)) {
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();
    }

    public void Common(){
        if(vehicles != null) {
            vehicles = VehiclesFactory.getHorse();
        }
        vehicles.work();
    }

    public void Fire(){
        if(vehicles != null) {
            vehicles = VehiclesFactory.getPlane();
        }
        vehicles.work();
    }
}
