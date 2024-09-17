import java.util.ArrayList;
import java.util.List;

public class ChatEngine {
    private List<User> users;

    public ChatEngine(){
        users = new ArrayList<>();
    }

    public ChatEngine(List<User> user){
        this.users = users;
    }

    public void addUser(User user){
        users.add(user);
    }

    public void sendMessage(User sender, String message, User receiver){
        System.out.println("Sending message from "+sender.getName()+" to "+receiver.getName());
        receiver.receiveMessage(message,sender);
    }

}
