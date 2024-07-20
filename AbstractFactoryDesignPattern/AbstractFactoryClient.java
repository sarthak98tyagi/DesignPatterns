public class AbstractFactoryClient {

    public static void main(String[] args) {
        VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
        Vehicle bike = twoWheelerFactory.getVehicle("Bike");
        Vehicle scooty = twoWheelerFactory.getVehicle("Scooty");
        bike.drive();
        scooty.drive();

        VehicleFactory fourWheelerFactory = new FourWheelerFactory();
        Vehicle car = fourWheelerFactory.getVehicle("Car");
        Vehicle bus = fourWheelerFactory.getVehicle("Bus");
        car.drive();
        bus.drive();
    }

}
