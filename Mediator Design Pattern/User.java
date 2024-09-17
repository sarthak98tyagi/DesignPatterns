public class User {
    private String name;
    private ChatEngine chatEngine;

    public User(String name, ChatEngine chatEngine) {
        this.name = name;
        this.chatEngine = chatEngine;
    }

    public void sendMessage(String message, User receiver){
        chatEngine.sendMessage(this,message,receiver);
    }

    public void receiveMessage(String message, User sender){
        System.out.println("Received message: "+message+" from "+sender.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChatEngine getChatEngine() {
        return chatEngine;
    }

    public void setChatEngine(ChatEngine chatEngine) {
        this.chatEngine = chatEngine;
    }
}
