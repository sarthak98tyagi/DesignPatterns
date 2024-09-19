public class MaintenanceService implements RoomService{
    @Override
    public void visit(SingleRoom room) {
        System.out.println("Maintenance started for single room");
    }

    @Override
    public void visit(DeluxeRoom room) {
        System.out.println("Maintenance started for deluxe room");
    }

    @Override
    public void visit(PremiumRoom room) {
        System.out.println("Maintenance started for premium room");
    }
}
