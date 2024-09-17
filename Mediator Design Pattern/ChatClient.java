public class ChatClient {

    public static void main(String[] args) {
        ChatEngine chatEngine = new ChatEngine();
        User user1 = new User("Sarthak ",chatEngine);
        User user2 = new User("Shivam", chatEngine);
        chatEngine.addUser(user1);
        chatEngine.addUser(user2);
        user1.sendMessage("Hiiii",user2);
    }
}
