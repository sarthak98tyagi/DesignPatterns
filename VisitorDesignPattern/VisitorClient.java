public class VisitorClient {

    public static void main(String[] args) {
        Room singleRoom = new SingleRoom();
        Room deluxeRoom = new DeluxeRoom();
        Room premiumRoom = new PremiumRoom();

        RoomService priceService = new PriceCalculatorService();
        RoomService maintenanceService = new MaintenanceService();

        singleRoom.accept(priceService);
        System.out.println("Single Room Charges "+((SingleRoom)singleRoom).price);
        singleRoom.accept(maintenanceService);

        deluxeRoom.accept(priceService);
        System.out.println("Deluxe Room Charges "+((DeluxeRoom)deluxeRoom).price);
        deluxeRoom.accept(maintenanceService);

        premiumRoom.accept(priceService);
        System.out.println("Premium Room Charges "+((PremiumRoom)premiumRoom).price);
        premiumRoom.accept(maintenanceService);
    }
}
