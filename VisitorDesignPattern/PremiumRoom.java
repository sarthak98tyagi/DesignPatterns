public class PremiumRoom implements Room{

    int price;

    @Override
    public void accept(RoomService roomService) {
        roomService.visit(this);
    }

}
