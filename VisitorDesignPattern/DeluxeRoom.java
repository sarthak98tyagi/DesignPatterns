public class DeluxeRoom implements Room{

    int price;

    @Override
    public void accept(RoomService roomService) {
        roomService.visit(this);
    }
}
