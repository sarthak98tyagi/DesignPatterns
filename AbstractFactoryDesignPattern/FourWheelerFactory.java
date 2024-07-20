public class FourWheelerFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String type) {
        if(type.equals("Car"))
            return new Car();
        else if(type.equals("Bus"))
            return new Bus();
        else{
            System.out.println("Four Wheeler not available");
            return null;
        }
    }
}
