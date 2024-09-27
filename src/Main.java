public class Main {
    public static void main(String[] args) {
        Passenger car1 = new Passenger();
        car1.sayMyNameAndWeight();

        Truck car2 = new Truck();
        car2.sayMyNameAndWeight();

        Passenger car3 = new Passenger("Car1");

        car3.sayMyNameAndWeight();
        car3.wash();
        car3.getDirty();
        car3.wash();

        Truck car4 = new Truck("Car1");

        car4.setName("Truck");
        car4.sayMyNameAndWeight();
        car4.wash();
        car4.load();
        car4.wash();
        car4.sayMyNameAndWeight();
        car4.unload();
        car4.wash();

        Passenger.printType();
        Truck.printType();

    }
}