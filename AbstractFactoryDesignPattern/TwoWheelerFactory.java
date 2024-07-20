public class TwoWheelerFactory implements VehicleFactory{


    @Override
    public Vehicle getVehicle(String type) {
        if(type.equals("Bike"))
            return new Bike();
        else if(type.equals("Scooty"))
            return new Scooty();
        else{
            System.out.println("Two Wheeler not available");
            return null;
        }
    }
}
