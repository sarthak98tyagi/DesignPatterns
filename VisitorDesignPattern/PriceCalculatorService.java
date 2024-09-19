public class PriceCalculatorService implements RoomService{

    @Override
    public void visit(SingleRoom room) {
        System.out.println("Calculating Price for single room");
        room.price = 2000;
    }

    @Override
    public void visit(DeluxeRoom room) {
        System.out.println("Calculating Price for deluxe room");
        room.price = 5000;
    }

    @Override
    public void visit(PremiumRoom room) {
        System.out.println("Calculating Price for premium room");
        room.price = 10000;
    }
}
